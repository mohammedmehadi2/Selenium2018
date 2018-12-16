public class Singletondemo {
    private static Singletondemo singleton = new Singletondemo();


    private Singletondemo(){}
    public static Singletondemo getInstance(){

        return singleton;
    }
    public void display (){
        System.out.println("This is singleton");



    }






}
