package com.xjh1994.state;

/**
 * Created by Administrator on 2016/9/3.
 */
public class TvController implements PowerController {

    TvState mTvState = new PowerOffState();

    public void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    @Override
    public void On() {
        mTvState.powerOn();
        setTvState(new PowerOnState());
    }

    @Override
    public void Off() {
        mTvState.powerOff();
        setTvState(new PowerOffState());
    }

//    @Override
//    public void On() {
//        if (mTvState != null && mTvState instanceof PowerOnState) {
//            return;
//        }
//        setTvState(new PowerOnState());
//        System.out.println("turn on");
//    }
//
//    @Override
//    public void Off() {
//        if (mTvState != null && mTvState instanceof PowerOffState) {
//            return;
//        }
//        setTvState(new PowerOffState());
//        System.out.println("turn off");
//    }

    public void powerOn() {
        mTvState.powerOn();
    }

    public void powerOff() {
        mTvState.powerOff();
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
