package com.company;

import java.util.Scanner;

public class Main {

    public static int ChickenLegs(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        return input.nextInt();
    }
    public static int CowLegs() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many cows do you have?");
        return input.nextInt();
    }
    public static int PigLegs() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pigs do you have?");
        return input.nextInt();
    }

    public static void main(String[] args) {
        int pig = 4;
        int chicken = 2;
        int cows = 4;
        System.out.println("Your total number of legs is " + ((ChickenLegs()*pig) + (CowLegs()*cows) + (PigLegs()*chicken)));
    }
}
