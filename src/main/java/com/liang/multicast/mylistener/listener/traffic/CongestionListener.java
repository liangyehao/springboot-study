package com.liang.multicast.mylistener.listener.traffic;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.event.traffic.CongestionEvent;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 22:34
 * @content
 */
public class CongestionListener extends TrafficListener {
    /**
     * 交通事件
     *
     * @param event 事件
     */
    @Override
    void onTrafficEvent(Event event) {
        if (event instanceof CongestionEvent) {
            System.out.println("the traffic is "+event.getEventName());
        }
    }
}
