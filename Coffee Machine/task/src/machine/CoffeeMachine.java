
package machine;
import java.util.*;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        forNow.chooseAction();
    }

    static class forNow {
        static int water = 400;
        static int milk = 540;
        static int coffeeBeans = 120;
        static int cups = 9;
        static int startMoney = 550;


        public static void chooseAction() {

            boolean stayOrExit = true;

            while (stayOrExit == true) {
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                Scanner sc = new Scanner(System.in);
                String action = sc.nextLine();
                if (action.equals("buy")) {
                    buyAction();
                } else if (action.equals("fill")) {
                    fillAction();
                } else if (action.equals("take")) {
                    takeAction();
                } else if (action.equals("remaining")) {
                    remainingAction();
                } else if (action.equals("exit")) {
                    stayOrExit = false;
                    System.exit(0);
                }
            }
        }

        public static void buyAction() {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            Scanner sc = new Scanner(System.in);
            String kindOfCoffee = sc.nextLine();
            if (kindOfCoffee.equals("1")) {
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    chooseAction();
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    chooseAction();
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    chooseAction();
                }
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 250;
                coffeeBeans = coffeeBeans - 16;
                startMoney = startMoney + 4;
                cups = cups - 1;

            } else if (kindOfCoffee.equals("2")) {
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    chooseAction();
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    chooseAction();
                } else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    chooseAction();
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    chooseAction();
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
                    chooseAction();
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    chooseAction();
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    chooseAction();
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    chooseAction();
                }
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 200;
                milk = milk - 100;
                coffeeBeans = coffeeBeans - 12;
                startMoney = startMoney + 6;
                cups = cups - 1;
            } else if (kindOfCoffee.equals("back")) {
                chooseAction();
            }
        }
        public static void fillAction() {
            Scanner sc = new Scanner(System.in);
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

        }

        public static void takeAction() {
            System.out.printf("I gave you %d$\n", startMoney);
            startMoney = 0;
        }

        public static void remainingAction() {
            System.out.printf("The coffee machine has:\n" +
                    "%d ml of water\n" +
                    "%d ml of milk\n" +
                    "%d g of coffee beans\n" +
                    "%d disposable cups\n" +
                    "$%d of money\n", water, milk, coffeeBeans, cups, startMoney);
        }
    }
}

















