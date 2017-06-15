/**
 * Created by 5CB4125SDX0 on 13-03-2017.
 */
public class Burger {
    private String name;
    private double basePrice;
    private double totalPrice;
    private String breadRoll;
    private boolean meat;
    private String meatType;
    private int additions;

    public Burger(String name, String breadRoll, boolean meat, String meatType, int additions) {
        this.name = name;
        this.basePrice = 3.99d;
        this.totalPrice = 0d;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.meatType = meatType;
        if(additions > 0 && additions <= 4)
            this.additions = additions;
        else if(additions == 0)
            this.additions = 0;
        else
            this.additions = 4;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public boolean isMeat() {
        return meat;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getAdditions() {
        return additions;
    }

    public void makeBurger(){
        totalPrice += basePrice;
        switch(breadRoll.toLowerCase()){
            case "normal":
                totalPrice += 0d;
                break;
            case "special":
                totalPrice += 1.49d;
                break;
        }
        if(meat){
            switch(meatType.toLowerCase()){
                case "chicken":
                    totalPrice += 1.49d;
                    break;
                case "beef":
                    totalPrice +=1.99d;
                    break;
                case "pork":
                    totalPrice += 2.49d;
                    break;
            }
        }
        if(additions > 0)
            totalPrice += (double) (additions*0.99);

    }
    public void addSpecialRate(double rate){
        basePrice += (double)rate;
    }
    public void addTomatoes(){
        System.out.println("Tomatoes added.");
    }
    public void addPepper(){
        System.out.println("Pepper added.");
    }
    public void addCarrot(){
        System.out.println("Carrots added.");
    }
    public void addLattuce(){
        System.out.println("Lattuce added.");
    }
}
