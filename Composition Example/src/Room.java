/**
 * Created by 5CB4125SDX0 on 11-03-2017.
 */
public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Table table;
    private Lamp lamp;
    private Couch couch;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Table table, Lamp lamp, Couch couch) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.table = table;
        this.lamp = lamp;
        this.couch = couch;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Table getTable() {
        return table;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Couch getCouch() {
        return couch;
    }
}
