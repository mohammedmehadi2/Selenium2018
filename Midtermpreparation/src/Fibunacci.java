
import java.util.Arrays;

public class Fibunacci {
    public static void main(String[] args) {
        int [] fibo = new int[20];

        for (int i = 0;i <20; i ++){

            if (i <2){

                fibo[i]=i;}
            else {
                fibo[i]=fibo[i-2] + fibo [i -1] ;
            }
            }//end of for loop
        System.out.println(Arrays.toString(fibo));

            }
        }






