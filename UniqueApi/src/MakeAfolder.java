import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class MakeAfolder {
    public static void main(String[] args) {

        File folder = new File("/Users/mohammedmehadi/Desktop/myfolder");

        folder.mkdir();

        if (folder.exists()){
            System.out.println(folder.getName() +" is created");}
          File file = new File("/Users/mohammedmehadi/Desktop/myfolder/mytext.text");
            try {file.createNewFile();}
         catch (Exception e){ System.out.println(e); }
            if (file.exists()){
                System.out.println(file.getName()+ " is created");
            }
System.out.print("Please write here to be stored in text file : ");
Scanner userinput1 = new Scanner(System.in);
            String input = userinput1.nextLine();
            System.out.print("type one more line : ");
            String g = userinput1.nextLine();
            /*Scanner userinput2 = new Scanner(System.in);
            String input2 = userinput2.nextLine();*/
        try {Formatter write = new Formatter("/Users/mohammedmehadi/Desktop/myfolder/mytext.text");


                write.format("%s %s", input, g );
                write.close();
            }catch (Exception t){
                System.out.println(t);
            }
        System.out.println("get outta here");


    }
}
