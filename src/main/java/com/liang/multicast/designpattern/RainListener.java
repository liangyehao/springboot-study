package com.liang.multicast.designpattern;

public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent){
            System.out.println("hello "+event.getWeather());
        }
    }
}
