package com.Day19;

public class SwordsMen extends Warrior{
    private int swordHealth;

    public SwordsMen(String name, String type, double power, int swordHealth) {
        super(name, type, power);
        this.swordHealth = swordHealth;
    }
    public SwordsMen() {
        super();
    }

    @Override
    public void hit() {

    }
}
