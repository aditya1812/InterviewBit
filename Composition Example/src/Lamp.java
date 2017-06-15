/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class Lamp {
    private String type;
    private Bulb bulb;

    public Lamp(String type, Bulb bulb) {
        this.type = type;
        this.bulb = bulb;
    }

    public String getType() {
        return type;
    }

    public Bulb getBulb() {
        return bulb;
    }

    public void SwitchOn(){
        System.out.println("Lamp Switch On");
    }

    public void SwitchOff(){
        System.out.println("Lamp Switched Off");
    }
}
