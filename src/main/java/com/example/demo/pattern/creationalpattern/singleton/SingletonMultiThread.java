package com.example.demo.pattern.creationalpattern.singleton;

import java.util.Objects;

public class SingletonMultiThread {
    private static SingletonMultiThread instance;

    private SingletonMultiThread() {}

    /**
     * Singleton locking block. Only check instance is null
     * @return
     */
    public static SingletonMultiThread getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SingletonMultiThread();
        }
        return instance;
    }

    /**
     * Double check instance is null
     * To prevent this from multiple threads, double-checking logic should be used here.
     * @param
     */
    public static SingletonMultiThread getInstanceDoublecheck() {
        if (Objects.isNull(instance)) {
            synchronized (SingletonMultiThread.class) {
                if(Objects.isNull(instance)) {
                    instance = new SingletonMultiThread();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonMultiThread obj1 = SingletonMultiThread.getInstance();
        SingletonMultiThread obj2 = SingletonMultiThread.getInstance();
        SingletonMultiThread obj3 = SingletonMultiThread.getInstance();

        /**
         * Observe the output and all objects are having the same memory address and hashcodes.
         * So, It is creating always single objects.
         */
        System.out.println("obj1 " + obj1.hashCode());
        System.out.println("obj2 " + obj2.hashCode());
        System.out.println("obj3 " + obj3.hashCode());
    }
}
