import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 13-04-2017.
 */
public class ReverseBits {
    public static void main(String[] args) {
        long a = 0L;
        ArrayList<Long> b = new ArrayList<>();
        for(int i = 0; i < 32; i++){
            b.add((long)0);
        }
        int count = 0;
        while(a > 0){
            b.set(count,a%2);
            count++;
            a /= 2;
        }
        long ans = 0;
        int pow = 31;
        for(int i = 0; i < 32; i++){
            //System.out.println(b.get(i)+" * "+Math.pow(2,pow));

            ans += b.get(i)*Math.pow(2,pow);
            pow--;

        }
        System.out.println("...."+ans);
    }

}
