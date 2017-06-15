import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 25-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test;
        System.out.println("Enter number of test cases: ");
        test = s.nextInt();
        ArrayList<Integer> aa;
        //int[] a= new int[100];
        Map<Integer,ArrayList> a = new HashMap<>();
        int n,i,j,x;
        double max;
        int start, st , end;
        for(i = 0; i < test; i++) {
            System.out.println("Enter number of elements in an array:");
            n = s.nextInt();
            System.out.println("Enter " + n + " integers:");
            aa = new ArrayList<>();
            for (j = 0; j < n; j++)
                aa.add(s.nextInt());
            a.put(i, aa);
        }

        for(i = 0; i < test; i++){
            start = 0; end = 0; st = 0;
            max = Double.NEGATIVE_INFINITY;
            x = 0;
            double negMax = Double.NEGATIVE_INFINITY;
            aa = a.get(i);
            for(j = 0; j < aa.size(); j ++){
                //System.out.println(aa.get(j));

                x +=aa.get(j);
                if(x < 0){
                    if(negMax < aa.get(j))
                        negMax = aa.get(j);
                    x = 0;
                    st ++;
                }
                if(x!=0&&x>max) {
                    max = x;
                    start = st;
                    end = j;
                }

            }
            System.out.println(negMax);
            System.out.println(max);
            System.out.println("Maximum sum is: "+ Math.max((int)max,(int)negMax));
            System.out.println("Starts at " + (start+1) +" and ends at "+ (end+1));

        }

    }
}
