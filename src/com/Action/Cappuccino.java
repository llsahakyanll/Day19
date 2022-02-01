package com.Action;

public class Cappuccino extends State{
    private final int coffeeForOneCup = 12;
    private final int waterForOneCup = 200;
    private final int milkForOneCup = 100;
    private final int cacheForOneCup = 6;
    public void check() {
        if (super.getCoffee() >= coffeeForOneCup && super.getWater() >= waterForOneCup && super.getMilk() >= milkForOneCup && super.getCups() >= 1) {
            setCoffee(getCoffee() - coffeeForOneCup);
            setWater(getWater() - waterForOneCup);
            setCache(getCache() + cacheForOneCup);
            setCups(getCups() - 1);
        }
    }
}
