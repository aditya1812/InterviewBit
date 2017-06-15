package Vehicle;

/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class Car extends Vehicle {
    private String company;
    private int doors;
    private int gears;
    private boolean auto;
    private int gear;

    public Car(String model, String name, String company, int doors, int gears, boolean auto) {
        super(model, name);
        this.company = company;
        this.doors = doors;
        this.gears = gears;
        this.auto = auto;
        this.gear = 0;
    }

    public void accelerate(int v){

        move(v, getD());
        if(auto){
            if (getV() > 10 && getV() < 20)
                changeGear(1);
            else if(getV() > 20 && getV() < 60)
                changeGear(2);
        }
    }

    public void changeGear(int g){
        gear = g;
    }

    public int getGear() {
        return gear;
    }
}
