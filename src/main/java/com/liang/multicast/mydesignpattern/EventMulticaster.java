package com.liang.multicast.mydesignpattern;

public interface EventMulticaster {

    void multicastEvent(Event event);

    void addListener(Listener listener);

    void removeListener(Listener listener);
}
