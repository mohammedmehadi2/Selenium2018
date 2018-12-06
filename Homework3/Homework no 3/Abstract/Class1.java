package Abstract;

public class Class1 extends Abstract1 {

    public static void main(String[]args) {
        Class1 one = new Class1();
        one.methodInterface();
        one.AbstractMethod();
        one.methodAbstract();



    }
    public void methodInterface() {
        System.out.println("method of interface");


    }


    public void AbstractMethod() {
        System.out.println("method of abstract");



    }
}
