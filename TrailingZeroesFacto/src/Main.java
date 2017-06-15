/**
 * Created by 5CB4125SDX0 on 28-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        int n = 100;
        long fact = 1;
        for(int i =n; i>0;i--){
            fact = fact*i;
        }
        int count = 0;
        System.out.println(fact);
        while(true){
            if(fact%10 == 0){
                fact = fact/10;
                count++;
            }
            else
            break;
        }
        System.out.println(count);
    }
}
