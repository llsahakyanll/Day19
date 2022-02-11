package com.Warrior;

import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void work() {
        Scanner scanner = new Scanner(System.in);
        RollingDie die = new RollingDie(10);
        Warrior warrior = new Warrior("SwordMan", 100, 20, 10, die);
        Warrior enemy = new Warrior("Shooter", 60, 18, 15, die);
        System.out.println("For SwordMan Attack Enter --- a");
        System.out.println("For SwordMan Defend Enter --- b");
        System.out.println("For Shooter Attack Enter --- c");
        System.out.println("For SwordMan Defend Enter --- d");
        System.out.println("For Message Enter --- m");
        System.out.println();
        char ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
        while (ch != 'e') {
            System.out.println(warrior.healthBar());
            System.out.println(enemy.healthBar());
            switch (ch) {
                case 'a':
                    if (enemy.alive()) {
                        warrior.attack(enemy);
                        ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
                    } else {
                        ch = 'e';
                    }
                    break;
                case 'b':
                    if (enemy.alive()) {
                        warrior.defend(10);
                        ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
                    } else {
                        ch = 'e';
                    }
                    break;
                case 'c':
                    if (warrior.alive()) {
                        enemy.attack(warrior);
                        ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
                    } else {
                        ch = 'e';
                    }
                    break;
                case 'd':
                    if (warrior.alive()) {
                        enemy.defend(15);
                        ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
                    } else {
                        ch = 'e';
                    }
                    break;
                case 'm':
                    System.out.println(enemy.getLastMessage());
                    System.out.println(warrior.getLastMessage());
                    ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
                    break;
                default:
                    ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
            }

        }

    }
}
