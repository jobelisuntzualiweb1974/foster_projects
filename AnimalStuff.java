
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalStuff {

    static ArrayList<Animal> myList = new ArrayList<Animal>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;
        while (true) {
            displayMenu();

            option = scanner.nextLine();

            switch (option) {
                case "add":
                    System.out.print("Enter Animal's type(dove,duck,lion,rabbit: ");
                    String animalType = scanner.nextLine();
                    Animal animal = Animal.newInstance(animalType);
                    if (animal != null) {
                        myList.add(animal);
                        System.out.println("The animal added successfully.");
                    } else {
                        System.out.println("The animal type is invalid");
                    }
                    break;
                case "print":
                    for (Animal a : myList) {
                        a.print();
                        System.out.println();
                    }
                    break;
                case "quit":
                    System.exit(0);
                default:
                    System.err.println("Invalid option.");
            }
        }

    }

    /**
     * Display the user menu.
     *
     */
    private static void displayMenu() {
        System.out.println("\n Add an animal.");
        System.out.println("Print every animal.");
        System.out.println("Quit");
        System.out.print("\nEnter your option (add/print/quit): ");
    }
}
