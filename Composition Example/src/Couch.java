/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class Couch {
    private int noOfSeats;

    public Couch(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void recline(int i){
        System.out.println("Seat "+i+" of Couch Reclined");
    }
}
