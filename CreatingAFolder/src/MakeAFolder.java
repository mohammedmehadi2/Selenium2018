import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class MakeAFolder {

    public static void main(String[] args) {

        File folder = new File("/Users/mohammedmehadi/Desktop/Mynewfolder");
        folder.mkdir();
        if(folder.exists()){
            System.out.println(folder.getName()+ " is created");
            File file = new File("/Users/mohammedmehadi/Desktop/Mynewfolder/Mytext.text");
            try{file.createNewFile();}
            catch(Exception e){
                System.out.println("the error is : "+ e);
                }

            if (file.exists()) { System.out.println(file.getName()+" is created");
            System.out.println("Write something about maruf vi");
Scanner w = new Scanner(System.in);
        String userinput = w.nextLine();

                try{Formatter q = new Formatter("/Users/mohammedmehadi/Desktop/Mynewfolder/Mytext.text");

                q.format("%s", userinput);
                q.close();

                }catch (Exception r){System.out.println("the error is : "+ r);

                }
                System.out.println("get outta here");


            }



        }









    }

}
