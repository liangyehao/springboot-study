package com.liang.multicast.mydesignpattern;

/**
 * @author liangyehao
 */
public interface EventMulticaster {

    void multicastEvent(Event event);

    void addListener(Listener listener);

    void removeListener(Listener listener);
}
