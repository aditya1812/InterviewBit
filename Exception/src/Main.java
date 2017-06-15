import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by 5CB4125SDX0 on 24-03-2017.
 */
public class Main {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter x :");
        x = getInt();
        System.out.println("Enter y :");
        y = getInt();

        System.out.println("x is "+x+"and y is "+y);
        System.out.println("x / y is " +divide(x,y));
        write(x, y);
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        while(true) {
            try {
                return s.nextInt();
            } catch (ArithmeticException | NoSuchElementException e) {
                s.nextLine();
                System.out.println(e.toString());
                System.out.println("Enter an int only");
                //s.nextLine();
            }
        }

    }

    private static double divide(int x, int y){
        try{
            return (double) x/y;
        }catch(ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Division can not be performed");
            return 0;
        }

    }

    private static void write(int x, int y){
        FileWriter fw = null;
        try{
            fw = new FileWriter("FileWriteTest.txt");
            fw.write("X is "+x+" and y is "+y+" where x / y is "+ divide(x,y));
            fw.close();
        } catch(IOException e){
            System.out.println(e.toString());
        }

    }
}
