import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 28-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        int m,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        System.out.println("Enter m:");
        m = s.nextInt();
        int max = 1;

        for(int i = 0; i <=Math.min(n,m);i++){
            if(n%i == 0 && m%i == 0)
                max = i;
        }
        System.out.println(max);
    }
}
