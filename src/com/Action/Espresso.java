package com.Action;

import java.util.Scanner;

public class Espresso extends MakeCoffee{
    private final int coffeeForOneCup = 16;
    private final int waterForOneCup = 250;
    private final int milkForOneCup = 0;
    private final int cacheForOneCup = 4;

    static class State {
        static int cache1 = 550;
        static int water1 = 400;
        static int milk1 = 540;
        static int coffee1 = 120;
        static int cups1 = 9;
    };

    @Override
    public void makeCoffee() {
        if (check()) {
            State.water1 -= waterForOneCup;
            State.milk1 -= milkForOneCup;
            State.coffee1 -= coffeeForOneCup;
            State.cups1 -= 1;
            State.cache1 += cacheForOneCup;
        } else {
            System.out.println("Error!");
        }
    }
    @Override
    public void state() {
        System.out.println("Cache is : " + State.cache1);
        System.out.println("Coffee is : " + State.coffee1);
        System.out.println("Water is : " + State.water1);
        System.out.println("Milk is : " + State.milk1);
        System.out.println("Cups is : " + State.cups1);
    }

    @Override
    public boolean staff() {
        System.out.print("Please Enter PIN : ");
        String str = new Scanner(System.in).next();
        if (str.equals("1111")) {
            return true;
        } else {
            System.out.println("Error! --- PIN was Wrong");
            return false;
        }
    }

    @Override
    public void take() {
        if (staff()) {
            System.out.println(State.cache1);
            State.cache1 = 0;
        }
    }

    @Override
    public void fill(int milk, int watter, int coffee, int cups) {
        if (staff()) {
            State.cups1 += cups;
            State.milk1 += milk;
            State.water1 += watter;
            State.coffee1 += coffee;
        }
    }

    @Override
    public boolean check() {
        return State.coffee1 >= coffeeForOneCup && State.water1 >= waterForOneCup && State.milk1 >= milkForOneCup && State.cups1 >= 1;
    }
}
