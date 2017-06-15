import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 09-05-2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice,val;
        String str;

        //boolean q = false;
        Stack st = new Stack();
        while(true){
            System.out.println("Enter your choice");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Size");
            System.out.println("4: Display");
            System.out.println("5: Reverse string");

            choice = s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter an int to push on stack");
                    val = s.nextInt();
                    st.push(val);
                    System.out.println("After pushing "+val+" stack is:");
                    st.printStack();
                    break;

                case 2:
                    System.out.println("After popping top of stack");
                    st.pop();
                    st.printStack();
                    break;

                case 3:
                    System.out.println("Size os the stack is "+st.getSize());
                    break;

                case 4:
                    System.out.println("Stack is");
                    st.printStack();
                    break;

                case 5:
                    System.out.println("Enter string to reverse ");
                    s.nextLine();
                    str = s.nextLine();
                    ReverseString revStr = new ReverseString(str.toCharArray());
                    System.out.println("Reversed string "+revStr.reverseString());
                    break;



            }
            System.out.println("Do you want to quit? (y/n)");
            if(s.nextLine().equals("y"))
                break;
            else if(s.nextLine().equals("n"))
                continue;

        }
    }
}
