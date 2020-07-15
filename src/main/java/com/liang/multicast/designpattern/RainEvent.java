package com.liang.multicast.designpattern;

public class RainEvent extends WeatherEvent {
    @Override
    String getWeather() {
        return "rain";
    }
}
