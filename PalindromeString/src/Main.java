import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 01-04-2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String a = "1a2";
        String stl,stf;
        stl = a.toLowerCase();
        stf = stl.replaceAll("\\W", "");
        //System.out.println(stf);
        char[] aa = new char[stf.length()];
        aa = stf.toCharArray();

        boolean f = true;

        for(int i=0;i<aa.length/2;i++){
            //System.out.println(a[i]+" "+a[a.length-i-1]);
            if(aa[i] != aa[aa.length-i-1]){
                f = false;
                break;
            }
        }
        System.out.println(f);
    }
}
