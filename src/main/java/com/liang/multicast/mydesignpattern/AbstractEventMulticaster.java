package com.liang.multicast.mydesignpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulticaster implements EventMulticaster {

    List<Listener> listeners = new ArrayList<>();

    @Override
    public void multicastEvent(Event event) {
        listeners.forEach(
                listener->{
                    beforeMulticast(listener);
                    listener.onEvent(event);
                    afterMulticast(listener);
                }
        );
    }

    abstract void afterMulticast(Listener listener);

    abstract void beforeMulticast(Listener listener);

    @Override
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }
}
