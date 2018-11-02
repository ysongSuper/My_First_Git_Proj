package com.springboot.controller;

import org.hibernate.stat.internal.ConcurrentEntityStatisticsImpl;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by yangsong on 2018/8/22.
 */
public class QueueTest {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> q=new ConcurrentLinkedQueue<String>();
        q.offer("a");
        System.out.println(q.poll());
    }

}
