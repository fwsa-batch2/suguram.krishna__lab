package Programs.JDBC.src;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterTable {
    public static void main(String[] args) throws IOException{
        String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password ="Sugu@A0021";
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            String str1 = "ALTER TABLE students MODIFY age INT";
            PreparedStatement statement = connection.prepareStatement(str1);
            statement.executeUpdate();
            System.out.println("Modified the Table");
            statement.close();
            connection.close();
        }

        catch(SQLException e){
            System.out.println("Error");
            e.printStackTrace();
        }


    }
}
