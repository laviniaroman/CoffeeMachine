package coffee;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine obj = new CoffeeMachine();
        boolean flag = true;

        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    obj.buyCoffee();
                    break;
                case "fill":
                    obj.fillCoffee();
                    break;
                case "take":
                    System.out.println(" I gave you $" + obj.money);
                    obj.money = 0;
                    break;
                case "remaining":
                    obj.machineStatus();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        }

    }
}
