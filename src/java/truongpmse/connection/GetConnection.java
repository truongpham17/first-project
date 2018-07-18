
package truongpmse.connection;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection implements Serializable {

    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "jdbc:sqlserver://TRUONGPMSE63192:1433;databaseName=DutchBoyDB;instanceName=MSSQLSERVER1";
        Connection conn = DriverManager.getConnection(sql, "sa", "123456");
        return conn;
    }
}
