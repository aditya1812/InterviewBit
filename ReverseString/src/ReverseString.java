import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 13-04-2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        String a = " the sky is blue ";
/*        StringBuilder revString = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            System.out.println(s.charAt(i));
            revString.append(s.charAt(i));

        }
        System.out.println(revString.toString());*/

        ArrayList<String> tokens = new ArrayList<>();
        int length = a.length();
        if(length == 0)
            System.out.println("0");


        boolean f = false;
        for(int i = 0; i<a.length();i++)
            if(a.charAt(i) !=' ') {
                f = true;
                break;
            }

        if (f == false)
            System.out.println("0");
        StringBuilder token = new StringBuilder();;
        for(int i = 0; i<length; i++){
            //System.out.println(s.charAt(i));
            if(a.charAt(i) == ' ') {
                //System.out.println("inside if");
                //System.out.println(token.toString());
                if(token.length()>0)
                    tokens.add(token.toString());
                token = new StringBuilder();

            }
            else{
                //System.out.println("inside else");
                token.append(a.charAt(i));
                if(i==length-1)
                    tokens.add(token.toString());
                continue;
            }

        }
        for(int i=0;i<tokens.size();i++)
            System.out.println(tokens.get(i));
        //System.out.println(tokens.size());
        StringBuilder revString = new StringBuilder();
        for(int i = tokens.size()-1; i>=0; i--){
            revString.append(tokens.get(i));
            if(i != 0)
                revString.append(" ");
        }
        System.out.println(revString.toString());
        //return tokens.get(tokens.size()-1).length();
    }
}
