import java.util.ArrayList;

/**
 * Created by 5CB4125SDX0 on 13-03-2017.
 */
public class Mobile {
    private ArrayList <String> contacts = new ArrayList<String>();

    public Mobile(ArrayList<String> contacts) {
        this.contacts = contacts;
    }

    public void addContact(String name, long number){
        boolean index = this.contacts.contains(name);
        System.out.println(index);
        if(index)
            System.out.println("Contact already exists");
        else {
            ContactList contact = ContactList.createContact(name,number);
            this.contacts.add(name);
            System.out.println("Contact added");
        }
        //return contacts;
    }
    public void removeContact(String name){
        int position;
        position = contacts.indexOf(name);
        contacts.remove(position);
        //return contacts;

    }

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void updateContact(String oldName, String newName){
        System.out.println(oldName +" "+ newName);
        int position = contacts.indexOf(oldName);
        System.out.println(position);
        if(position < 0)
                System.out.println("Contact not found");

        else
            contacts.set(position,newName);

    }
    public void displayList(){
        //ArrayList<String> c= new ArrayList<String>();
        System.out.println("Contact list :");
        for(int i=0; i<contacts.size();i++){
            System.out.println(i+1+" :"+" "+contacts.get(i));
            //System.out.println(contacts.get(i));
        }
    }


}
