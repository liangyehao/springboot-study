package com.liang.multicast.mylistener.listener;

import com.liang.multicast.mylistener.event.Event;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:22
 * @content
 */
public interface Listener {
    /**
     * 监听事件
     *
     * @param event 事件
     */
    void onEvent(Event event);
}
