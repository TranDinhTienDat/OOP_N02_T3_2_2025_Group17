package database;

import java.sql.Connection;

public class HospitalConnection extends DBConnection {
    public static void testConnection() {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }
    }
}
