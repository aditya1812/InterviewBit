package BankExample;

/**
 * Created by 5CB4125SDX0 on 10-03-2017.
 */
public class BankAccount {
    private long accNo;
    private double balance;
    private String name;
    private String email;
    private long phone;

    public BankAccount(long accNo, double balance, String name, String email, long phone ){
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public double deposit(double amt){
        this.balance += (double)amt;
        return this.balance;
    }

    public double withdraw(double amt){
        if(amt <= this.balance){
            this.balance -= amt;
            return this.balance;
        }
        else
            return -1;
    }
}
