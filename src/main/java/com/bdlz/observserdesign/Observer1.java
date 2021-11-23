package com.bdlz.observserdesign;

public class Observer1 implements Observer {

    public void onUpdate(String message) {
        System.out.println("message received by observer1 " + message);
    }
}
