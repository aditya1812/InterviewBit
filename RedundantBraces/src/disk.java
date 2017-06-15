/**
 * Created by 5CB4125SDX0 on 10-06-2017.
 */
public class disk {
    private char c;
    private disk bottom;

    public disk() {

        this.bottom = null;
    }

    public void setC(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    public disk getBottom() {
        return bottom;
    }

    public void setBottom(disk bottom) {
        this.bottom = bottom;
    }
}
