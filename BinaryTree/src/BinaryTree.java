/**
 * Created by 5CB4125SDX0 on 17-05-2017.
 */
public class BinaryTree {
    private Node root;
    private int height;

    public BinaryTree() {
        this.root = null;
        this.height = -1;
    }

    public Node getRoot() {
        return root;
    }

    public int getHeight() {
        if(root == null){
            System.out.println("Tree empty");
        }
        else

            countHeight(root);
        return height;
    }

    public void insert(int val){
        root = insert(root, val);
    }

    public Node insert(Node node, int val){
        if(node == null) {
            node = new Node(val);
            //0.System.out.println("Root created");
        }

        else if(val <= node.getData()){
            node.setLeft(insert(node.getLeft(),val));
        }
        else
            node.setRight(insert(node.getRight(),val));
        //height++;
        return node;
    }

    public void countHeight(Node node){
        if(node != null){
            //System.out.print(node.getData()+" ");
            height++;
            countHeight(node.getLeft());
            countHeight(node.getRight());
        }

    }

    public void search(int val){
        //System.out.println(root.getData());
        if(search(root,val))
            System.out.println(val+" present");
        else
            System.out.println(val+" NOT present");

    }

    public boolean search(Node root, int val){

        if(val == root.getData())
            return true;

        else if(val < root.getData()){
            if(search(root.getLeft(),val))
                return true;
        }
        else
            if(search(root.getRight(), val))
                return true;

        return false;
    }

    public void preorder(){
        if(root == null){
            System.out.println("Tree empty");
        }
        else
            preorder(root);
    }

    public void preorder(Node node){
        if(node != null){
            System.out.print(node.getData()+" ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void inorder(){
        if(root == null){
            System.out.println("Tree empty");
        }
        else
            inorder(root);
    }

    public void inorder(Node node){
        if(node != null){
            inorder(node.getLeft());
            System.out.print(node.getData()+" ");
            inorder(node.getRight());
        }
    }

    public void postorder(){
        if(root == null){
            System.out.println("Tree empty");
        }
        else
            postorder(root);
    }

    public void postorder(Node node){
        if(node != null){
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData()+" ");
        }
    }


}
