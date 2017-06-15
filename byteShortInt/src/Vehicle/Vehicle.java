package Vehicle;

/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class Vehicle {
    private String name;
    private String model;

    private int v;
    private int d;

    public Vehicle(String model, String name) {
        this.model = model;
        this.name = name;

        this.v = 0;
        this.d = 0;
    }

    public void move(int v, int d){
        this.v += v;
        System.out.println("Moving in speed "+ this.v + "in "+ this.d +" direction.");
    }

    public void changeDir(int d){
        this. d += d;
        System.out.println("Moving in speed "+ this.v + "in "+ this.d +" direction.");
    }

    public int getV() {
        return v;
    }

    public int getD() {
        return d;
    }
}
