/**
 * Created by 5CB4125SDX0 on 21-05-2017.
 */
public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] a = {7,6,5,4,3,2,1};
        sort(a, 1);
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);

    }

    public static void sort(int[] a, int n){
        if(a.length == n)
            return;
        int temp = a[n], j = n-1;

        while(j >= 0 && a[j] > temp){
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = temp;
        sort(a,n+1);
    }
}
