package com.liang.multicast.mydesignpattern;

public class Client {

    public static void main(String[] args) {
        WeatherEventMulticaster weatherEventMulticaster = new WeatherEventMulticaster();

        Listener rainListener = new RainListener(),snowListener = new SnowListener();
        Event rainEvent = new RainEvent(), snowEvent = new SnowEvent();

        weatherEventMulticaster.addListener(rainListener);
        weatherEventMulticaster.addListener(snowListener);

        weatherEventMulticaster.multicastEvent(rainEvent);
        weatherEventMulticaster.multicastEvent(snowEvent);

    }
}
