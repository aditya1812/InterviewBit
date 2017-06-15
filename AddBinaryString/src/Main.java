/**
 * Created by 5CB4125SDX0 on 02-04-2017.
 */
public class Main {
    public static void main(String[] args) {
        String x = "100";
        String y = "11";
        int xval,yval;
        int add ,carry = 0;
        StringBuilder ans = new StringBuilder();
        int maxL = Math.max(x.length(),y.length());
        int i;
        for(i = 1; i <= maxL+1; i++){
            if(x.length()-i >= 0 && y.length()-i >= 0){
                System.out.println("here  x+y");
                xval = Character.getNumericValue(x.charAt(x.length()-i));
                //System.out.println(xval);
                yval = Character.getNumericValue(y.charAt(y.length()-i));

                //System.out.println(y.charAt(y.length()-i));
                //System.out.println(x.charAt(x.length()-i)+"+"+y.charAt(y.length()-i)+"+"+carry);
                //add = (int)x.charAt(x.length()-i)+ (int)y.charAt(y.length()-i)+carry;
                add = xval+yval+carry;
                //System.out.println(add);

                if(add > 2){
                    ans.append('1');
                    carry = 1;
                }
                else if(add > 1){
                    ans.append('0');
                    carry = 1;
                }
                else if(add >= 0){
                    ans.append(Integer.toString(add));
                    carry = 0;
                }
            }
            else if(x.length()-i >= 0){
                System.out.println("here only x");
                xval = Character.getNumericValue(x.charAt(x.length()-i));

                add = xval + carry;
                if(add > 1){
                    ans.append('0');
                    carry = 1;
                }
                else if(add >= 0){
                    ans.append(Integer.toString(add));
                    carry = 0;
                }
            }
            else if(y.length()-i >= 0){
                System.out.println("here only y");
                yval = Character.getNumericValue(y.charAt(y.length()-i));
                add = yval + carry;
                if(add > 1){
                    ans.append('0');
                    carry = 1;
                }
                else if(add >= 0){
                    ans.append(Integer.toString(add));
                    carry = 0;
                }
            }
        }
        if(carry==1)
            ans.append('1');
        System.out.println(ans.reverse().toString());

//        System.out.println((Double.MIN_VALUE > 0));
//        System.out.println(1.0/0.0);

    }
}
