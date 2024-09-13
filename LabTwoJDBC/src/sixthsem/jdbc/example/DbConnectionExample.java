
package sixthsem.jdbc.example;

// required packages

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet; // database bata data lyauna ko lagi
import java.sql.SQLException;

public class DbConnectionExample {
    public static void main(String[] args) {
        
        try{
            
            // INSTALLING JDBC DRIVER
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        //step 2 Configuring DB HOST AND USER CREDENTIALS 
        String DB_USER ="root";
        String DB_PASSWORD="*theheirs#123";
        String DB_NAME ="jdbc_test";
        String DB_URL ="jdbc:mysql://localhost:3306/"+DB_NAME;
        
        //step 3: creating db connection
        
        Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        
    
      // step 4: Creating statement
        
        String sql = "INSERT INTO user(full_name,username,password)" 
                + " VALUES('Alisha Mdhr','mdhralisha','a123')";
        
        Statement stmt = con.createStatement();
        
        // step 5 : executing sql statement
        
        int status = stmt.executeUpdate(sql);
        if(status>0){
            System.out.println("Data inserted successfully");
        }else{
            System.out.println("Something went Wrong");
        }
        
    }
        
    catch(ClassNotFoundException | SQLException e){
                System.out.println("Message"+e.getMessage());
                
            }
    }
}
            

