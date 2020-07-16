package com.liang.multicast.mylistener.multicaster;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.listener.Listener;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 23:23
 * @content
 */
public class Multicaster extends AbstractMulticaster {
    /**
     * 广播前
     *
     * @param event    事件
     * @param Listener 天气侦听器
     */
    @Override
    void beforeMulticast(Event event, Listener Listener) {
//        System.out.println("--------开始广播--------");
    }

    /**
     * 广播后
     *
     * @param event    事件
     * @param Listener 天气侦听器
     */
    @Override
    void afterMulticast(Event event, Listener Listener) {
//        System.out.println("--------结束广播--------");
    }

    /**
     * 之前添加天气侦听器
     *
     * @param listener 侦听器
     */
    @Override
    void beforeAddListener(Listener listener) {
//        System.out.println("--------添加监听器--------");
    }
}
