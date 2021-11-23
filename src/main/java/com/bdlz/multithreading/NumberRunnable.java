package com.bdlz.multithreading;

public class NumberRunnable implements Runnable {
    private CharacterThread characterThread;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (characterThread.exit) {
                break;
            } else {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
