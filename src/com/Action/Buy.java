package com.Action;

import java.util.Locale;
import java.util.Scanner;

public class Buy {
    private static char ch = 'a';
    static MakeCoffee x = new Espresso();

    private static void objReference() {
        if (ch == 'a') {
            x = new Espresso();
        } else if (ch == 'b') {
            x = new Latte();
        } else if (ch == 'c') {
            x = new Cappuccino();
        } else {
            System.out.println("Error!" + "\n You Must Input a or b or c");
        }
    }

    public static void work() {
        System.out.println("For Espresso Enter a");
        System.out.println("For Latte Enter b");
        System.out.println("For Cappuccino Enter c");
        System.out.print("Please Enter Char : ");
        String str = new Scanner(System.in).next();
        ch = str.toLowerCase(Locale.ROOT).charAt(0);
    }

    public static void buy() {
        objReference();
        x.makeCoffee();
    }

    public static void fill() {
        objReference();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Litre of Milk : ");
        int milk = scanner.nextInt();
        System.out.println();
        System.out.print("Enter Litre of Watter : ");
        int watter = scanner.nextInt();
        System.out.println();
        System.out.print("Enter Gram of Coffee : ");
        int coffee = scanner.nextInt();
        System.out.println();
        System.out.print("Enter quantity of Cups : ");
        int cups = scanner.nextInt();
        x.fill(milk, watter, coffee, cups);
    }
    public static void take(){
        objReference();
        x.take();
    }
    public static void state(){
        objReference();
        x.state();
    }
}
