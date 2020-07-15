package com.liang.multicast.mydesignpattern;

public abstract class WeatherListener implements Listener {
    @Override
    public void onEvent(Event event) {
       onWeatherEvent((WeatherEvent)event);
    }

    abstract void onWeatherEvent(WeatherEvent weatherEvent);
}
