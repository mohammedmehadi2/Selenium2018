import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
Scanner r = new Scanner(System.in);
a = r.nextInt();
b = r.nextInt();

        a= a+ b;
        b = a - b ;
        a = a- b;

        System.out.println(a +"\n" +b );




    }

}
