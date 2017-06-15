/**
 * Created by 5CB4125SDX0 on 19-05-2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] a =  {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int w = 3;
        int max = 0, maxUpdate=0;
        for(int i =0; i < a.length;i++){
            if(max < a[i]){
                max = a[i];
                maxUpdate = i;
        }
    }
}
