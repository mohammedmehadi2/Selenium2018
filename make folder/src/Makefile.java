import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Makefile {

    public static void main(String[] args) {
        String i,j;



        File dir = new File("//Users//mohammedmehadi//Desktop//t");

        dir.mkdir();

        try{ File g = new File("//Users//mohammedmehadi//Desktop//t//u.text") ;
         g.createNewFile();}
        catch (Exception e){
            System.out.println(e);
        }

        try {
            Formatter write = new Formatter("//Users//mohammedmehadi//Desktop//t//u.text");

            Scanner q = new Scanner(System.in);
            System.out.print("Why are u here : ");
            i = q.nextLine();

            write.format("%s ", i );
            write.close();

        } catch (Exception q) {
            System.out.println("Error is :" + q);
        }



        System.out.println("get outta here");
        System.out.println("Please");
    }

}
