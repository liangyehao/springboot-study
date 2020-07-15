package com.liang.multicast.mydesignpattern;

public class RainListener extends WeatherListener {

    @Override
    void onWeatherEvent(WeatherEvent weatherEvent) {
        if (weatherEvent instanceof RainEvent) {
            System.out.println("hello "+weatherEvent.getWeather());
        }
    }
}
