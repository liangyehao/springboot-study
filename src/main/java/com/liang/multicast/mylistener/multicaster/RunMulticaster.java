package com.liang.multicast.mylistener.multicaster;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.event.traffic.CongestionEvent;
import com.liang.multicast.mylistener.event.traffic.SmoothEvent;
import com.liang.multicast.mylistener.event.weather.RainEvent;
import com.liang.multicast.mylistener.event.weather.SnowEvent;
import com.liang.multicast.mylistener.listener.Listener;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 23:32
 * @content
 */
public class RunMulticaster extends AbstractMulticaster {
    /**
     * 广播前
     *
     * @param event    事件
     * @param Listener 天气侦听器
     */
    @Override
    void beforeMulticast(Event event, Listener Listener) {

    }

    /**
     * 广播后
     *
     * @param event    事件
     * @param Listener 天气侦听器
     */
    @Override
    void afterMulticast(Event event, Listener Listener) {

    }

    /**
     * 之前添加天气侦听器
     *
     * @param listener 侦听器
     */
    @Override
    void beforeAddListener(Listener listener) {

    }

    /**
     * 雪
     */
    public void snow(){
        multicastEvent(new SnowEvent());
    }

    /**
     * 雨
     */
    public void rain(){
        multicastEvent(new RainEvent());
    }

    /**
     * 光滑的
     */
    public void smooth(){
        multicastEvent(new SmoothEvent());
    }

    /**
     * 充血
     */
    public void congestion(){
        multicastEvent(new CongestionEvent());
    }
}
