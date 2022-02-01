package com.CoffeeForGuests;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MachinesHaveNeeds x = new MachinesHaveNeeds();
        System.out.print("Please Enter Num of Guests : ");
        int num = new Scanner(System.in).nextInt();
        x.setNumOfGuests(num);
        x.makeCoffee();
    }
}
