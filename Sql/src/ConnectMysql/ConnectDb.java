package ConnectMysql;
import sun.tools.tree.FinallyStatement;

import java.sql.*;


public class ConnectDb {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mygroup?useSSL=false&allowPublicKeyRetrieval=true", "root", "Iphone6s");
            Statement myst = mycon.createStatement();
            ResultSet myrs = myst.executeQuery("select * from members");
            while (myrs.next()) {
                System.out.println(myrs.getString("id") + " : " + myrs.getString("firstname") + "," + myrs.getString("lastname"));
            }
myst.close();
mycon.close();


        } catch (Exception e) {
            System.out.println("the error is : " + e);



        }

        }
    }


