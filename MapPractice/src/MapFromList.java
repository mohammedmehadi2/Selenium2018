import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapFromList {
    public static void main(String[] args) {

        List<String> listofdata = new ArrayList<String>();
        listofdata.add("Data 111");
        listofdata.add("Data 222");
        listofdata.add("Data 333");
        listofdata.add("Data 444");

        List<String> listofdata2 = new ArrayList<String>();
        listofdata2.add("Data qqq");
        listofdata2.add("Data www");
        listofdata2.add("Data eee");
        listofdata2.add("Data rrr");

        Map<String, List<String >> list = new LinkedHashMap<>();
        list.put("q1", listofdata);
        list.put("q2", listofdata2);

        for (Map.Entry entry : list.entrySet()){
            System.out.println(entry);


        }






    }





}
