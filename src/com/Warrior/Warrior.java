package com.Warrior;

public class Warrior {
    private String name;
    private int health;
    private int maxHealth;
    private int damage;
    private int defense;
    private RollingDie die;
    private String message;

    public Warrior(String name, int health, int damage, int defense, RollingDie die) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.defense = defense;
        this.die = die;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean alive() {
        return (health > 0);
    }

    public String healthBar() {
        StringBuilder s = new StringBuilder("[");
        int total = 20;
        double count = Math.round(((double)health / maxHealth) * total);
        if ((count == 0) && (alive())) {
            count = 1;
        }
        for (int i = 0; i < count; i++) {
            s.append("#");
        }
        for (int i = 0; i < total - count; i++) {
            s.append(" ");
        }
        s.append("]");
        return  "Health: " + this.name + " ---- " + s;
    }

    public void attack(Warrior enemy) {
        int hit = damage + die.roll();
        setMessage(name + " attacks with a hit worth " + hit + " hp");
        enemy.defend(hit);
    }

    public void defend(int hit) {
        int injury = hit - (defense + die.roll());
        if (injury > 0) {
            health -= injury;
            message = name + " defended against the attack but still lost " + injury + " hp";
            if (health <= 0) {
                health = 0;
                message += " and died";
            }

        } else
            message = name + " blocked the hit";
        setMessage(message);
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public String getLastMessage() {
        return message;
    }
}
