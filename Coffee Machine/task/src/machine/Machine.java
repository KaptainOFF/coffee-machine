package machine;

import java.util.List;

public class Machine {

    private int water = 0;
    private int milk = 0;
    private int coffeeBeans = 0;
    private int cups = 0;
    private int money = 0;

    public String makeLatte() {
        return makeCoffee(350, 75, 20, 7);
    }

    public String makeEspresso() {
        return makeCoffee(250, 0, 16, 4);
    }

    public String makeCappuccino() {
        return makeCoffee(200, 100, 12, 6);
    }

    private String makeCoffee(int water, int milk, int coffeeBeans, int money) {
        String result = "";
        if(this.water < water) {
            result = "water";
        } else if (this.milk < milk) {
            result = "milk";
        } else if (this.coffeeBeans < coffeeBeans) {
            result = "coffee beans";
        } else if (cups < 1) {
            result = "cups";
        } else {
            this.water -= water;
            this.milk -= milk;
            this.coffeeBeans -= coffeeBeans;
            cups--;
            this.money += money;
            result = "coffee";
        }
        return result;
    }

    public void fill(List<Integer> itemsToFill) {
        water += itemsToFill.get(0);
        milk += itemsToFill.get(1);
        coffeeBeans += itemsToFill.get(2);
        cups += itemsToFill.get(3);
    }

    public Machine(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
