import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 01-04-2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        String lcp;
        int i;
        a.add("geeksforgeeks");
        a.add("geeks");
        a.add("geek");
        a.add("geezer");
        String substring = null;
        boolean f = true;
        //System.out.println(a.get(0).compareToIgnoreCase(a.get(1)));
        for(i=0; i<a.get(0).length();i++){
            //System.out.println(a.get(i));
            //System.out.println(a.get(0).substring(0,i+1));
            substring = a.get(0).substring(0,i+1);
            //System.out.println(substring);
            for(int j=1;j<a.size();j++){
                //System.out.println(a.get(j).startsWith(substring));
                if((a.get(j).startsWith(substring))== true){
                    //System.out.println("im in");
                    continue;
                }

                else {
                    f = false;

                }
               if(f == false)
                   break;
            }
            if(f == false)
                break;
        }
        if(f == false)
            substring = a.get(0).substring(0,i);
        System.out.println(substring);

        //System.out.println((s1.startsWith("aef")));
    }
}
