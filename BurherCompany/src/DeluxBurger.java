/**
 * Created by 5CB4125SDX0 on 13-03-2017.
 */
public class DeluxBurger extends Burger {
    public DeluxBurger(String breadRoll, boolean meat, String meatType) {
        super("Delux Burger", breadRoll, meat, meatType, 0);
    }

    @Override
    public void makeBurger() {
        System.out.println("Making Delux Burger");
        addSpecialRate(0.99d);
        System.out.println("Chips and drinks added");
        super.makeBurger();

    }

    @Override
    public void addTomatoes() {
        System.out.println("Cannot add");
    }

    @Override
    public void addPepper() {
        System.out.println("Cannot add");
    }

    @Override
    public void addCarrot() {
        System.out.println("Cannot add");
    }

    @Override
    public void addLattuce() {
        System.out.println("Cannot add");
    }
}
