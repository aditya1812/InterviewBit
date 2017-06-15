import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 14-03-2017.
 */
public class Customers {
    private ArrayList<Double> transactions;
    private String name;

    public Customers(String name,double transaction) {
        this.transactions = new ArrayList<Double>();
        addTransaction(transaction);
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
        System.out.println("Transaction added");
    }

    public void showTransactions(){
        System.out.println("Transaction list for "+ getName());
        for(int i=0; i< transactions.size(); i++){
            System.out.println((double)transactions.get(i));
        }
    }
}
