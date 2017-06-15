/**
 * Created by 5CB4125SDX0 on 01-04-2017.
 */
public class Main {
    public static void main(String[] args) {
        int n=10;
        long rem, memRem=1;
        double number = 1;
        double last = 0;
        int count = 0;
        int powTen = 0;
        for(int i=1;i<n;i++){
            last = 0;
            powTen = 0;
            count = 0;
            memRem = 1;
            while(number>0) {
                rem = (int)number % 10;
                if (rem == memRem) {
                    count++;
                } else {

                    if (powTen == 0) {
                        last += memRem;
                        memRem = rem;
                        powTen++;
                    } else {
                        last += memRem * Math.pow(10, powTen);
                        //System.out.println(last);
                        memRem = rem;
                        powTen++;
                    }

                    last += count * Math.pow(10, powTen);
                    //last += count * powTen * 10;
                    count = 1;
                    powTen++;
                }

                number = number / 10;
                //System.out.println(number);

            }


            if(number==0){
                if(powTen == 0) {

                    last += memRem;

                    powTen++;

                }
                else {
                    last += memRem * Math.pow(10,powTen);
                    //System.out.println(last);
                    powTen++;
                }

                //System.out.println(count);
                //System.out.println("pow"+Math.pow(10,powTen));
                last += count*Math.pow(10,powTen);
                //System.out.println(last);
            }
            number = last;
            //System.out.println(last);


        }
        System.out.println("Last " +last);
        //String ans = double.toString(last);
    }
}
