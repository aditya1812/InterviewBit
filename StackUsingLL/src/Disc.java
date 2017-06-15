/**
 * Created by 5CB4125SDX0 on 09-05-2017.
 */
public class Disc {
    private Disc nextDisc;
    private int val;

    public Disc(Disc nextDisc, int val) {
        this.nextDisc = nextDisc;
        this.val = val;
    }

    public Disc() {
        this.nextDisc = null;
        this.val = 0;
    }

    public Disc getNextDisc() {
        return nextDisc;
    }

    public int getVal() {
        return val;
    }

    public void setNextDisc(Disc nextDisc) {
        this.nextDisc = nextDisc;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
