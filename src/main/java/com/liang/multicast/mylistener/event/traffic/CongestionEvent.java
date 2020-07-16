package com.liang.multicast.mylistener.event.traffic;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 22:28
 * @content
 */
public class CongestionEvent extends TrafficEvent {
    /**
     * 获得流量的名字
     *
     * @return {@link String}
     */
    @Override
    String getTrafficName() {
        return "congestion";
    }
}
