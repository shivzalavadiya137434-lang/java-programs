
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";

        Properties p = new Properties();
        p.setProperty("user", "sys");
        p.setProperty("password", "1234");
        p.setProperty("internal_logon", "sysdba");

        return DriverManager.getConnection(url, p);
    }
}
