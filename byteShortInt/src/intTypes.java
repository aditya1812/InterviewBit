/**
 * Created by 5CB4125SDX0 on 08-03-2017.
 */
public class intTypes {
    public static void main(String[] args) {
        int big = 2_47_123_456;
        System.out.println(big);
        long longNum = 5000;
        System.out.println(longNum);
        System.out.println(big + longNum);
        short shortNum = (short) (big + longNum);
        System.out.println(shortNum);
        float floatNum = (float) 5 / 3;
        System.out.println("Float = " + floatNum);
        float floatNum1 = 5 / 3f;
        System.out.println("Float = " + floatNum1);
        double doubleNum = 10 / 4f;
        System.out.println("Double = " + doubleNum);
        int p = 200;
        double kg = (double) p;
        System.out.println("Kg" + kg);
        char myChar = '\u2764';
        System.out.println("Special Char : " + myChar);
    }
}
