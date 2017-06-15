import java.util.*;

/**
 * Created by 5CB4125SDX0 on 13-04-2017.
 */
public class SingleNumber {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(5);
        a.add(4);
        a.add(4);
        a.add(1);
        a.add(4);
        a.add(4);


        Map<Integer,Integer> c = new HashMap<>();
        for(int i=0; i<a.size();i++){
            if(c.containsKey(a.get(i))){
                System.out.println("inside if");
                c.replace(a.get(i),c.get(a.get(i)),c.get(a.get(i))+1);
            }
            else {

                System.out.println("inside else");
                c.put(a.get(i), 1);
            }

        }
        int ans = 0;
        if(c.containsValue(1)) {
            Iterator it = c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());
                if(pair.getValue().equals(1))
                    ans = (int)pair.getKey();


                it.remove(); // avoids a ConcurrentModificationException
            }

        }
        System.out.println(ans);

    }
}
