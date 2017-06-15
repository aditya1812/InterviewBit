import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 27-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        ArrayList<String> a = new ArrayList<>();
        String st = Integer.toString(n);
        for(int i=0;i<st.length();i++){
            a.add(st.substring(i,i+1));
            System.out.println(st.substring(i,i+1));
        }
        boolean f = false;

        for(int i = 0; i< st.length()/2;i++){
            if(a.get(i).equals(a.get(a.size()-i-1)))
                continue;
            else
            {
                System.out.println(a.get(i)+"   "+a.get(a.size()-i-1));
                System.out.println("Not palindrome");
                f = true;
                break;

            }
       }
        if(f == false)
            System.out.println("Palindrome");
    }
}
