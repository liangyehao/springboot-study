package com.liang.multicast.mylistener.event.weather;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:31
 * @content
 */
public class RainEvent extends WeatherEvent {
    /**
     * 获得天气的名字
     *
     * @return {@link String}
     */
    @Override
    String getWeatherName() {
        return "rain";
    }
}
