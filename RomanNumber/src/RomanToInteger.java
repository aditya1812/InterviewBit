import java.util.HashMap;
import java.util.Map;

/**
 * Created by 5CB4125SDX0 on 01-04-2017.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MDCCCIV";
        Map<Character,Integer> values = new HashMap<>();
        values.put('i',1);
        values.put('v',5);
        values.put('x',10);
        values.put('l',50);
        values.put('c',100);
        values.put('d',500);
        values.put('m',1000);



        //int i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000, j;
        int j;

        int count = 0;
        String lR = roman.toLowerCase();
        char[] r = lR.toCharArray();

        for(j=0; j<r.length-1; j++){
           if(values.get(r[j]) >= values.get(r[j+1])){
               //System.out.println(r[j]);
               count += values.get(r[j]);
           }
            else {
               count -= values.get(r[j]);
               //System.out.println(r[j]);
           }
        }
        count += values.get(r[j]);
        System.out.println("Count "+count);
    }
}
