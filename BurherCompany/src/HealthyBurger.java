/**
 * Created by 5CB4125SDX0 on 13-03-2017.
 */
public class HealthyBurger extends Burger {
    private int extraAdditions;

    public HealthyBurger(boolean meat, String meatType, int additions) {
        super("Healthy Burger", "Brown rye bread Roll", meat, meatType, additions);
        this.extraAdditions = additions;
        if(additions > 0 && additions <= 6)
            this.extraAdditions = additions;
        else if(additions == 0)
            this.extraAdditions = 0;
        else
            this.extraAdditions = 6;
    }

    @Override
    public void makeBurger() {
        System.out.println("Preparing Healthy Burger");
        addSpecialRate(1.49d);
        super.makeBurger();
    }

    public void addPineapple(){
        System.out.println("Pineapple added");
    }

    public void addStrawberry(){
        System.out.println("Strawberry added");
    }
}
