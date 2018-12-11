import java.io.BufferedReader;
import java.io.FileReader;

public class HowtoReadAfile {

    public static void main(String[] args) {
String data = "";
        try {
            FileReader tata = new FileReader("/Users/mohammedmehadi/Desktop/Mynewfolder/Mytext.text");


            BufferedReader bata = new BufferedReader(tata);
            while ((data = bata.readLine()) !=null){
                System.out.println(data);
            }

        } catch (Exception e){
            System.out.println("The error is : "+ e);
        }


    }

    }



