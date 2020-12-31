import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400, milk = 540, coffee = 120, cups = 9, money = 550;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String option = "";
        do{
            option = scanner.nextLine();
            switch (option){
                case "buy": buy(); break;
                case "fill": fill(); break;
                case "take": take(); break;
                case "remaining": printDetails(); break;
                case "exit": break;
            }
        } while(!option.equals("exit"));
    }

    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String op = scanner.nextLine();
        switch (op){
            case "1": buyEspresso(); break;
            case "2": buyLatte(); break;
            case "3": buyCappuccino(); break;
            case "back": break;
        }
    }

    public static void buyEspresso(){
        if (water < 250) System.out.println("Sorry, not enough water!");
        else if (coffee < 16) System.out.println("Sorry, not enough coffee!");
        else if (cups < 1) System.out.println("Sorry, not enough cups!");
        else{
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            coffee -= 16;
            money += 4;
            cups--;
        }
    }

    public static void buyLatte(){
        if (water < 350) System.out.println("Sorry, not enough water!");
        else if (milk < 75) System.out.println("Sorry, not enough milk!");
        else if (coffee < 20) System.out.println("Sorry, not enough coffee!");
        else if (cups < 1) System.out.println("Sorry, not enough cups!");
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            coffee -= 20;
            milk -= 75;
            money += 7;
            cups--;
        }
    }

    public static void buyCappuccino(){
        if (water < 200) System.out.println("Sorry, not enough water!");
        else if (milk < 100) System.out.println("Sorry, not enough milk!");
        else if (coffee < 12) System.out.println("Sorry, not enough coffee!");
        else if (cups < 1) System.out.println("Sorry, not enough cups!");
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            coffee -= 12;
            milk -= 100;
            money += 6;
            cups--;
        }
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
        System.out.println("$" + money + " of money");
    }
}
