import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 17-04-2017.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        //int[] a = {1,1,2,5,7,7,9,9,9,12,12,12,15,15,17,17};
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        if(a.length == 1){
            System.out.println(a[0]);
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i = 0; i< a.length; i++){
           l1.add(a[i]);
        }
        ArrayList<Integer> l = new ArrayList<>();

        //StringBuilder s = new StringBuilder();
        for(int i = 0; i < a.length-1; i++){
            if(a[i] == a[i+1]){
                l.add(a[i]);
                l1.remove(i);
                i++;
                while(i != a.length-1 && a[i] == a[i+1]){
                    i++;
                }
            }
            else{
                l.add(a[i]);
            }
            if(i == a.length-2 && a[i] != a[i+1]){
                l.add(a[i+1]);
            }
        }
        for(int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));


    }
}
