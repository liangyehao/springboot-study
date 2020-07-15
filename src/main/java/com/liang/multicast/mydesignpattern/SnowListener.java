package com.liang.multicast.mydesignpattern;

public class SnowListener extends WeatherListener {


    @Override
    void onWeatherEvent(WeatherEvent weatherEvent) {
        if (weatherEvent instanceof SnowEvent) {
            System.out.println("hello "+weatherEvent.getWeather());
        }
    }
}
