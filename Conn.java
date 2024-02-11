package bank.management.system;

/**
 *
 * @author onkar
 */
import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
           
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","onkar2310");    
            s =c.createStatement();
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
