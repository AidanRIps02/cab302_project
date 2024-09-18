package qut.group83.cab302_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // URL user database
    private static final String DB_Users = "jdbc:sqlite:database.db";

    private static Connection instance = null;

    private DatabaseConnection() {

        try {
            instance = DriverManager.getConnection(DB_Users);
        } catch (SQLException sqlEx) {
            System.err.println(sqlEx);
        }
    }

    public static Connection getInstance() {
        if (instance == null) {
            new DatabaseConnection();
        }
        return instance;
    }

}
