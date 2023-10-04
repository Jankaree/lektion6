package com.martin.demo;

public class Main {
    public static void main(String[] args) {
        devZero();

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
