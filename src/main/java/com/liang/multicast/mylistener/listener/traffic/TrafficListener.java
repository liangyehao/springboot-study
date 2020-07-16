package com.liang.multicast.mylistener.listener.traffic;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.listener.Listener;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 22:30
 * @content
 */
public abstract class TrafficListener implements Listener {
    /**
     * 监听事件
     *
     * @param event 事件
     */
    @Override
    public void onEvent(Event event) {
        onTrafficEvent(event);
    }

    /**
     * 交通事件
     *
     * @param event 事件
     */
    abstract void onTrafficEvent(Event event);
}
