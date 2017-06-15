import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 27-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        int n;
        long n1 = 0;
        int o;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        o = n;
        String st;
        char c;
        ArrayList<Integer> a = new ArrayList<>();
        //st = Integer.toString(n);
        //System.out.println(st);
        //System.out.println(n1);
        while(n!=0){
            a.add(n%10);
            n = n/10;
        }
        int count = 0;

        for(int i = a.size()-1; i >= 0 ;i--){
            n1 += a.get(i)*Math.pow(10,count);
            count++;

            System.out.println(a.get(i));
        }
        if(n1<-2147483648||n1>2147483647)
            System.out.println(0);
        else
            System.out.println(n1);

    }
}
