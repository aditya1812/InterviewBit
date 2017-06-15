import java.util.*;

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
        Map<Integer, ArrayList> a = new HashMap<>();
        int n, i, j, x;
        int min, max;
        double maxDiff = Double.NEGATIVE_INFINITY;
        int diff;


        for (i = 0; i < test; i++) {
            System.out.println("Enter number of elements in an array:");
            n = s.nextInt();
            System.out.println("Enter " + n + " integers:");
            aa = new ArrayList<>();
            for (j = 0; j < n; j++)
                aa.add(s.nextInt());
            a.put(i, aa);
        }

        ArrayList<Integer> leftMin = new ArrayList<>();
        ArrayList<Integer> rightMin = new ArrayList<>();
        ArrayList<Integer> leftMax = new ArrayList<>();
        ArrayList<Integer> rightMax = new ArrayList<>();

        int lMin, rMin, lMax, rMax;
        for (i = 0; i < test; i++) {
/*            min = minSubArray(a.get(i));
            max = maxSubArray(a.get(i));
            System.out.println("Min is "+min);
            System.out.println("Max is "+max);
            */
            aa = a.get(i);
            for(j = 0; j<aa.size(); j++){


                if(j == aa.size()-1) {
                    lMin = minSubArray(a.get(i), 0, j);
                    lMax = maxSubArray(a.get(i), 0, j);
                }
                else {
                    lMin = minSubArray(a.get(i), 0, j + 1);
                    lMax = maxSubArray(a.get(i), 0, j + 1);
                }

                rMin = minSubArray(a.get(i),j+1,a.get(i).size());
                rMax = maxSubArray(a.get(i),j+1,a.get(i).size());
                leftMin.add(lMin);
                leftMax.add(lMax);
                rightMin.add(rMin);
                rightMax.add(rMax);

            }
            for(j = 0; j < leftMax.size(); j++){

                diff = Math.max((Math.abs(leftMin.get(j) - rightMax.get(j))),Math.abs(leftMax.get(j) - rightMin.get(j)));
                System.out.println(j);
                System.out.println(leftMin.get(j)+"  "+rightMax.get(j));
                System.out.println(leftMax.get(j)+"  "+rightMin.get(j));
                System.out.println(diff);
                System.out.println("....................");
                if(maxDiff < Math.max((Math.abs(leftMin.get(j) - rightMax.get(j))),Math.abs(leftMax.get(j) - rightMin.get(j))))
                    maxDiff = (double) diff;
            }

            System.out.println("Maximum difference is "+ (int)maxDiff);
        }

    }


    private static int minSubArray(List<Integer> a, int sstart, int eend) {
        double min = Double.POSITIVE_INFINITY;
        int x = 0;
        int start, st, end;
        start = 0;
        end = 0;
        st = 0;
        double posMin = Double.POSITIVE_INFINITY;
        //aa = a.get(i);
//        if(sstart == eend) {
//            if (sstart == 0)
//                return a.get(sstart);
//            else
//                return a.get(sstart-1);
//        }
        boolean f = false;
        for (int j = sstart; j < eend; j++) {
            //System.out.println(aa.get(j));
            f = true;
            x += a.get(j);
            if (x >= 0) {
                if (posMin > a.get(j))
                    posMin = a.get(j);
                x = 0;
                st++;
            }
            if (x != 0 && x < min) {
                min = x;
                start = st;
                end = j;
            }


        }
        if (f == false) {
            if (sstart == 0)
                return a.get(sstart);
            else
                return a.get(a.size() - 1);
        }
        //System.out.println("Minimum sum is: "+ Math.min((int)min,(int)posMin));
        //System.out.println("Starts at " + (start+1) +" and ends at "+ (end+1));
        return Math.min((int) min, (int) posMin);
    }

    private static int maxSubArray(List<Integer> a, int sstart, int eend) {
        int x = 0;
        int start, st, end;
        start = 0;
        end = 0;
        st = 0;
        boolean f = false;
        double max = Double.NEGATIVE_INFINITY;
        x = 0;
        double negMax = Double.NEGATIVE_INFINITY;
        //aa = a.get(i);
//        if(sstart == eend) {
//            if (sstart == 0)
//                return a.get(sstart);
//            else
//                return a.get(sstart-1);
//        }

        for (int j = sstart; j < eend; j++) {
            //System.out.println(aa.get(j));
            f = true;
            x += a.get(j);
            if (x < 0) {
                if (negMax < a.get(j))
                    negMax = a.get(j);
                x = 0;
                st++;
            }
            if (x != 0 && x > max) {
                max = x;
                start = st;
                end = j;
            }
        }
        if (f == false) {
            if (sstart == 0)
                return a.get(sstart);
            else
                return a.get(a.size() - 1);
        }

        //System.out.println("Maximum sum is: "+ Math.max((int)max,(int)negMax));
        //System.out.println("Starts at " + (start+1) +" and ends at "+ (end+1));

        return Math.max((int) max, (int) negMax);
    }
}
