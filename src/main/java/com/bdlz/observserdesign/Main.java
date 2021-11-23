package com.bdlz.observserdesign;

public class Main {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();
        Observer4 observer4 = new Observer4();
        Subject subject = new Subject();

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);
        subject.register(observer4);
        subject.upDate("Hii Observer");
    }
}
