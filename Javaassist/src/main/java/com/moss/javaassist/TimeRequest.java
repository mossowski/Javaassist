package com.moss.javaassist;

public class TimeRequest {

    public void doSomething(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
