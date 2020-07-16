package com.liang.multicast.mylistener;

import com.liang.multicast.mylistener.event.Event;
import com.liang.multicast.mylistener.event.traffic.SmoothEvent;
import com.liang.multicast.mylistener.event.weather.RainEvent;
import com.liang.multicast.mylistener.event.weather.SnowEvent;
import com.liang.multicast.mylistener.listener.Listener;
import com.liang.multicast.mylistener.listener.traffic.CongestionListener;
import com.liang.multicast.mylistener.listener.traffic.SmoothListener;
import com.liang.multicast.mylistener.listener.weather.RainListener;
import com.liang.multicast.mylistener.listener.weather.SnowListener;
import com.liang.multicast.mylistener.multicaster.IMulticaster;
import com.liang.multicast.mylistener.multicaster.Multicaster;
import com.liang.multicast.mylistener.multicaster.RunMulticaster;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/16 21:56
 * @content
 */
public class Client {
    public static void main(String[] args) {

//        IMulticaster multicaster = new Multicaster();
//
//        Listener snowListener = new SnowListener(),
//                rainListener = new RainListener(),
//                smoothListener = new SmoothListener();
//
//        Event snowEvent = new SnowEvent(),
//                rainEvent = new RainEvent(),
//                smoothEvent = new SmoothEvent();
//
//        multicaster.addListener(snowListener);
//        multicaster.addListener(rainListener);
//        multicaster.addListener(smoothListener);
//
//        multicaster.multicastEvent(snowEvent);
//        multicaster.multicastEvent(rainEvent);
//        multicaster.multicastEvent(smoothEvent);

        RunMulticaster runMulticaster = new RunMulticaster();

        Listener snowListener = new SnowListener(),
        rainListener = new RainListener(),
        smoothListener = new SmoothListener(),
        congestionListener = new CongestionListener();

        runMulticaster.addListener(snowListener);
        runMulticaster.addListener(rainListener);
        runMulticaster.addListener(smoothListener);
        runMulticaster.addListener(congestionListener);

        runMulticaster.snow();
        runMulticaster.rain();
        runMulticaster.smooth();
        runMulticaster.congestion();

    }
}
