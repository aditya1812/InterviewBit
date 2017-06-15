import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 17-04-2017.
 */
public class RemoveDuplicatesInplace {
    public static void main(String[] args) {
        int[] a = {500, 500 ,500, 500, 1000};
        if(a.length == 1){
            System.out.println(a[0]);
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i = 0; i< a.length; i++){
            l1.add(a[i]);
        }
        if(l1.size() == 1){
            System.out.println(1);
        }
        //ArrayList<Integer> l1 = new ArrayList<>();

        //ArrayList<Integer> l = new ArrayList<>();

        //StringBuilder s = new StringBuilder();
        for(int i = 0; i < l1.size()-1; i++){
            while(i != l1.size()-1 && l1.get(i).equals(l1.get(i+1))){
                l1.remove(i);


            }
        }

        System.out.println(l1.size());
    }
}
