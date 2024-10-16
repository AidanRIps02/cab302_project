package qut.group83.cab302_project;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterPage {

    public RegisterPage(Stage primaryStage) {
        VBox root = new VBox(10);

        Label userLabel = new Label("Username:");
        TextField userField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button registerButton = new Button("Register");
        Button backButton = new Button("Back");

        root.getChildren().addAll(userLabel, userField, passwordLabel, passwordField, registerButton, backButton);

        // Navigate back to login page on pressing "Back"
        backButton.setOnAction(e -> new LoginScreen(primaryStage));

        // Implement registration logic
        registerButton.setOnAction(e -> {
            // Add logic for registering new user
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registration");
            alert.setHeaderText(null);
            alert.setContentText("Registration successful! Returning to login page.");
            alert.showAndWait();
            new LoginScreen(primaryStage);
        });

        Scene scene = new Scene(root, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Register");
    }
}
