package com.liang.multicast.designpattern;

public class Client {
    public static void main(String[] args) {
        // 定义广播器
        WeatherEventMulticaster weatherEventMulticaster = new WeatherEventMulticaster();
        // 定义监听器
        WeatherListener snowListener = new SnowListener(),rainListener = new RainListener();
        // 定义事件
        WeatherEvent snowEvent = new SnowEvent(),rainEvent = new RainEvent();
        // 添加监听器
        weatherEventMulticaster.addListener(snowListener);
        weatherEventMulticaster.addListener(rainListener);
        // 广播事件
        weatherEventMulticaster.multicastEvent(snowEvent);
        System.out.println();
        weatherEventMulticaster.multicastEvent(rainEvent);
        System.out.println("-----------");
        // 测试移除
        weatherEventMulticaster.removeListener(rainListener);
        weatherEventMulticaster.multicastEvent(snowEvent);
        System.out.println();
        weatherEventMulticaster.multicastEvent(rainEvent);

    }
}
