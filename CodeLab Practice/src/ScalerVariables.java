public class ScalerVariables {
    public void dashedLine (int a){

        if (a>0){
            int i;
            for (i=1;i<=a;i++){
           //     System.out.println("the no of - : " +i);

            }


            System.out.println("total dash is " + i);

        }

    }

    public static void main(String[] args) {
        ScalerVariables q = new ScalerVariables();
        q.dashedLine(3);
    }

}
