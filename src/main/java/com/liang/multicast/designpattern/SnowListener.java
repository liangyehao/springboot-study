package com.liang.multicast.designpattern;

public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent){
            System.out.println("hello "+event.getWeather());
        }
    }
}
