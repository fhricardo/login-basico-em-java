// src/database/DatabaseConnection.java
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static final String URL = "jdbc:mysql://localhost:3306/_BANCO_?useSSL=false";
    private static final String USER = "_USUARIO_";
    private static final String PASSWORD = "_SENHA_";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
