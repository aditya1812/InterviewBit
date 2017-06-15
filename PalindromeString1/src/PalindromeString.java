/**
 * Created by 5CB4125SDX0 on 08-06-2017.
 */
public class PalindromeString {
    public static void main(String[] args) {
        String st = "a";
        int i, j;
        i = 0;
        boolean p = true;
        for(j = st.length()-1; j > i; j--){
            if(st.charAt(i) != st.charAt(j)) {
                p = false;
                break;
            }
            i++;
        }
        if(p)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
