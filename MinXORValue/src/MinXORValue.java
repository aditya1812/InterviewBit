import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 14-04-2017.
 */
public class MinXORValue {
    public static void main(String[] args) {
        int[] a = {9,5,3};
        ArrayList<Integer> n1;
        ArrayList<Integer> n2;
        ArrayList<Integer> XN = new ArrayList<>();
        int n;
        int count;
        int no;
        double min = Double.POSITIVE_INFINITY;

        for(int i = 0; i < a.length-1; i++){
            //System.out.println(" "+a[i]);
            n1 = new ArrayList<>();
            for(int k = 0; k < 32; k++){
                n1.add(k,0);
                //n2.add(k,0);
            }
            n = a[i];
            count = 31;
            while(n>0){
                n1.set(count,n%2);
                n /= 2;
                count--;
            }

            for(int j = i+1; j < a.length; j++){
                //System.out.println(i+" "+j);
                n = a[j];

                n2 = new ArrayList<>();
                //System.out.println(a[i]+" "+a[j]);

                for(int k = 0; k < 32; k++){
                    //n1.add(k,0);
                    n2.add(k,0);
                }

                count = 31;
                while(n>0){
                    n2.set(count,n%2);
                    n /= 2;
                    count--;
                }
                count = 31;
                no = 0;


                for(int l= 0; l < 32; l++){
//                    if(((n1.get(l))^(n2.get(l))) == 1)
//                        System.out.print(((n1.get(l))^(n2.get(l)))*Math.pow(2,count));
                    //System.out.print(((n1.get(l))^(n2.get(l)))+" ");
                    no += ((n1.get(l))^(n2.get(l)))*Math.pow(2,count);

                    count--;

                }
                //System.out.println();
                //System.out.println(no);
                if((double)no < min){
                    min = (double) no;
                    //System.out.println("Inside if");
                }
                //System.out.println("................");

            }

        }
        System.out.println((int)min);
        //System.out.println(Math.pow(2,0));
        //System.out.println(1^1);
    }
}
