package Programs.JDBC.src;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertingInDB {
   public static void main(String[] args) {
    String url="jdbc:mysql://localhost:3306/JDBC";
    String username="root";
    String password ="Sugu@A0021";

    try{
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO students VALUES(3,'Sugu',20),(4,'Ram',20)";
        Statement statement = connection.createStatement();
        // statement.setInt(1,1);
        // statement.setString(2,"SK");
        // statement.setInt(3, 18);
        // int rows = statement.executeUpdate();
        statement.executeUpdate(sql);
        // System.out.println(rows);
        // if(rows>0){
            System.out.println("Row has been Inserted");
        // }

        statement.close();
        connection.close();
    }

    catch (SQLException e){
        System.out.println("Error");
        e.printStackTrace();
    }
   }

}
