package com.Day19;

public class Airplane implements flyAble{
    private boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }
    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void fly() {
        setFlying(true);
        System.out.println("Airplane is Flying" + "\n" + isFlying());
    }
}
