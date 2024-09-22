package qut.group83.cab302_project;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterPage {
    public RegisterPage(Stage primaryStage) {
        VBox root = new VBox(10);

        TextField usernameField = new TextField();
        TextField passwordField = new TextField();
        TextField emailField = new TextField();
        Button submitButton = new Button("Register");

        root.getChildren().addAll(
                new Label("Username:"),
                usernameField,
                new Label("Password:"),
                passwordField,
                submitButton
        );

        submitButton.setOnAction(e -> {
            // Here you can add your registration logic
            primaryStage.setScene(primaryStage.getScene()); // Optionally navigate back or elsewhere
        });

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Register");
    }
}
