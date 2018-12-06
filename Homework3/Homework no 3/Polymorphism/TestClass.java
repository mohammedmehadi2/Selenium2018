package Polymorphism;

public class TestClass {
    public static void main (String [] args) {

        Okk q = new Okk();

        q.doingpolymorphism(10, 20, 30);
        System.out.println("Overload : " + q.doingpolymorphism(10, 20, 30));

        q.doingpolymorphism(10, 20, 30, 40);
        System.out.println("Override : " + q.doingpolymorphism(10, 20, 30, 40));
    }
    }
