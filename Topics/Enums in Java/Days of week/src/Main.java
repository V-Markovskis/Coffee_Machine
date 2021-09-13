package machine;
import java.util.*;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int startMoney = 550;

        boolean stayOrExit = true;

        while (stayOrExit == true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();

            switch (action) {
                case "remaining":
                    System.out.printf("The coffee machine has:\n" +
                            "%d ml of water\n" +
                            "%d ml of milk\n" +
                            "%d g of coffee beans\n" +
                            "%d disposable cups\n" +
                            "$%d of money\n", water, milk, coffeeBeans, cups, startMoney);
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String kindOfCoffee = sc.nextLine();
                    if (kindOfCoffee.equals("1")) {
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (coffeeBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                            break;
                        }
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 250;
                        coffeeBeans = coffeeBeans - 16;
                        startMoney = startMoney + 4;
                        cups = cups - 1;

                    } else if (kindOfCoffee.equals("2")) {
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (coffeeBeans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                            break;
                        }
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 350;
                        milk = milk - 75;
                        coffeeBeans = coffeeBeans - 20;
                        startMoney = startMoney + 7;
                        cups = cups - 1;
                    } else if (kindOfCoffee.equals("3")) {
                        if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (coffeeBeans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                            break;
                        }
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 200;
                        milk = milk - 100;
                        coffeeBeans = coffeeBeans - 12;
                        startMoney = startMoney + 6;
                        cups = cups - 1;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int waterToAdd = sc.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int milkToAdd = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int coffeeToAdd = sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int cupsToAdd = sc.nextInt();

                    water = water + waterToAdd;
                    milk = milk + milkToAdd;
                    coffeeBeans = coffeeBeans + coffeeToAdd;
                    cups = cups + cupsToAdd;


                    break;
                case "take":
                    System.out.printf("I gave you %d\n", startMoney);
                    startMoney = 0;
                    break;
                case "exit":
                    stayOrExit = false;
            }
        }
    }
}