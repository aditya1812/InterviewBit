import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 14-03-2017.
 */
public class Bank {
    private ArrayList<Branch> branch;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public void addBranch(String name){
        if(findBranch(name) == -1) {
            Branch br = new Branch(name);
            this.branch.add(br);
        }
        else
            System.out.println("Branch already exists");
    }

    public void showBranchList(){
        for(int i=0; i< branch.size(); i++){
            System.out.println(branch.get(i).getName());
        }
    }

    public void addNewCustomer(String branchName, String name, double initialTransaction){

        int search = findBranch(branchName);
        System.out.println(branchName+" "+search);
        if(search == -1) {
            System.out.println("Branch not found");
        }
        else{
            //int index = branch.indexOf(branchName);
            branch.get(search).addNewCustomer(name, initialTransaction);
        }
    }

    public void addCustomerTransaction(String branchName, String name, double transaction){
        System.out.println(branchName);
        int search = findBranch(branchName);
        if(search == -1) {
            System.out.println("Branch not found");
        }
        else{
            //int index = branch.indexOf(branchName);
            branch.get(search).addCustomerTransaction(name, transaction);
        }
    }

    public void showCustomerTransaction(String branchName, String name){
        int search = findBranch(branchName);
        if(search == -1) {
            System.out.println("Branch not found");
        }
        else{
            //int index = branch.indexOf(branchName);
            branch.get(search).showCustomerTransaction(name);
        }
    }


    public void showCustomerList(String branchName){
        int search = findBranch(branchName);
        if(search == -1) {
            System.out.println("Branch not found");
        }
        else{
            //int index = branch.indexOf(branchName);
            branch.get(search).showCustomerList();
        }
    }
    public int findBranch(String name){
        for(int i=0; i< branch.size(); i++) {
            if (branch.get(i).getName().equals(name))
                return i;
        }
        return -1;

    }
}
