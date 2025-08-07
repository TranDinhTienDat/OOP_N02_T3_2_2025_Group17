package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    protected static final String URL = "jdbc:mysql://localhost:3306/benhvien";
    protected static final String USER = "root";
    protected static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


