package qut.group83.cab302_project;

import java.sql.*;

public class UserDAO {
    private Connection connection;

    public UserDAO() {
        connection = DatabaseConnection.getInstance();
    }

    public void createTable() {
        try {
            Statement createTable = connection.createStatement();
            createTable.execute(
                    "CREATE TABLE IF NOT EXISTS Users ("
                            + "userId VARCHAR PRIMARY KEY, "
                            + "UserName VARCHAR NOT NULL, "
                            + "Password VARCHAR NOT NULL"
                            + ")"
            );
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public void insert(User user) {
        try {
            PreparedStatement insertAccount = connection.prepareStatement(
                    "INSERT INTO Users (userId, userName, password) VALUES (?, ?, ?)"
            );
            insertAccount.setString(1, user.getUserId()); // Set userId
            insertAccount.setString(2, user.getUserName());
            insertAccount.setString(3, user.getPassWord());
            int rowsInserted = insertAccount.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public User getByUsernameAndPassword(String userName, String passWord) {
        String sql = "SELECT * FROM Users WHERE userName = ? AND passWord = ?";

        try (PreparedStatement getAccount = connection.prepareStatement(sql)) {
            // Set the parameters for username and password
            getAccount.setString(1, userName);
            getAccount.setString(2, passWord);

            // Execute the query
            ResultSet rs = getAccount.executeQuery();

            // Process the result set
            if (rs.next()) {
                return new User(
                        rs.getString("userId"),
                        rs.getString("userName"),
                        rs.getString("passWord")
                );
            }
        } catch (SQLException ex) {
            System.err.println("Error retrieving account: " + ex.getMessage());
        }

        return null; // No account found
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
