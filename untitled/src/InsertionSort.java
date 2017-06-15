/**
 * Created by 5CB4125SDX0 on 21-05-2017.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {6,4,1};
        int temp, j;
        for(int i = 1; i < a.length; ++i){
            temp = a[i];
            j = i - 1;
            while(j >= 0 && temp < a[j] ) {

                a[j+1] = a[j];
                j--;
                }
                a[j+1] = temp;
            }

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
