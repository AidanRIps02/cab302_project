package qut.group83.cab302_project;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginScreen {
    public LoginScreen(Stage primaryStage) {
        VBox root = new VBox(10);

        Label userLabel = new Label("User:");
        TextField userField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Button signUpButton = new Button("Sign Up");

        root.getChildren().addAll(userLabel, userField, passwordLabel, passwordField, loginButton, signUpButton);

        // Implement login logic
        loginButton.setOnAction(e -> {
            if (validateLogin(userField.getText(), passwordField.getText())) {
                new HomeScreen(primaryStage); // Navigate to the home page on successful login
            } else {
                Label loginFailedLabel = new Label("Login Failed: Invalid username or password");
                root.getChildren().add(loginFailedLabel);
            }
        });

        // Navigate to sign-up page
        signUpButton.setOnAction(e -> new RegisterPage(primaryStage));

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
    }

    private boolean validateLogin(String username, String password) {
        // Placeholder for actual authentication logic
        return "user".equals(username) && "pass".equals(password);
    }
}
