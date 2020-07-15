package com.liang.multicast.mydesignpattern;

public class WeatherEventMulticaster extends AbstractEventMulticaster {

    @Override
    void afterMulticast(Listener listener) {
        System.out.println("afterMulticast WeatherEventMulticaster");
    }

    @Override
    void beforeMulticast(Listener listener) {
        System.out.println("beforeMulticast WeatherEventMulticaster");
    }

}
