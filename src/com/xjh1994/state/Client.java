package com.xjh1994.state;

/**
 * Created by Administrator on 2016/9/3.
 */
public class Client {

    public static void main(String[] args) {
        TvController controller = new TvController();
        controller.On();
        controller.On();
        controller.nextChannel();
        controller.turnUp();
        controller.Off();
        controller.Off();
        controller.turnUp();
        controller.On();
        controller.prevChannel();
    }
}
