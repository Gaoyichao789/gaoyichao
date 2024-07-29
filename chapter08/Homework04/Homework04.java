package com.Homework04;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Work() {
            @Override
            public void work() {
                System.out.println("啦啦啦 ");
            }
        });
    }
}
