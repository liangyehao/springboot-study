package com.liang.multicast.mylistener.event.weather;

import com.liang.multicast.mylistener.event.Event;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:28
 * @content
 */
public abstract class WeatherEvent implements Event {
    /**
     * 得到事件名
     *
     * @return {@link String}
     */
    @Override
    public String getEventName() {
        return getWeatherName();
    }

    /**
     * 获得天气的名字
     *
     * @return {@link String}
     */
    abstract String getWeatherName();
}
