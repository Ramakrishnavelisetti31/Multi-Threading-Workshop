package com.bdlz.observserdesign;

public class Observer2 implements Observer {

    public void onUpdate(String message) {
        System.out.println("message received by observer2 " + message);
    }
}
