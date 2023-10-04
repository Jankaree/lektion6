package com.martin.demo;

public class Main {
    public static void main(String[] args) {

        int forlooper = 0;

        for (int i = 0; i < 10; i++) {

            forlooper += i;
        }

    }

    public static void devZero(){

        try{
            System.out.println(2/0);
        }catch (Exception error){
            error.printStackTrace();
        }

        System.out.println("after crash");

    }
}
