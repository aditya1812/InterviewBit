/**
 * Created by 5CB4125SDX0 on 10-06-2017.
 */
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        String st1 = "(a+(a+c+b)*b))";
        String st2 = "(a+(a+b))";
        int count;
        boolean r = false;

        for(int i = 0; i < st1.length(); i++){
            count = 0;
            if(st1.charAt(i) == '(' || st1.charAt(i) == '/' || st1.charAt(i) == '*' || st1.charAt(i) == '-' || st1.charAt(i) == '+')
                s.pushD(st1.charAt(i));
            else if(st1.charAt(i) == ')'){
                if(s.getTop() == null || s.getTop().getC() == '(') {
                    r = true;
                    break;
                }
                while(!(s.getTop().getC() == '(')){
                    s.popD();
                }
                s.popD();
            }
        }

        if(r == true)
            System.out.println("Redundant braces");

        if(r == false)
            System.out.println("Not redundant braces");

        }
    }

