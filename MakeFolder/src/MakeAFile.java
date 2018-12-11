import java.io.File;

public class MakeAFile {

    public static void main(String[] args) {

        File folder = new File("/users/mohammedmehadi/desktop/Maruf vi");
        folder.mkdir();
        System.out.println(folder.getName()+ "\n" +folder.getAbsolutePath());
        try {
            File file = new File("/users/mohammedmehadi/desktop/Maruf vi/aboutmarufvi.text");
            file.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }




    }

}
