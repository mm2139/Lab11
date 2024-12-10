import java.lang.reflect.Array;
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

        Print(ingredients);

        do {
            System.out.println("Options: \n" +
                    "A – Add an item to the list \n" +
                    "D – Delete an item from the list \n" +
                    "P – Print the list\n" +
                    "Q – Quit the program\n");

            userChoice = InputHelper.getRegEx(scan, "Choose an option from the menu.", "[AaDdPpQq]");

            if (userChoice.equalsIgnoreCase("A")) {
                Add(scan, ingredients);
                Print(ingredients);
            }
            if (userChoice.equalsIgnoreCase("D")) {
                Delete(scan, ingredients);
                Print(ingredients);
            }
            if (userChoice.equalsIgnoreCase("P")) {
                Print(ingredients);
            }
            if (userChoice.equalsIgnoreCase("Q")) {
            quit = Quit(scan);
            }
    }
    while (!quit);


    }

    public static void Add(Scanner scan, ArrayList list) {
        String item = InputHelper.getNonZeroLenString("Input the item you would like to add to the list.", scan);
        list.add(item);
    }


    public static void Delete(Scanner scan, ArrayList list) {
        int index = InputHelper.getRangedInt(scan, "Input the index of the item you would like to remove in the list.", 0, list.size()-1);
        list.remove(index);
}

    public static void Print(ArrayList list) {
        System.out.printf("%5s | %2s", "Index", "Item\n");
        for (int i = 0; i<list.size(); i++)
            System.out.printf("%5s | %2s", i, list.get(i) + "\n");
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