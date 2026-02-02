package cn.techtutorial.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce_cart",
                "root",
                "root@800"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
