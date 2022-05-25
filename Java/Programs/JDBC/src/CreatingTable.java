
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {
   public static void main(String[] args) {
    String url="jdbc:mysql://localhost:3306/JDBC";
    String username="root";
    String password ="Sugu@A0021";
    
    try{
        Connection connect = DriverManager.getConnection(url, username, password);
        String sql="CREATE TABLE Students(id int primary key auto_increment, Name varchar(25), Age tinyint)";
        Statement stmt = connect.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Student Table Executed");  
    }

    catch(SQLException e){
        System.out.println("Program is Showing Error");
        e.printStackTrace();
    }
    
   } 
}
