import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCOdbcExample{
    public static void main(String[] args){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = DriverManager.getConnection("jdbc:odbc:myDataSourceAkshat",
                    "localhost", "12345akshat");
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("Column1"));
                System.out.println("Column2: " + resultSet.getString("Column2"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
