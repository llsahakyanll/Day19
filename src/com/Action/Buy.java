package com.Action;

import java.util.Locale;
import java.util.Scanner;

public class Buy {
    private static char ch = 'a';

    public static void ask() {
        System.out.println("For Espresso Enter a \n For Latte Enter b \n For Cappuccino Enter c");
        System.out.println("Please Enter Char : ");
        String str = new Scanner(System.in).next();
        ch = str.toLowerCase(Locale.ROOT).charAt(0);
    }
    public static void buy() {
        if (ch == 'a') {
            Espresso espresso = new Espresso();
            espresso.check();
        } else if(ch == 'b') {
            Latte latte = new Latte();
        } else if(ch == 'c') {
            Cappuccino cappuccino = new Cappuccino();
        } else {
            System.out.println("Error!" +"\n You Must Input a or b or c");
        }
    }
}
