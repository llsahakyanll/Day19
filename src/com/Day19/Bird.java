package com.Day19;

public class Bird implements flyAble{
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
        System.out.println("Bird is Flying" + "\n" + isFlying());
    }
}
