import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 17-05-2017.
 */
public class Main {
    public static void main(String[] args) {
        int val, ch;
        Scanner s = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        while(true){
            System.out.println("1: Insert");
            System.out.println("2: Search");
            System.out.println("3: Height");
            System.out.println("4: Preorder");
            System.out.println("5: Inorder");
            System.out.println("6: Postorder");
            System.out.println("Enter choice");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter int value to insert: ");
                    val = s.nextInt();
                    bt.insert(val);
                    System.out.println(bt.getRoot().getData());
                    //System.out.println(bt.getRoot().getLeft().getData());
                    break;

                case 2:
                    System.out.println("Enter int value to search: ");
                    val = s.nextInt();
                    bt.search(val);
                    break;

                case 3:
                    System.out.println("Height of tree is: "+bt.getHeight());
                    break;

                case 4:
                    System.out.println("Preorder tree traversal is");
                    bt.preorder();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Inorder tree traversal is");
                    bt.inorder();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Postorder tree traversal is");
                    bt.postorder();
                    System.out.println();
                    break;
            }
            System.out.println("Do you want to continue(y/n)?");
            s.nextLine();
            if(s.nextLine().equals('n'))
                break;

        }
    }
}
