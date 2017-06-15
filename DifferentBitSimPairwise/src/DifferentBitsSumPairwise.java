import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 5CB4125SDX0 on 14-04-2017.
 */
public class DifferentBitsSumPairwise {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        //[ 65, 79, 94, 5, 65, 73, 15, 20, 20 ]
        a.add(65);
        a.add(79);
        a.add(94);
        a.add(5);
        a.add(65);
        a.add(73);
        a.add(15);
        a.add(20);
        a.add(20);
        ArrayList<Integer> n1 ;
        ArrayList<Integer> n2;
        Map<Integer,ArrayList<Integer>> b = new HashMap<>();

        int temp,count;
        for(int i =0; i< a.size();i++){
            n1 = new ArrayList<>();
            for(int j =0; j< 64; j++)
                n1.add(0);
            //b.put(a.get(i),n1);
            temp = a.get(i);
            count = 63;
            while(temp > 0){
                n1.set(count,temp%2);
                temp /= 2;
                count--;

            }
            b.put(a.get(i),n1);
        }
        double ans = Double.POSITIVE_INFINITY;
        int add = 0;
        for(int i = 0; i < b.size(); i++){
            for(int j = 0; j < b.size(); j++){

                //System.out.println(a.get(i)+" "+a.get(j));
                for(int k = 0; k<64;k++) {
                    //System.out.println(b.get(a.get(i)) + " " + b.get(a.get(j)));
                    if ((b.get(a.get(i)).get(k)) != b.get(a.get(j)).get(k)) {
                        add++;
                    }
                }
            }
            //System.out.println(add);

        }
        System.out.println(add);
    }

}
