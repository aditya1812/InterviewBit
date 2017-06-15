/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class RoomMain {
    public static void main(String[] args) {
        Couch couch = new Couch(3);
        Bulb bulb = new Bulb("White",15);
        Table table = new Table("Wooden");
        Lamp lamp = new Lamp("Floor",bulb);
        Wall wall1 = new Wall("East","Red");
        Wall wall2 = new Wall("West","Red");
        Wall wall3 = new Wall("South","Orange");
        Wall wall4 = new Wall("North","Pink");


        Room room = new Room("Aditya's Room", wall1, wall2, wall3, wall4, table, lamp, couch);

        System.out.println("Enter into "+room.getName()+".");
        lamp.SwitchOn();
        System.out.println("Recliner has "+couch.getNoOfSeats()+" seats.");
        room.getCouch().recline(1);
        room.getLamp().getBulb().replace();
        System.out.println("Wall facing "+ room.getWall1().getDirection()+" has "+ room.getWall1().getColor()+" color.");
        room.getLamp().SwitchOff();

    }
}
