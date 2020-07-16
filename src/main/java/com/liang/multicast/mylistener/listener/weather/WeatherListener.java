package com.liang.multicast.mylistener.listener.weather;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.listener.Listener;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:32
 * @content
 */
public abstract class WeatherListener implements Listener {
    /**
     * 监听事件
     *
     * @param event 事件
     */
    @Override
    public void onEvent(Event event) {
        onWeatherEvent(event);
    }

    /**
     * 在天气事件
     *
     * @param event 事件
     */
    abstract void onWeatherEvent(Event event);
}
