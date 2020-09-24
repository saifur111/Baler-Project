
package unifinder;

import java.sql.*;
import javax.swing.JOptionPane;
public class Connectjava {
   Connection con;
   
   public static Connection ConnecrDb(){
      System.out.println("Update Value in Mysql Database table!");
      Connection con=null;
      String url="jdbc:mysql://localhost:3306/";
      String db="msrsdb";
      String driver="com.mysql.cj.jdbc.Driver";
       try{
           Class.forName(driver);
           con=DriverManager.getConnection(url + db,"root","");
           System.out.println("Successfull Connection");
        return con;
   }catch(Exception e){
       
       JOptionPane.showMessageDialog(null, e);
       return null;
   }
       
}
 
}
