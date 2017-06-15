import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 13-03-2017.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> contacts = new ArrayList<String>();
        ContactList list = new ContactList("ABC", 9876543);
        Mobile mobile = new Mobile(contacts);
        boolean quit = false;
        while (!quit) {
            int choice = displayMenu();


            switch (choice) {
                case 1:
                    System.out.println("Please enter the name");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Please enter the number");
                    long number = scanner.nextInt();
                    mobile.addContact(name, number);
                    //mobile.addContact(scanner.nextLine());
                    mobile.displayList();
                    break;

                case 3:
                    System.out.println("Please enter the name");
                    scanner.nextLine();
                    String oldName = scanner.nextLine();

                    System.out.println("Please enter new name");
                    String newName = scanner.nextLine();
                    mobile.updateContact(oldName, newName);
                    mobile.displayList();
                    break;
                case 2:
                    System.out.println("Please enter contact to delete");

                    scanner.nextLine();
                    mobile.removeContact(scanner.nextLine());
                    mobile.displayList();
                    break;

                case 4:
                    System.out.println("Thank you!!!!");
                    quit = true;
                    break;

            }
        }
    }

    public static int displayMenu(){
        System.out.println("Menu");
        System.out.println("0: Display Menu");
        System.out.println("1: Create New contact");
        System.out.println("2: Delete Contact");
        System.out.println("3: Update Contact");
        //System.out.println("4: Display Contact list");
        System.out.println("4: Exit");
        int choice = scanner.nextInt();
        return choice;
    }


}


