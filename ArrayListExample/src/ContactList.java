/**
 * Created by 5CB4125SDX0 on 14-03-2017.
 */
public class ContactList {
    private String contactName;
    private long number;

    public ContactList(String contactName, long number) {
        this.contactName = contactName;
        this.number = number;
    }

    public String getContactName() {
        return contactName;
    }

    public long getNumber() {
        return number;
    }

    public static ContactList createContact(String contactName, long number){
        return new ContactList(contactName, number);
    }
}
