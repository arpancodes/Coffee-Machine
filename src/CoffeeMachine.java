import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 200, milk = 50, coffee = 15;

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterAvail = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkAvail = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeAvail = scanner.nextInt();

        int waterCup =  waterAvail / water;
        int milkCup = milkAvail / milk;
        int coffeeCup = coffeeAvail / coffee;

        int minCups = waterCup < milkCup ? (waterCup < coffeeCup ? waterCup : coffeeCup ) : ( milkCup < coffeeCup ? milkCup : coffeeCup );

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        if(cups == minCups){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (cups < minCups){
            System.out.println("Yes, I can make that amount of coffee (and even " + (minCups - cups) + " more than that)");
        } else{
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
        }

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
}
