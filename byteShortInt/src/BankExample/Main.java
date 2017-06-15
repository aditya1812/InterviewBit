package BankExample;

/**
 * Created by 5CB4125SDX0 on 10-03-2017.
 */
public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount(123456789,12547.354, "Abc Xyz", "abc@gmail.com", 1234567890);
//        account.setAccNo(123456789);
//        account.setBalance(12547.354);
//        account.setEmail("abcd@gmail.com");
//        account.setName("Abcd Xyz");
//        account.setPhone(123456789);
        System.out.println("Acc No. " + account.getAccNo());
        System.out.println("Name "+ account.getName());
        System.out.println("Email" + account.getEmail());
        System.out.println("Balance " + account.getBalance());
        double damt = 200d;
        double newBal = account.deposit(damt);
        System.out.println("Deposit amt "+ damt);
        System.out.println("New balance after deposit "+account.getBalance());
        double wamt = 1000.123d;
        System.out.println("Withdraw amt "+ (newBal+1d));
        newBal = account.withdraw((newBal+1d));
        if(newBal != -1)
            System.out.println("New balance after withdraw "+account.getBalance());
        else
            System.out.println("No sufficient balance");

        VIPAcc vip1 = new VIPAcc();
        vip1.getName();
        vip1.getCreditLimit();
        vip1.getEmail();
        VIPAcc vip2 = new VIPAcc("abcd","abcd@gmail.com");
        vip2.getName();
        vip2.getCreditLimit();
        vip2.getEmail();
        VIPAcc vip3 = new VIPAcc("pqrs", 20000, "pqrs@gmail.com");
        vip3.getName();
        vip3.getCreditLimit();
        vip3.getEmail();


    }
}
