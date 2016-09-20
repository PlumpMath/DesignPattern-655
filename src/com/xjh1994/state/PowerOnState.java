package com.xjh1994.state;

/**
 * Created by Administrator on 2016/9/3.
 */
public class PowerOnState implements TvState {

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {
        System.out.println("power off");
    }

    @Override
    public void nextChannel() {
        System.out.println("next channel");
    }

    @Override
    public void prevChannel() {
        System.out.println("prev channel");
    }

    @Override
    public void turnUp() {
        System.out.println("turn up");
    }

    @Override
    public void turnDown() {
        System.out.println("turn down");
    }
}
