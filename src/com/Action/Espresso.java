package com.Action;

public class Espresso extends State{
    private final int coffeeForOneCup = 16;
    private final int waterForOneCup = 250;
    private final int milkForOneCup = 0;
    private final int cacheForOneCup = 4;
    public void check() {
        if (super.getCoffee() >= coffeeForOneCup && super.getWater() >= waterForOneCup && super.getMilk() >= milkForOneCup && super.getCups() >= 1) {
            setCoffee(getCoffee() - coffeeForOneCup);
            setWater(getWater() - waterForOneCup);
            setCache(getCache() + cacheForOneCup);
            setCups(getCups() - 1);
        }
    }
}
