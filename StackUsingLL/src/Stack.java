/**
 * Created by 5CB4125SDX0 on 09-05-2017.
 */
public class Stack {
    private Disc topDisc;
    private int size;

    public Stack(Disc topDisc, int size) {
        this.topDisc = topDisc;
        this.size = size;
    }

    public Stack() {
        this.topDisc = null;
        this.size = 0;
    }

    public Disc getTopDisc() {
        return topDisc;
    }

    public int getSize() {
        return size;
    }

    public void setTopDisc(Disc topDisc) {
        this.topDisc = topDisc;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(int val){
        Disc n = new Disc(null,val);
        if(size==0){
            topDisc = n;
            size++;
            return;
        }
        else{
            n.setNextDisc(topDisc);
            topDisc = n;
            size++;
        }
    }

    public int pop(){
        if(size == 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            Disc d = new Disc();
            //System.out.println(getTopDisc().getVal()+" popped");
            int val = topDisc.getVal();
            d = topDisc;
            topDisc = d.getNextDisc();
            size--;
            return val;
        }
    }

    public void printStack(){
        if(size == 0){
            System.out.println("Stack is empty");
            return;
        }
        else{
            Disc d = new Disc();
            d = topDisc;
            for(int i = 0; i < size; i++){
                System.out.println(d.getVal());
                d = d.getNextDisc();
            }
        }
    }


}
