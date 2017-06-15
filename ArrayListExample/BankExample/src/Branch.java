import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 14-03-2017.
 */
public class Branch {
    private ArrayList<Customers> customer;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public void addNewCustomer(String name, double initialTransaction){
        if(findCustomer(name) == -1) {
            this.customer.add(new Customers(name, initialTransaction));
            System.out.println("Customer added");
        }
        else
            System.out.println("Customer already exists");

    }

    public void addCustomerTransaction(String name, double transaction){
        int search = findCustomer(name);
        if(search != -1){
            //int index = customer.indexOf(name);
            customer.get(search).addTransaction(transaction);
        }
        else
            System.out.println("Customer not found");
    }

    public int findCustomer(String name){
        for(int i=0; i< customer.size(); i++){
            if(customer.get(i).getName().equals(name))
                return i;
        }
        return -1;

    }

    public void showCustomerTransaction(String name){
        int search = findCustomer(name);
        if(search!=-1){
            //int index = customer.indexOf(name);
            customer.get(search).showTransactions();
        }
        else
            System.out.println("Customer not found");

    }

    public void showCustomerList(){
        for(int i=0; i< customer.size(); i++){
            System.out.println(customer.get(i).getName());
        }
    }
}
