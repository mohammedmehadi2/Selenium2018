public class SwappingString {

    public static void main(String[] args) {

        String x = "Framework";
        String y = "Automation";
        System.out.println("before Swapping");
        System.out.println("value of x ; " + x);
        System.out.println("value of y ; " + y);

        x = x + y;
        y = x.substring(0, x.length() - y.length());

        x = x.substring(y.length());

        System.out.println("after Swapping");
        System.out.println("value of x ; " + x);
        System.out.println("value of y ; " + y);

    }



}
