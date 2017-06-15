import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 27-03-2017.
 */
public class main {
    public static void main(String[] args) {
        String st;
        Scanner s = new Scanner(System.in);
        st = s.nextLine();
        int n;
        int count = 1;
        int n1 = ((int)st.charAt(st.length()-1))-64;
        System.out.println(n1);
        for(int i =st.length()-2;i>=0;i--){
            n1 += ((int)st.charAt(i)-64)*Math.pow(26,count);
            System.out.println(((int)st.charAt(i)-64)*Math.pow(26,count));
            count++;
        }
        System.out.println(n1);

    }
}
