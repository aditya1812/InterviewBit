/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class Bulb {
    private String color;
    private int watts;

    public Bulb(String color, int watts) {
        this.color = color;
        this.watts = watts;
    }

    public String getColor() {
        return color;
    }

    public int getWatts() {
        return watts;
    }

    public void replace(){
        System.out.println("Bulb Replaced");
    }
}
