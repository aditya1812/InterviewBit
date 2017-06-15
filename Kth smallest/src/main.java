/**
 * Created by 5CB4125SDX0 on 22-05-2017.
 */
public class main {
    public static void main(String[] args) {
        int[] a = {60, 94, 63, 3, 86, 40, 93, 36, 56, 48, 17, 10, 23, 43, 77, 1, 1, 93, 79, 4, 10, 47, 1, 99, 91, 53, 99, 18, 52, 61, 84, 10, 13, 52, 3, 9, 78, 16, 7, 62};
        int i = 22;
        System.out.println("Final "+find(a, i));
    }

    public static int find(int[] a, int i){
        int min;
        int count = 0;
        int newMin = Integer.MIN_VALUE;
        for(int j = 0; j < i; j++){
            min = Integer.MAX_VALUE;
            count=0;
            for(int k = 0; k < a.length; k++){
                //count = 0;
                if(a[k] <= min & a[k] > newMin) {
                    if(a[k] < min)
                        count = 0;
                    if(a[k] == min) {
                       count++;
                       System.out.println("got new"+a[k]);
                   }
                    min = a[k];

                }
            }
            j += count;
            newMin = min;
            System.out.println(newMin);
        }
        return newMin;
    }
}
