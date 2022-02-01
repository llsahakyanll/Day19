package com.Day19;

public abstract class Warrior {
    private String name;
    private String type;
    private double power;
    private static int health = 100;

    public Warrior() {
    }
    public Warrior(String name, String type, double power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void hit();
}
