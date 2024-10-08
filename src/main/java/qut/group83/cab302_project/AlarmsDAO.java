package qut.group83.cab302_project;
import java.sql.*;

public class AlarmsDAO {
    private Connection connection;

    public AlarmsDAO() {
        connection = DatabaseConnection.getInstance(); // Assume DatabaseConnection is a singleton
    }

    // Method to create the Alarms table
    public void createTable() {
        try {
            Statement createTable = connection.createStatement();
            createTable.execute(
                    "CREATE TABLE IF NOT EXISTS Alarms ("
                            + "alarmId INTEGER PRIMARY KEY AUTOINCREMENT, "
                            + "userId TEXT NOT NULL, "
                            + "eventType TEXT NOT NULL, "
                            + "location TEXT NOT NULL, "
                            + "severity TEXT NOT NULL, "
                            + "message TEXT NOT NULL, "
                            + "isActive BOOLEAN NOT NULL, "
                            + "FOREIGN KEY (userId) REFERENCES Users(userId)"
                            + ")"
            );
        } catch (SQLException ex) {
            System.err.println("Error creating alarms table: " + ex.getMessage());
        }
    }

    // Method to insert an alarm
    public void insert(Alarms alarm) {
        if (alarm.getUserId() == null || alarm.getEventType() == null ||
                alarm.getLocation() == null || alarm.getSeverity() == null ||
                alarm.getMessage() == null) {
            System.err.println("Cannot insert alarm: missing required fields.");
            return;
        }

        String insertSql = "INSERT INTO Alarms (userId, eventType, location, severity, message, isActive) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement insertAlarm = connection.prepareStatement(insertSql)) {
            insertAlarm.setString(1, alarm.getUserId()); // Assuming userId is accessible in Alarms
            insertAlarm.setString(2, alarm.getEventType());
            insertAlarm.setString(3, alarm.getLocation());
            insertAlarm.setString(4, alarm.getSeverity());
            insertAlarm.setString(5, alarm.getMessage());
            insertAlarm.setBoolean(6, alarm.isActive());
            insertAlarm.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error inserting alarm: " + ex.getMessage());
        }
    }

    // Method to retrieve alarms for a specific user by userId
    public ResultSet getAlarmsByUserId(String userId) {
        ResultSet rs = null;
        try {
            PreparedStatement getAlarms = connection.prepareStatement(
                    "SELECT * FROM Alarms WHERE userId = ?"
            );
            getAlarms.setString(1, userId);
            rs = getAlarms.executeQuery();
        } catch (SQLException ex) {
            System.err.println("Error retrieving alarms: " + ex.getMessage());
        }
        return rs; // Return ResultSet for processing
    }

    // Method to close the connection
    public void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.err.println("Error closing connection: " + ex.getMessage());
        }
    }
}


