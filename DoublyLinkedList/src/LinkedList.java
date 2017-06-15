/**
 * Created by 5CB4125SDX0 on 09-05-2017.
 */
public class LinkedList {
    private Node start;
    private Node end;
    private int size;

    public int getSize() {
        return size;
    }

    public LinkedList() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public void insertAtStart(int val){
        Node n = new Node(null, null ,val);
        size++;
        if(isEmpty()){
            start = n;
            end = n;
        }
        else {
            n.setNext(start);
            start.setPrev(n);
            start = n;
        }
    }

    public void insertAtEnd(int val){
        Node n = new Node(null, null, val);
        size++;
        if(isEmpty()){
            start = n;
            end = n;
        }
        else {
            n.setPrev(end);
            end.setNext(n);
            end = n;
        }
    }

    public void insertAtPosition(int index, int val){
        if(index>size){
            System.out.println("Out of index");
            return;
        }
        if(index == 1) {
            insertAtStart(val);
            return;
        }
        Node n = new Node(null, null, val);
        Node t = new Node();
        Node s = start;
        index--;
        //index--;
        for(int i = 1; i < size; i++){

            if(i==index){
                t = s.getNext();
                s.setNext(n);
                n.setPrev(s);
                n.setNext(t);
                t.setPrev(n);


/*                n.setNext(s);
                n.setPrev(s.getPrev());
                s.setPrev(n);
                s.getPrev().setNext(n);*/
                size++;
                break;

            }
            s = s.getNext();
        }

    }

    public void deleteAtPosition(int index){
        if(index>size||index<0){
            System.out.println("Out of index");
            return;
        }

        Node s = start;
        Node t = new Node();
        index--;

        if(index == 0){
            start = s.getNext();
            start.setPrev(null);
            size--;
        }
        else if(index == size-1){
            for(int i = 0; i < size-2; i++){
                s = s.getNext();
            }
            s.setNext(null);
            end = s;
            size--;
        }
        else{
            for(int i = 1; i < size - 2; i++){

                if(i == index){
                    t = s.getNext();
                    s.setNext(t.getNext());
                    t.getNext().setPrev(s);
                    size--;
                    break;
                }
                s = s.getNext();
            }

        }
    }

    public void display(){
        if(size == 0){
            System.out.println("Empty list");
        }
        else{
            Node s = start;
            do{
                if(s.getNext()!=null)
                    System.out.print(s.getVal()+" <-> ");
                else
                    System.out.print(s.getVal());
                s = s.getNext();
            }while(s!=null);
        }
        System.out.println();
    }

}
