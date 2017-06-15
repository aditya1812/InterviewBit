import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 14-03-2017.
 */


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank("PNC");

    public static void main(String[] args) {

        boolean quit =false;
        while(!quit){
            int c = displayMenu();
            switch(c){
                case 1:
                    addBranch();
                    break;
                case 2:
                    displayBranches();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    displayCustomers();
                    break;
                case 5:
                    addTransaction();
                    break;
                case 6:
                    viewTransactions();
                    break;
                case 7:
                    System.out.println("Thank you for using this application!!!");
                    quit = true;
                    break;

            }
        }


    }
    public static int displayMenu(){
        System.out.println("Welcome to PNC Bank");
        System.out.println("1: Add Branch");
        System.out.println("2: List of Branches");
        System.out.println("3: Add new customer in a Branch");
        System.out.println("4: List of Customers in Branch");
        System.out.println("5: Add transaction for a customer in a branch");
        System.out.println("6: View all the transactions for a customer in a branch");
        System.out.println("7: Quit");
        int choice = scanner.nextInt();
        return choice;
    }

    public static void addBranch(){
        System.out.println("Enter the name for branch: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        bank.addBranch(name);
    }

    public static void displayBranches(){
        System.out.println("Our Branches");
        bank.showBranchList();
    }

    public static void addNewCustomer(){
        System.out.println("Enter the branch name");
        scanner.nextLine();
        String branch = scanner.nextLine();
        System.out.println("Enter name of the customer");

        String name = scanner.nextLine();
        System.out.println("Enter the initial transaction amt");
        double amt = scanner.nextDouble();
        bank.addNewCustomer(branch,name,amt);
    }

    public static void displayCustomers(){
        System.out.println("Enter the branch name");
        scanner.nextLine();
        String branch = scanner.nextLine();
        bank.showCustomerList(branch);
    }

    public static void addTransaction(){
        System.out.println("Enter the branch name");
        scanner.nextLine();
        String branch = scanner.nextLine();
        System.out.println("Enter name of the customer");
        //scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter the transaction amt");
        //scanner.nextLine();
        double amt = scanner.nextDouble();
        bank.addCustomerTransaction(branch,name,amt);
    }

    public static void viewTransactions(){
        System.out.println("Enter the branch name");
        scanner.nextLine();
        String branch = scanner.nextLine();
        System.out.println("Enter name of the customer");
        String name = scanner.nextLine();
        bank.showCustomerTransaction(branch,name);
    }
}
