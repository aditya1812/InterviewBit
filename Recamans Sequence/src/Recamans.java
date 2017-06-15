import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 21-05-2017.
 */
public class Recamans {
    private static int a = 0;
    private static int m = 10;
    private static ArrayList ar = new ArrayList();
    public static void main(String[] args) {

        System.out.println();
        calRecaman(1,2);
    }

    public static int calRecaman(int n, int x){
        ar.add(n);
        if(a == m){
            return 0;
        }
        System.out.println(x+"\t"+n);
        if(ar.contains(n-x)|n-x <= 0)
            n = n+x;
        else
            n = n-x;

        a++;
        x++;

        calRecaman(n,x);
        return 0;
    }
}
