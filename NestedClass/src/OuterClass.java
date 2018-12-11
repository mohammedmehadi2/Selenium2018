public class OuterClass {
    public String name;

InnerClassA Q = new InnerClassA();
    public void outerclassmethod() {

        System.out.println("This is outerclass method");
    Q.innerclassamethod();
    Innerclassb.innerclassbmethod();

    }



        public class InnerClassA {

            public void innerclassamethod() {
                System.out.println("This is the innerclassa method");
            }
            }

            public static class Innerclassb {
        private static void innerclassbmethod (){

            System.out.println( "this is innerbmethod");
        }


            }


    }

