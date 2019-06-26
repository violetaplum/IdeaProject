package snsCONN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SnsCONN {
    private Connection conn;
    public Connection getConnection()
    {
        return conn;
    }
    public SnsCONN()
        throws ClassNotFoundException,SQLException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","root","root");

    }
}
