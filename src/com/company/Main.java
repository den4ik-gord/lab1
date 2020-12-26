package com.company;
public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        int CheeseAm = 0, AppleAm = 0, BurgerAm = 0;
        Cheese Ch = new Cheese();
        Burger Bu = new Burger(null);
        Apple Ap = new Apple(null);
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Burger")) {
                breakfast[itemsSoFar] = new Burger(parts[1]);
            }
            itemsSoFar++;
        }
        System.out.println("amount of products");
        for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(Ch)) {
                    CheeseAm++;
                } else if (breakfast[i].equals(Ap)) {
                    AppleAm++;
                } else if (breakfast[i].equals(Bu)) {
                    BurgerAm++;
                }
            } else break;
        }
        System.out.println("Amount of apples is " + AppleAm + ", Amount of cheese is " + CheeseAm + ", Amount of burgers is " + BurgerAm + "");
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else break;
        }
        System.out.println("Have a nice day!");
    }
}