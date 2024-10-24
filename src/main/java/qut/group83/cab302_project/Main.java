package qut.group83.cab302_project;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Assuming you have a login screen that transitions to the home screen upon successful login
        new HomeScreen(primaryStage); // Start with the login screen
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
