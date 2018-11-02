package com.springboot.controller;

/**
 * Created by yangsong on 2018/8/8.
 */
public class MyTest {

     static class a{
       public int i=10;
         public synchronized void aa(){
             i--;
         }
    }

    static class b extends a{
        public synchronized void aa(){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        b bbb=new b();
        bbb.aa();
        System.out.println("哈哈哈哈");
    }
}


