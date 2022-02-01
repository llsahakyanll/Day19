package com.EnoughCoffeeForEveryone;

public class CoffeeMachine {
    private int cups = 1;
    private final int maxCups = 50;
    private final int water = 200;
    private final int milk = 50;
    private final int coffee = 15;

    public CoffeeMachine(int cups) {
        this.cups = cups;
    }
    public CoffeeMachine() {
    }

    public void setCups(int cups) {
        this.cups = cups;
    }
    private boolean checkCups(int cups) {
        if (cups >= 1 && cups <= maxCups) {
            return true;
        }
        return false;
    }

    private void error(int n) {
        System.out.println("No, I can make only "+ n +" cup(s) of coffee");
    }
    private void true1(int n) {
        System.out.println("Yes, I can make that amount of coffee (and even " + (maxCups - n) +" more than that)");
    }

    public void makeCoffee() {
        if (checkCups(cups)) {
            true1(cups);
            System.out.println("For " +cups+" cups of coffee you will need:");
            System.out.println(cups * water + " ml of water");
            System.out.println(cups * milk + " ml of milk");
            System.out.println(cups * coffee + " g of coffee beans");
        } else {
            error(cups);
        }
    }
}