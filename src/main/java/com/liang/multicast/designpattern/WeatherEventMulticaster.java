package com.liang.multicast.designpattern;

public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    protected void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    protected void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
