package kernel.core.database;

import java.sql.*;

/**
 * Created by user on 05.11.2015.
 */
public class Database {

    int testID = 0;

    Connection connection = null;
    String dbUrl = "jdbc:postgresql://127.0.0.1:5432/test";
    String userName ="postgres";
    String userPassword = "testPass";
    Statement statement;

    public void connectDB() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(dbUrl, userName, userPassword);
            statement = connection.createStatement();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getRequest(String request) {
        connectDB();
        ResultSet result = null;
        try {
            result = statement.executeQuery(request);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
        return result;
    }

    private void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {

            }
    }
    }

//    select column_name from information_schema.columns where information_schema.columns.table_name='products';


}
