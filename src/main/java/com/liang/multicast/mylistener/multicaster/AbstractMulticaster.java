package com.liang.multicast.mylistener.multicaster;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.listener.Listener;
import com.liang.multicast.mylistener.multicaster.Multicaster;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:39
 * @content
 */
public abstract class AbstractMulticaster implements IMulticaster {

    private List<Listener> listenerList = new ArrayList<>();


    /**
     * 广播事件
     *
     * @param event 事件
     */
    @Override
    public void multicastEvent(Event event) {
        for (Listener Listener : listenerList) {
            beforeMulticast(event,Listener);
            Listener.onEvent(event);
            afterMulticast(event,Listener);
        }
    }



    /**
     * 广播前
     *
     * @param event           事件
     * @param Listener 天气侦听器
     */
    abstract void beforeMulticast(Event event, Listener Listener);

    /**
     * 广播后
     *
     * @param event           事件
     * @param Listener 天气侦听器
     */
    abstract void afterMulticast(Event event, Listener Listener);




    /**
     * 添加监听器
     *
     * @param listener 侦听器
     */
    @Override
    public void addListener(Listener listener) {
        beforeAddListener(listener);
        listenerList.add(listener);
    }



    /**
     * 之前添加天气侦听器
     *
     * @param listener 侦听器
     */
    abstract void beforeAddListener(Listener listener);

    /**
     * 删除侦听器
     *
     * @param listener 侦听器
     */
    @Override
    public void removeListener(Listener listener) {
        listenerList.remove(listener);
    }
}
