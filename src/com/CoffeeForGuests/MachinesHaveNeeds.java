package com.CoffeeForGuests;

public class MachinesHaveNeeds {
    private int numOfGuests = 1;
    private int water = 200;
    private int milk = 50;
    private int coffee = 15;

    public MachinesHaveNeeds(int numOfGuests){
        if (numOfGuests >= 0) {
            this.numOfGuests = numOfGuests;
        }
    }
    public MachinesHaveNeeds(){}

    public void setNumOfGuests(int numOfGuests) {
        if (numOfGuests >= 0) {
            this.numOfGuests = numOfGuests;
        }
    }

    public void makeCoffee() {
        System.out.println("For " +numOfGuests+" cups of coffee you will need:");
        System.out.println(numOfGuests * water + " ml of water");
        System.out.println(numOfGuests * milk + " ml of milk");
        System.out.println(numOfGuests * coffee + " g of coffee beans");
    }
}
