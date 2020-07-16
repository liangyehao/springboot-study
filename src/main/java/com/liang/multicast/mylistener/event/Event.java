package com.liang.multicast.mylistener.event;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:22
 * @content
 */
public interface Event {
    /**
     * 得到事件名
     *
     * @return {@link String}
     */
    String getEventName();
}
