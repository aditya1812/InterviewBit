import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 5CB4125SDX0 on 18-06-2017.
 */
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "ilisatien";
        String s2 = "lpisitein";
        boolean anagram = true;
        Map<Character, Integer> m = new HashMap<>();
        if(!(s1.length() == s2.length())) {
            System.out.println("Length not equal.");
            anagram = false;
        }

        for(int i = 0; i < s1.length(); i++) {
            if (m.containsKey(s1.charAt(i)))
                m.put(s1.charAt(i), m.get(s1.charAt(i)) + 1);
            else
                m.put(s1.charAt(i), 1);
        }

        for(int i = 0; i < s2.length(); i++) {
            if(!m.containsKey(s2.charAt(i))) {
                anagram = false;
                break;
            }
            else
            {
                m.put(s1.charAt(i), m.get(s1.charAt(i)) - 1);
            }
        }

        if(anagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");


    }
}
