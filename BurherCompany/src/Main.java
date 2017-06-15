/**
 * Created by 5CB4125SDX0 on 13-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Cheez Burger","Peta",true, "chicken",3);
        burger.makeBurger();
        burger.addLattuce();
        burger.addPepper();
        burger.addCarrot();
        System.out.println("Base Price "+burger.getBasePrice());
        System.out.println("Total price "+burger.getTotalPrice());

        HealthyBurger healthy = new HealthyBurger(true, "Pork", 6);
        healthy.makeBurger();
        healthy.addLattuce();
        healthy.addPepper();
        healthy.addCarrot();
        healthy.addPineapple();
        healthy.addStrawberry();
        healthy.addTomatoes();
        System.out.println("Base Price "+healthy.getBasePrice());
        System.out.println("Total price "+healthy.getTotalPrice());

        DeluxBurger delux = new DeluxBurger("Normal",false, "NA");
        delux.makeBurger();
        System.out.println("Base Price "+delux.getBasePrice());
        System.out.println("Total price "+delux.getTotalPrice());
    }
}
