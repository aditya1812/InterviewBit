/**
 * Created by 5CB4125SDX0 on 02-04-2017.
 */
public class IntegerToRoman {
    public static void main(String[] args) {
        int a = 1804;
        StringBuilder roman = new StringBuilder();
        int rem;

        while(a>0){
            if(a>=1000){
                rem = a - 1000;
                roman.append('M');
                a = rem;
            }
            else if(a>=900){
                rem = a - 900;
                roman.append('C');
                roman.append('M');
                a = rem;
            }
            else if(a>=500){
                rem = a - 500;
                roman.append('D');
                a = rem;
            }
            else if(a>=400){
                rem = a - 400;
                roman.append('C');
                roman.append('D');
                a = rem;
            }
            else if(a>=100){
                rem = a - 100;
                roman.append('C');
                a = rem;
            }
            else if(a>=90){
                rem = a - 90;
                roman.append('X');
                roman.append('C');
                a = rem;
            }
            else if(a>=50){
                rem = a - 50;
                roman.append('L');
                a = rem;
            }
            else if(a>=40){
                rem = a - 40;
                roman.append('X');
                roman.append('L');
                a = rem;
            }
            else if(a>=10){
                rem = a - 10;
                roman.append('X');
                a = rem;
            }
            else if(a>=9){
                rem = a - 9;
                roman.append('I');
                roman.append('X');
                a = rem;
            }
            else if(a>=5){
                rem = a - 5;
                roman.append('V');
                a = rem;
            }
            else if(a>=4){
                rem = a - 4;
                roman.append('I');
                roman.append('V');
                a = rem;
            }
            else if(a>=1){
                rem = a - 1;
                roman.append('I');
                a = rem;
            }
        }

        System.out.println(roman.toString());

    }
}
