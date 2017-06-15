/**
 * Created by 5CB4125SDX0 on 12-03-2017.
 */
class Car {
    private String name;
    private String type;
    private Boolean engine;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        this.engine = true;
    }

    public void startEngine(){
        System.out.print("This is from super class");
        System.out.println("        Engine Started....");
    }

    public void accelerate(){
        System.out.print("This is from super class");
        System.out.println("      Increasing speed....");
    }

    public void stop(){
        System.out.print("This is from super class");
        System.out.println("        Stopping car....");
    }
}

class Lexus extends Car {

    public Lexus() {
        super("Lexus", "Sedan");
    }

    @Override
    public void accelerate() {
        System.out.println("Lexus is accelerating");
        //super.accelerate();
    }

    @Override
    public void stop() {
        System.out.println("Lexus break");
        //super.stop();
    }
}

class Lincoln extends Car{

    public Lincoln() {
        super("Lincoln","SUV");
    }

    @Override
    public void startEngine() {
        System.out.println("Lincoln staring");
        //super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Lincoln accelerating");
        //super.accelerate();
    }
}

class Main{
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Car car = getCar(i);
            car.startEngine();
            car.accelerate();
            car.stop();

        }
    }

    public static Car getCar(int i){
        switch(i){
            case 0:
                return new Lexus();
            case 1:
                return new Lincoln();
        }
        return null;
    }
}