import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 09-05-2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        String q;
        LinkedList ll = new LinkedList();
        while (!quit) {
            System.out.println("Enter choice");
            System.out.println("1: Add at start");
            System.out.println("2: Add at end");
            System.out.println("3: Add at position");
            System.out.println("4: Delete at position");
            System.out.println("5: Get size");
            System.out.println("6: Display");

            int c = s.nextInt();
            int val, index;

            System.out.println("You entered " + c);
            switch (c) {
                case 1:
                    System.out.println("Enter int value to add at start ");
                    val = s.nextInt();
                    ll.insertAtStart(val);
                    System.out.println("Size = " + ll.getSize());
                    ll.display();
                    break;

                case 2:
                    System.out.println("Enter int value to add at end ");
                    val = s.nextInt();
                    ll.insertAtEnd(val);
                    System.out.println("Size = " + ll.getSize());
                    ll.display();
                    break;

                case 3:
                    System.out.println("Enter the position and value ");
                    index = s.nextInt();
                    val = s.nextInt();
                    ll.insertAtPosition(index,val);
                    System.out.println("Size = " + ll.getSize());
                    ll.display();
                    break;

                case 4:
                    System.out.println("Enter the position for deletion");
                    index = s.nextInt();
                    ll.deleteAtPosition(index);
                    System.out.println("Size = " + ll.getSize());
                    ll.display();
                    break;

                case 5:
                    System.out.println("Size = " + ll.getSize());
                    break;

                case 6:
                    System.out.println("Linked List");
                    ll.display();
                    break;

            }
            System.out.println("Do you want quit (y/n)");
            s.nextLine();
            q = s.nextLine();
            if(q.toLowerCase().equals("y"))
                quit = true;
        }

    }
}
