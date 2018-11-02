package com.springboot.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yangsong on 2018/8/15.
 */
public class HashMapTest {


    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put("1","1");
        System.out.println(hashMap.get("1"));
        List list=new ArrayList<String>();
        list.add(1,1);
    }

}