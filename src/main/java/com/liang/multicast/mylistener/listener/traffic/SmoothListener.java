package com.liang.multicast.mylistener.listener.traffic;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.event.traffic.SmoothEvent;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 22:31
 * @content
 */
public class SmoothListener extends TrafficListener {
    /**
     * 交通事件
     *
     * @param event 事件
     */
    @Override
    void onTrafficEvent(Event event) {
        if (event instanceof SmoothEvent) {
            System.out.println("the traffic is "+event.getEventName());
        }
    }
}
