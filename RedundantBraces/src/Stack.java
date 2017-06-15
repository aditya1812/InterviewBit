/**
 * Created by 5CB4125SDX0 on 10-06-2017.
 */
public class Stack {
    private disk d;
    private disk top = new disk();

    public Stack() {
        this.d = null;
        this.top = null;
    }

    public disk getD() {
        return d;
    }

    public void setD(disk d) {
        this.d = d;
    }

    public disk getTop() {
        return top;
    }

    public void setTop(disk top) {
        this.top = top;
    }

    public void pushD(char c){
        d = new disk();
        d.setC(c);
        disk tempD;
        if(top == null){
            top = d;
        }
        else{
            tempD = top;
            top = d;
            d.setBottom(tempD);
        }
        System.out.println("push    "+top.getC());
    }

    public char popD(){
        if(top == null)
            return 'N';
        else {
            char c = top.getC();
            if(top.getBottom() == null)
                top = null;
            else
                top = top.getBottom();
            System.out.println("pop "+c);
            return c;
        }

    }
}
