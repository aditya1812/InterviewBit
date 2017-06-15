import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 18-03-2017.
 */
public class X {
    private int x;
    public X(Scanner scanner) {
        //this.x = x;
        System.out.println("X is Created.");
        System.out.println("Enter x:");
        this.x = scanner.nextInt();
    }

    public void x(){
        for(int x=1; x<=12; x++){
            System.out.println(this.x*x);
        }
    }
}
