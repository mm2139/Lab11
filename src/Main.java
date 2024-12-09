import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.addAll(Arrays.asList("Milk", "Flour", "Eggs", "Tomatoes", "Sugar", "Coffee", "Salt", "Rice"));

        Scanner scan = new Scanner(System.in);

        String userChoice = "";

        boolean quit = false;

    do {
        System.out.println("Options: \n" +
                "A – Add an item to the list \n" +
                "D – Delete an item from the list \n" +
                "P – Print the list\n" +
                "Q – Quit the program\n");

        userChoice = InputHelper.getRegEx(scan, "Choose an option from the menu.", "[AaDdPpQq]");

        if (userChoice.equalsIgnoreCase("A")) {

            } else if (userChoice.equalsIgnoreCase("D")) {

            } else if (userChoice.equalsIgnoreCase("P")) {

            } else if (userChoice.equalsIgnoreCase("Q"));
                quit = Quit(scan);
    } while (!quit);

    }

public static void Delete(Scanner scan) {
        int num = InputHelper.getRangedInt(scan, "What is the index of the item you would like to remove from the list?", 0, ingredients.size());
    }

    public static boolean Quit(Scanner scan) {

        boolean confirm = false;

        do {
            System.out.println("Are you sure you would like to quit? [Y/N]");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
                if (input.equalsIgnoreCase("y")) {
                    System.out.println("Thank you.");
                    System.exit(0);
                } else {
                    return false;
                }
            } else {
                System.out.println("Invalid input.");
            }
        } while (!false);
    }

}