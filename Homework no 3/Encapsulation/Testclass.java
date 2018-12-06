package Encapsulation;

public class Testclass {

    public static void main(String[] args) {
        Office apple = new Office();



        apple.setEmplId(1);
        apple.setEmplName("Steve Jobs");

        System.out.println( apple.getEmplName() + " " + apple.getEmplId() );
    }
}
