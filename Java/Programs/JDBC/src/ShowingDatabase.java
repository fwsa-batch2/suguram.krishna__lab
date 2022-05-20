package Programs.JDBC.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ShowingDatabase {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password ="Sugu@A0021";
        
        Connection connect = DriverManager.getConnection(url, username, password);
			String sql="SHOW DATABASES";
			Statement swetha = connect.createStatement();
			// swetha.executeUpdate(sql);
            ResultSet pavan = swetha.executeQuery(sql);
            while(pavan.next()){
                String col1 = pavan.getString(1);
                System.out.println(col1);
            }
			System.out.println("Swetha got executed");
    }
}
