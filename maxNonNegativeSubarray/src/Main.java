import java.util.*;

/**
 * Created by 5CB4125SDX0 on 26-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        int n, i, j;
        ArrayList<Integer> aa = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in an array:");
        n = s.nextInt();
        System.out.println("Enter " + n + " integers:");
        //aa = new ArrayList<>();
        for (j = 0; j < n; j++)
            aa.add(s.nextInt());
        maxSumSubarray(aa);
    }

    public static void maxSumSubarray(ArrayList<Integer> aa) {
        Map<Integer,ArrayList> sol = new HashMap<>();
        ArrayList<Integer> length = new ArrayList<>();
        int start = 0;
        int end = 0;
        int st = 0;
        int l;
        //double max = Double.NEGATIVE_INFINITY;
        int max = 0;
        boolean f = false;
        double negMax = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < aa.size(); i++){
            if(aa.get(i) >= 0){
                f = true;
                max += aa.get(i);
                if(i == aa.size()-1){
                    end = i;
                    length.add(0,start);
                    length.add(1,end);
                    l = end - start + 1;
                    length.add(2,l);
                    sol.put(max,length);
                }

            }
            else if(f == true){
                end = i-1;
                length.add(0,start);
                length.add(1,end);
                l = end - start + 1;
                length.add(2,l);
                sol.put(max,length);
                start = i+1;
                max = 0;
                length = new ArrayList<>();
            }
            else if(f == false)
                start++;
        }
        if(f == false) {
            System.out.println("All the elements are negative");
            return;
        }
        max = 0;
        length = new ArrayList<>();
        int maxLength = 0;
        Set<Integer> m;
        m = sol.keySet();
        for (int i : m){
            //System.out.println(i);
            //System.out.println(sol.get(i));
            if(i == max) {
                if (maxLength < length.get(2)) {
                    length = sol.get(i);
                    start = length.get(0);
                    end = length.get(1);
                    maxLength = length.get(2);
                }
            }
            if(i>max){
                max = i;
                length = sol.get(i);
                start = length.get(0);
                end = length.get(1);
                maxLength = length.get(2);

                }

            }


            System.out.println("Maximum sum = " + max);
            System.out.println("Maximum length is = " + maxLength);
            for (int i = start; i <= end; i++)
                System.out.print("\t" + aa.get(i));

    }



}
