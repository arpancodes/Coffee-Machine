import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400, milk = 540, coffee = 120, cups = 9, money = 550;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        printDetails();

        System.out.println("Write action (buy, fill, take):");
        String option = scanner.nextLine();

        switch (option){
            case "buy": buy(); break;
            case "fill": fill(); break;
            case "take": take(); break;
        }

        printDetails();
//        int waterCup =  waterAvail / water;
//        int milkCup = milkAvail / milk;
//        int coffeeCup = coffeeAvail / coffee;
//
//        int minCups = waterCup < milkCup ? (waterCup < coffeeCup ? waterCup : coffeeCup ) : ( milkCup < coffeeCup ? milkCup : coffeeCup );

//        System.out.println("Write how many cups of coffee you will need:");
//        int cups = scanner.nextInt();
//
//        if(cups == minCups){
//            System.out.println("Yes, I can make that amount of coffee");
//        }
//        else if (cups < minCups){
//            System.out.println("Yes, I can make that amount of coffee (and even " + (minCups - cups) + " more than that)");
//        } else{
//            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
//        }

//        System.out.println(water + " ml of water");
//        System.out.println(milk + " ml of milk");
//        System.out.println(coffee + " g of coffee beans");

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
    }

    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int op = scanner.nextInt();
        switch (op){
            case 1: buyEspresso(); break;
            case 2: buyLatte(); break;
            case 3: buyCappuccino(); break;
        }
    }

    public static void buyEspresso(){
        water -= 250;
        coffee -= 16;
        money += 4;
        cups--;
    }

    public static void buyLatte(){
        water -= 350;
        coffee -= 20;
        milk -= 75;
        money += 7;
        cups--;
    }

    public static void buyCappuccino(){
        water -= 200;
        coffee -= 12;
        milk -= 100;
        money += 6;
        cups--;
    }

    public static void fill (){
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffee += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }

    public static void take(){
        System.out.println("I gave you " + money);
        money = 0;
    }

    public static void printDetails(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
