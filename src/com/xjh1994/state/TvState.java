package com.xjh1994.state;

/**
 * Created by Administrator on 2016/9/3.
 */
public interface TvState {
    void powerOn();
    void powerOff();
    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}
