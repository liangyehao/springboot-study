package com.liang.multicast.designpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulticaster implements EventMulticaster {

    private final List<WeatherListener> listenerList = new ArrayList<>();

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        for (WeatherListener weatherListener : listenerList) {
            weatherListener.onWeatherEvent(event);
        }
        doEnd();
    }

    protected abstract void doStart();

    protected abstract void doEnd();

    @Override
    public void addListener(WeatherListener weatherListener) {
        listenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        listenerList.remove(weatherListener);
    }
}
