package qut.group83.cab302_project;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class LoginScreen {

    public LoginScreen(Stage primaryStage) {
        VBox root = new VBox(10);


        Label userLabel = new Label("User:");
        TextField userField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Button signUpButton = new Button("Sign Up");
        Button homeButton = new Button("Home");  // Add Home button

        Label loginFailedLabel = new Label();
        loginFailedLabel.setStyle("-fx-text-fill: red;");

        root.getChildren().addAll(userLabel, userField, passwordLabel, passwordField, loginButton, signUpButton, homeButton, loginFailedLabel);

        // Implement login logic
        loginButton.setOnAction(e -> {
            if (validateLogin(userField.getText(), passwordField.getText())) {
                root.getChildren().remove(loginFailedLabel);  // Clear error on success
                new HomeScreen(primaryStage); // Navigate to home page
            } else {
                loginFailedLabel.setText("Login Failed: Invalid username or password");
                if (!root.getChildren().contains(loginFailedLabel)) {
                    root.getChildren().add(loginFailedLabel);
                }
            }
        });

        // Navigate to sign-up page
        signUpButton.setOnAction(e -> new RegisterPage(primaryStage));

        // Navigate to home page directly when Home button is clicked
        homeButton.setOnAction(e -> new HomeScreen(primaryStage));

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
    }

    private boolean validateLogin(String username, String password) {
        // Placeholder for actual hashed password comparison
        String storedHashedPassword = "rpbJioJqUGRVDiSXT2fjhGFlhKvklw4y2oZ9vU2zMFo="; // Example hashed password ("pass")
        try {
            return "user".equals(username) && storedHashedPassword.equals(hashPassword(password));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }
}
