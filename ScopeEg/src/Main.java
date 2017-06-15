import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 18-03-2017.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter an int : ");
        //scanner.nextLine();

//        X x = new X(scanner.nextInt());
//        x.x();
//
        X x = new X(scanner);
        x.x();
    }

}
