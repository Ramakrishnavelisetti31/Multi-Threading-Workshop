package com.bdlz.observserdesign;

public class Observer3 implements Observer {

    public void onUpdate(String message) {
        System.out.println("message received by observer3 " + message);
    }
}
