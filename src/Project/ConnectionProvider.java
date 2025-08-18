package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://NITRO_5\\SQLEXPRESS;databaseName=HotelManagement;encrypt=true;trustServerCertificate=true;integratedSecurity=true";
            Connection con = DriverManager.getConnection(dburl);
            return con;
        } catch (Exception ex) {
            return null;
        }
    }
}
