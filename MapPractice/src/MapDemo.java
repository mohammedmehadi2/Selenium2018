import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,String> State = new LinkedHashMap<>();



        State.put("S1", "Data od key S1");
        State.put("S2", "Data od key S2");
        State.put("S3", "Data od key S3");
        State.put("S4", "Data od key S4");


        for (Map.Entry entry: State.entrySet()){

            System.out.println(entry);
        }















    }








}
