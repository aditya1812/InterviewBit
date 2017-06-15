import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 31-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> x;
        ArrayList<ArrayList<Integer>> y = new ArrayList<>();
        int a, i ,j, k, l, p;
        a = 4;

        int index = 0;
        for(i=0;i<a;i++){
            index = 0;
            x = new ArrayList<>();
            for(j=0;j<i;j++){
                System.out.print(a-j);
                p = a-j;
                x.add(index,p);

                index++;

            }
            for(k=0;k<(2*a)-(2*i)-1;k++){
                p = a-j;
                x.add(index,p);

                index++;
                System.out.print(a-j);

            }
            for(l=1;l<=i;l++){
                System.out.print((a-j+l));

                p = a-j+l;
                x.add(index,p);

                index++;
            }
            System.out.println();

            y.add(x);
        }

        for(i=(2*a-1);i>a;i--){
            index = 0;
            x = new ArrayList<>();
            //System.out.println(i);
            for(j=0;j<i-a-1;j++){
                p = a-j;
                x.add(index,p);
                index++;
                System.out.print(a-j);
            }

            for(k=0;k< 2*(2*a+1-i)-1;k++){
                p = a-j;
                x.add(index,p);
                index++;
                System.out.print(a-j);
            }
            //System.out.print("|");
            for(l=1;l<=i-a-1;l++){
                p = a-j+l;
                x.add(index,p);
                index++;
                System.out.print(a-j+l);
            }
            System.out.println();
            y.add(x);

        }
        System.out.println("....................");
        for(i=0;i<y.size();i++){
           for(j=0;j<y.get(i).size();j++){
               System.out.print(y.get(i).get(j));
           }
            System.out.println();
        }
    }
}
