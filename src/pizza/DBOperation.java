
package pizza;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;

public class DBOperation {
    
   private Connection con=null;
   private PreparedStatement pst=null;
   private ResultSet rs=null;
    
   private final String url ="jdbc:mysql://localhost:3306/studentdetails";
   private final String user="root";
   private final String password="";
   
   public boolean addCustomer(Customer customer){
       try{
            con=(Connection)DriverManager.getConnection(url,user,password);
            pst=(PreparedStatement)con.prepareStatement ("INSERT INTO studentdetails.student VALUES(?,?,?,?,?change)");//change the da name and table name
            pst.setString   (1,customer.getTitle());
            pst.setString   (2,customer.getName());
            pst.setInt      (3,customer.getCallingNumber());
            pst.setInt      (4, customer.getRegulerPhoneNumber());
            pst.setString   (5,customer.getBadge());
            
            pst.setString   (6,customer.getStreet());
            pst.setInt      (7,customer.getBlockOrHouseNumber());
            pst.setString   (8,customer.getCrossroad());
            pst.setString   (9,customer.getLandmark());
            
       
            pst.executeUpdate();
       }catch(Exception e){
           System.out.println(e);
           return false;
       }
       return true;
   }
   
   public Customer loadCustomer(Customer customer ,int number){
       return null;
   
   }
   
   public void updateCustomer(){
   
   
   }
    
}
