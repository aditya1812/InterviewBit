/**
 * Created by 5CB4125SDX0 on 13-04-2017.
 */
public class NoOf1Bits {
    public static void main(String[] args) {
        int a = 1;
        int count = 0;
        while(a>0){

            if(a%2 == 1)
                count++;
            a /= 2;


        }
        System.out.println(count);
    }
}
