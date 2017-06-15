package Vehicle;

/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class Lexus extends Car {

    private int years;

    public Lexus(int years) {
        super("A1234", "2017 Lexus LS", "Lexus", 4, 2, true);
        this.years = years;
    }

    @Override
    public void accelerate(int v) {
        System.out.println("Lexus Accelerate is called.");
        super.accelerate(v);
    }

    public void changeDir(int angle)
    {
        super.changeDir(angle);
    }

    public void gearNo(){
        System.out.println("Gear "+ super.getGear());

    }

    public static void main(String[] args){
        Lexus lexus = new Lexus(1);
        lexus.accelerate(25);
        lexus.changeDir(15);
        lexus.accelerate(15);
        lexus.gearNo();
        Car car = new Car("Abc","xyz","rst",4,2,true);
        System.out.println(car.getV());
        System.out.println(lexus.getV());
    }
}
