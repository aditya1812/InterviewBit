import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 5CB4125SDX0 on 08-06-2017.
 */
public class Main {
    public static void main(String[] args) {
        String st = "civic";
        int val;
        Map<Character,Integer> a = new HashMap<>();
        int oddCount = 0;
        boolean p = true;

        for(int i = 0; i < st.length(); i++){
            if(a.containsKey(st.charAt(i))){
                val = a.get(st.charAt(i));
                a.replace(st.charAt(i), val + 1);
            }
            else
                a.put(st.charAt(i), 1);
        }


        Iterator it = a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            if((int)pair.getValue()%2 == 1)
                oddCount++;


            it.remove(); // avoids a ConcurrentModificationException
            if(oddCount > 1) {
                p = false;
                break;
            }


        }
        if(p)
            System.out.println("Has palindrome permutation");
        else
            System.out.println("Has NO palindrome permutation");
    }
}
