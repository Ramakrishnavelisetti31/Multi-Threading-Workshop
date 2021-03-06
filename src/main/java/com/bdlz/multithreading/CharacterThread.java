package com.bdlz.multithreading;

public class CharacterThread extends Thread {

    public boolean exit = false;
    @Override
    public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        exit = true;
    }
}
