package com.xjh1994.state;

/**
 * Created by Administrator on 2016/9/3.
 */
public class PowerOffState implements TvState {

    @Override
    public void powerOn() {
        System.out.println("power on");
    }

    @Override
    public void powerOff() {

    }

    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
