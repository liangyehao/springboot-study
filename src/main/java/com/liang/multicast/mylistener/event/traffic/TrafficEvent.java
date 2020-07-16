package com.liang.multicast.mylistener.event.traffic;

import com.liang.multicast.mylistener.event.Event;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 22:26
 * @content
 */
public abstract class TrafficEvent implements Event {
    /**
     * 得到事件名
     *
     * @return {@link String}
     */
    @Override
    public String getEventName() {
        return getTrafficName();
    }

    /**
     * 获得流量的名字
     *
     * @return {@link String}
     */
    abstract String getTrafficName();
}
