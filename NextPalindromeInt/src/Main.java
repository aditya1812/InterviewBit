/**
 * Created by 5CB4125SDX0 on 08-06-2017.
 */
public class Main {
    public static void main(String[] args) {
        int n = 125;
        boolean p = false;

        String s = Integer.toString(n);
        System.out.println(s);

        while(!p){
            n += 1;
            s = Integer.toString(n);
            if(pal(s)){
                p = true;
            }
        }
        System.out.println(n);
    }

    public static boolean pal(String s){
        int i, j;
        i = 0;
        boolean p = true;
        for(j = s.length()-1; j > i; j--){
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
        }
        return p;
    }
}
