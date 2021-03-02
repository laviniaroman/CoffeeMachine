package coffee;
import java.util.Scanner;


public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static int money = 550;

    public void machineStatus() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffee + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money:");

    }

    public void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String coffeeType = scanner.nextLine();
        if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }

        if (coffeeType.equals("1")) {
            if (water >= 250 & coffee >= 16) {
                System.out.println("I have enough resources, making you a coffee!");
                water -= 250;
                coffee -= 16;
                cups -= 1;
                money += 4;
            } else {
                System.out.println((water < 250 ? "Sorry, not enough water!" : "Sorry, not enough coffee beans!"));
            }

        } else if (coffeeType.equals("2")) {
            if (water >= 350 & milk >= 75 & coffee >= 20) {
                System.out.println("I have enough resources, making you a coffee!");
                water -= 350;
                milk -= 75;
                coffee -= 20;
                cups -= 1;
                money += 7;

/*            } else if (milk < 75) {
                System.out.println("Sorry, not enough milk!");*/
            } else {
                System.out.println((water < 350 ? "Sorry, not enough water!" : milk < 75 ? "Sorry, not enough milk!" : "Sorry, not enough coffee beans!"));
            }

        } else if (coffeeType.equals("3")) {
            if (water >= 200 & milk >= 100 & coffee >= 12) {
                System.out.println("I have enough resources, making you a coffee!");
                water -= 200;
                milk -= 100;
                coffee -= 12;
                cups -= 1;
                money += 6;

            /*} else if (milk < 100) {
                System.out.println("Sorry, not enough milk!");*/
            } else {
                System.out.println((water < 200 ? "Sorry, not enough water!" : milk < 100 ? "Sorry, not enough milk!" : "Sorry, not enough coffee beans!"));
            }
        }

    }

    public void fillCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int addedWater = scanner.nextInt();
        water += addedWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addedMilk = scanner.nextInt();
        milk += addedMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addedCoffee = scanner.nextInt();
        coffee += addedCoffee;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addedCups = scanner.nextInt();
        cups += addedCups;
    }



}


