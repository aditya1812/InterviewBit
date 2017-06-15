import java.util.ArrayList;


public class AtmostTwice {

        public static void main(String[] args) {
            int[] a = {1,1};
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

            for(int i = 0; i < l1.size()-1; i++){
                if(i != l1.size()-1 && l1.get(i).equals(l1.get(i+1))){
                    System.out.println("inside if");
                    i++;
                }
                while(i != l1.size()-1 && l1.get(i).equals(l1.get(i+1))){
                    System.out.println("inside while");

                    l1.remove(i);


                }
            }
            for(int  i = 0 ; i < l1.size();i++)
            {
                System.out.println(l1.get(i));
            }
            System.out.println(".......");
            System.out.println(l1.size());
        }
}

