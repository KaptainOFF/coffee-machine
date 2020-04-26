package machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private static  final Scanner scanner = new Scanner(System.in);

    public String displayMenu() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        System.out.print(">");
        return scanner.next();
    }

    public String chooseCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
        System.out.print(">");
        return scanner.next();
    }

    public void displayStatus(Machine machine) {
        System.out.println("The coffee machine has:");
        System.out.println(machine.getWater() + " of water");
        System.out.println(machine.getMilk() + " of milk");
        System.out.println(machine.getCoffeeBeans() + " of coffee beans");
        System.out.println(machine.getCups() + " of disposable cups");
        System.out.println(machine.getMoney() + " of money");
    }

    public List<Integer> fillMenu() {
        List<Integer> fillItems = new ArrayList<>();
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print(">");
        fillItems.add(scanner.nextInt());
        System.out.println("Write how many ml of milk do you want to add:");
        System.out.print(">");
        fillItems.add(scanner.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        System.out.print(">");
        fillItems.add(scanner.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        System.out.print(">");
        fillItems.add(scanner.nextInt());
        return fillItems;
    }

    public void takeMoney(Machine machine) {
        System.out.printf("I gave you %d%n", machine.getMoney());
        machine.setMoney(0);
    }
}
