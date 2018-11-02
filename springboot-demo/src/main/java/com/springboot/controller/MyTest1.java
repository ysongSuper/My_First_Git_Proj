package com.springboot.controller;

import java.util.Vector;

/**
 * Created by yangsong on 2018/8/14.
 */
public class MyTest1 {

    private String name;
    private int age;

    public MyTest1(){}
    public MyTest1(String n,int a){
        name=n;
        age=a;
    }


    public static void main(String[] args) {
        MyTest1 myTest1=new MyTest1("yangsong",24);
        System.out.print(myTest1.name);
    }


}
