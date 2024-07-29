package com.Homework05;

public class A {
    private String name = "一发居士";
    public void f1(){
        class B{
            private final String NAME = "坤发boy";
            public void show(){
                System.out.println(NAME + name);
            }
        }
        B b = new B();
        b.show();
    }
}
