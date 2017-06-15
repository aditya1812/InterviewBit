/**
 * Created by 5CB4125SDX0 on 28-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        int n =1;
        int n1;
        boolean f = false;
        int i,count = 1;
        for(i = 2;i<n;i++){
            n1 = n;
            while(n1%i==0){
                n1 = n1/i;
                count++;
                if(n1 == i){
                    f = true;
                    break;
                }

            }
            if (f == true)
                break;
        }
        if(f == true)
            System.out.println(i+" power "+count);
        else
            System.out.println(f);
    }
}
