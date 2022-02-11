package com.Warrior;

public class Main {
    public static void main(String[] args) {
//        Loop.work();

        RollingDie die = new RollingDie(10);
        Warrior warrior = new Warrior("SwordMan", 100, 20, 10, die);
        Warrior enemy = new Warrior("Shooter", 60, 18, 15, die);

        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        enemy.attack(warrior);
        warrior.attack(enemy);
        warrior.attack(enemy);
        warrior.attack(enemy);
        warrior.attack(enemy);
        warrior.attack(enemy);
        warrior.attack(enemy);
        warrior.attack(enemy);

        System.out.println(enemy.getLastMessage());
        System.out.println(warrior.getLastMessage());

        System.out.println(warrior.healthBar());
        System.out.println(enemy.healthBar());
    }
}
