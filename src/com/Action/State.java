package com.Action;

public class State {
    private int cache = 550;
    private int water = 400;
    private int milk = 540;
    private int coffee = 120;
    private int cups = 9;

    public int getCache() {
        return cache;
    }
    public void setCache(int cache) {
        this.cache = cache;
    }

    public int getWater() {
        return water;
    }
    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }
    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }
}
