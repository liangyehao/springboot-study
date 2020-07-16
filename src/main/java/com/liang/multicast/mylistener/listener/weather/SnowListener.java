package com.liang.multicast.mylistener.listener.weather;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.event.weather.SnowEvent;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:34
 * @content
 */
public class SnowListener extends WeatherListener {
    /**
     * 在天气事件
     *
     * @param event 事件
     */
    @Override
    void onWeatherEvent(Event event) {
        if (event instanceof SnowEvent){
            System.out.println("the weather is "+event.getEventName());
        }
    }
}
