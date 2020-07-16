package com.liang.multicast.mylistener.listener.weather;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.event.weather.RainEvent;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:37
 * @content
 */
public class RainListener extends WeatherListener {
    /**
     * 在天气事件
     *
     * @param event 事件
     */
    @Override
    void onWeatherEvent(Event event) {
        if (event instanceof RainEvent) {
            System.out.println("the weather is "+event.getEventName());
        }
    }
}
