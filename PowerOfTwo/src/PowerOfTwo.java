/**
 * Created by 5CB4125SDX0 on 13-04-2017.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        //int n = 50;
        long no= 0;
        long temp;
        String s = "147573952589676412928";
        System.out.println((s.equals("14757395258967641292")));
        //System.out.println(s.length());
        int length = s.length()-1;
        for(int i = 0; i<s.length();i++){
            if(length==0) {
                no += ((long) s.charAt(i)) - 48;
            }
            else{
                temp = (long)(((long)s.charAt(i)-48));
                //System.out.println((int)s.charAt(i));
                //System.out.println(s.charAt(i));
                //System.out.println(((int) temp));
                //no+=(((int)s.charAt(i))-48)*Math.pow(10,i);
                //System.out.println((int)temp*10);
                no += temp*Math.pow(10,length);
                length--;
                //System.out.println(i);
                //System.out.println(Math.pow(10,i));

            }




        }
        //System.out.println(Math.pow(10,1));

            //System.out.println(s.charAt(i));
        System.out.println(no);
        //System.out.println(((int)'9')-48);



        while(no>0){
            no = no/2;
            if(no%2 != 0)
                break;
        }
        if(no == 1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
