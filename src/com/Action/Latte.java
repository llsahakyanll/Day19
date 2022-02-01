package com.Action;

public class Latte extends State{
    private final int coffeeForOneCup = 20;
    private final int waterForOneCup = 350;
    private final int milkForOneCup = 75;
    private final int cacheForOneCup = 7;
    public void check() {
        if (super.getCoffee() >= coffeeForOneCup && super.getWater() >= waterForOneCup && super.getMilk() >= milkForOneCup && super.getCups() >= 1) {
            setCoffee(getCoffee() - coffeeForOneCup);
            setWater(getWater() - waterForOneCup);
            setCache(getCache() + cacheForOneCup);
            setCups(getCups() - 1);
        }
    }
}
