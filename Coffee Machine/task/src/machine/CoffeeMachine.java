package machine;

public class CoffeeMachine {
    private static final MainMenu menu = new MainMenu();
    private static final Machine machine = new Machine(400,540,120,9,550);
    public static void main(String[] args) {
        while(true) {
            String choice = menu.displayMenu();
            if (choice.toLowerCase().equals("buy")) {
                String coffeeType = menu.chooseCoffee();
                String coffee = "";
                if (coffeeType.equals("1")) {
                    coffee = machine.makeEspresso();
                } else if (coffeeType.equals("2")) {
                    coffee = machine.makeLatte();
                } else if (coffeeType.equals("3")) {
                    coffee = machine.makeCappuccino();
                } else if (coffeeType.equals("4") || coffeeType.toLowerCase().equals("back")) {
                    continue;
                }
                if(coffee.toLowerCase().equals("coffee")) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    System.out.printf("Sorry, not enough %s!%n", coffee);
                }
            } else if (choice.toLowerCase().equals("fill")) {
                machine.fill(menu.fillMenu());
            } else if (choice.toLowerCase().equals("take")) {
                menu.takeMoney(machine);
            } else if (choice.toLowerCase().equals("remaining")){
                menu.displayStatus(machine);
            } else if (choice.toLowerCase().equals("exit")) {
                break;
            }

        }
    }
}
