import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 12-04-2017.
 */
public class LastWordName {
    public static void main(String[] args) {
        String s = "  ";
        boolean f = false;
        for(int i = 0; i<s.length();i++)
            if(s.charAt(i) !=' ') {
                f = true;
                break;
            }

        if (f == false)
            System.out.println("0");
        ArrayList<String> tokens = new ArrayList<>();
        int length = s.length();
        StringBuilder token = new StringBuilder();;
        for(int i = 0; i<length; i++){
            //System.out.println(s.charAt(i));

            if(s.charAt(i) == ' ') {
                System.out.println("inside if");
                System.out.println(token.toString());
                if(token.length()>0)
                    tokens.add(token.toString());
                token = new StringBuilder();

            }
            else{
                System.out.println("inside else");
                token.append(s.charAt(i));
                if(i==length-1)
                    tokens.add(token.toString());
                continue;
            }

        }
        System.out.println(tokens.size());
        for(int i = 0; i<tokens.size();i++)
            System.out.println(tokens.get(i));
        System.out.println(tokens.get(tokens.size()-1).length());
    }
}
