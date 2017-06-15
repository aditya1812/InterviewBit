/**
 * Created by 5CB4125SDX0 on 10-05-2017.
 */
public class ReverseString {
    Stack s = new Stack();
    char[] a;
    StringBuilder revSt = new StringBuilder();

    public ReverseString(char[] a) {
        this.a = a;
    }

    public String reverseString(){
        if(a.length == 0){
            System.out.println("String empty");
            return null;
        }
        for(int i = 0; i < a.length; i++){
            s.push(a[i]);
        }

        for(int i = 0; i < a.length; i++){
            revSt.append((char)s.pop());
        }
        return revSt.toString();
    }
}
