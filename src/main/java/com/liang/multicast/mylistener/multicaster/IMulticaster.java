package com.liang.multicast.mylistener.multicaster;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.listener.Listener;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:23
 * @content
 */
public interface IMulticaster {

    /**
     * 广播事件
     *
     * @param event 事件
     */
    void multicastEvent(Event event);

    /**
     * 添加监听器
     *
     * @param listener 侦听器
     */
    void addListener(Listener listener);

    /**
     * 删除侦听器
     *
     * @param listener 侦听器
     */
    void removeListener(Listener listener);
}
