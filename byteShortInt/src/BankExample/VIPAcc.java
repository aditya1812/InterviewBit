package BankExample;

/**
 * Created by 5CB4125SDX0 on 10-03-2017.
 */
public class VIPAcc {
    private String name;
    private double creditLimit;
    private String email;

    public VIPAcc(){
        this("defaultName", 5000, "default@gmail.com");
    }

    public VIPAcc(String name, String email){
        this(name, 5000, email);
    }

    public VIPAcc(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }

    public double getCreditLimit() {
        System.out.println(this.creditLimit);
        return creditLimit;
    }

    public String getEmail() {
        System.out.println(this.email);
        return email;
    }
}
