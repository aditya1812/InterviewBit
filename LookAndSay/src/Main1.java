/**
 * Created by 5CB4125SDX0 on 01-04-2017.
 */
public class Main1 {
    public static void main(String[] args) {
        StringBuilder current;
        StringBuilder previous= new StringBuilder("1");
        current = new StringBuilder();
        int count = 1, n = 10, i, j;
        for(i = 1; i < n; i++){
            current = new StringBuilder();
            count = 1;
            for(j = 0; j < previous.length()-1; j++){
                if (previous.charAt(j) == previous.charAt(j+1)){
                    count++;
                }
                else{
                    current.append(count);
                    current.append(previous.charAt(j));
                    count = 1;
                }
            }
            current.append(count);
            current.append(previous.charAt(j));
            previous = current;
        }
        System.out.println(previous);
    }

}
