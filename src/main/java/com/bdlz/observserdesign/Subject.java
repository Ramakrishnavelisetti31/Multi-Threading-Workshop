package com.bdlz.observserdesign;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList = new ArrayList();

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void upDate(String message) {
        observerList.stream().forEach(observer -> observer.onUpdate(message));
    }
}
