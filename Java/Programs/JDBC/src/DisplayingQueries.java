package Programs.JDBC.src;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayingQueries {
    public static void main(String[] args) throws IOException{
        String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password ="Sugu@A0021";
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            String sql = "SELECT*FROM students";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                int id = result.getInt(1); 
                String Name = result.getString(2);
                int Age = result.getInt(3);
                System.out.println("Student Roll NO: " +id +" " +"Name: " +Name + "Age: " +Age);
            }
            connection.close();

        }

        catch(SQLException e){
            System.out.println("Error");
            e.printStackTrace();
        }


    }
}
