package qut.group83.cab302_project;
import java.sql.Connection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        Connection connection = DatabaseConnection.getInstance();

        // Initialize the User and Alarms DAO
        UserDAO userDAO = new UserDAO();
        AlarmsDAO alarmsDAO = new AlarmsDAO();

        // Create the tables
        userDAO.createTable();
        alarmsDAO.createTable();

        // Test Stuff
        // Create a new user (if needed)
        //User user = new User("password123", "testUser");
        //userDAO.insert(user);

        // Retrieve the user after insertion to get the userId
        //User retrievedUser = userDAO.getByUsernameAndPassword("testUser", "password123");

        // Create a new alarm for the user using the userId
        //Alarms alarm = new Alarms(retrievedUser.getUserId(), 0, "Thunder Storm", "WhoopWhoop", "Severe", "Hurricane warning in effect!", true);
        //alarmsDAO.insert(alarm);

        // Retrieve all alarms for the user by userId
        //ResultSet alarmsResultSet = alarmsDAO.getAlarmsByUserId(retrievedUser.getUserId());

        /*
        try {
            // Process the ResultSet to print out each alarm's details
            while (alarmsResultSet != null && alarmsResultSet.next()) {
                System.out.println("Alarm ID: " + alarmsResultSet.getInt("alarmId"));
                System.out.println("User ID: " + alarmsResultSet.getString("userId")); // Display the associated user ID
                System.out.println("Event Type: " + alarmsResultSet.getString("eventType"));
                System.out.println("Location: " + alarmsResultSet.getString("location"));
                System.out.println("Severity: " + alarmsResultSet.getString("severity"));
                System.out.println("Message: " + alarmsResultSet.getString("message"));
                System.out.println("Is Active: " + alarmsResultSet.getBoolean("isActive"));
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        */


        // Close the DAO connections
            userDAO.close();
            alarmsDAO.close();
    }
}
