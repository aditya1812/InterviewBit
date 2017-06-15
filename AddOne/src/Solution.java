import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 20-03-2017.
 */
public class Solution {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        ArrayList<Integer> alist = a;
        int num;
        int i;

        for(i = 0; i <= alist.size();i++) {
            if(alist.size() == 1)
                break;
            num = alist.get(i);
            if (num > 0) {
                break;
            } else
                alist.remove(i);
                i--;
        }
        for(i = alist.size()-1; i >= 0;i--){
            num = alist.get(i) + 1;
            if(num>9){
                alist.set(i,num%10);
                if(i == 0)
                    alist.add(0,1);
            }

            else{
                alist.set(i,num);
                break;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(9);
        System.out.println(plusOne(a));


    }
}

