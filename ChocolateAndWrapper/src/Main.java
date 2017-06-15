/**
 * Created by 5CB4125SDX0 on 22-05-2017.
 */
public class Main {

    public static int c = 0, nw = 0;
    public static void main(String[] args) {
        int money, price,wrapper;
        System.out.println(cal(20,3,5));
    }

    public static int cal(int m, int p, int w){
        if(m<p&&nw<w)
            return c;
        int c1 = c;
        c = c + (m/p);
        m = m%p;
        c = c + nw/w;
        nw = c-c1+nw%w;
        cal(m,p,w);
        return c;
    }
}
