package com.bdlz.observserdesign;

public class Observer4 implements Observer {

    public void onUpdate(String message) {
        System.out.println("message received by observer4 " + message);
    }
}
