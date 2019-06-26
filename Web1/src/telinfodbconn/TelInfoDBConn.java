package telinfodbconn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn {
    private Connection con;

    public Connection getConnection()   //Connection객체 리턴 메소드
    {
        return con;
    }

    public TelInfoDBConn()//Connection객체와 DB 연결 해주는 생성자
            throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");

    }   //TelInfoDBConn생성자를 만들면 자동으로 접속연결됨!!!
}
