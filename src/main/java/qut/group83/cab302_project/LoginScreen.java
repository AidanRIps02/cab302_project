package qut.group83.cab302_project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginScreen {
    public LoginScreen(Stage primaryStage) {
        // Left side - Logo and Title
        VBox leftPane = new VBox();
        leftPane.setAlignment(Pos.CENTER); // Center the text vertically and horizontally
        leftPane.setPadding(new Insets(20)); // Reduce padding for better control
        leftPane.setStyle("-fx-background-color: #1E90FF;"); // Blue color

    // Set a preferred size for the VBox to prevent it from overflowing
        leftPane.setPrefWidth(250); // Set a reasonable width for the left pane
        leftPane.setPrefHeight(400); // Set height based on your window size

    // Title (Text node)
        Text title = new Text("Welcome to the Weather Forecast Tracker");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 18)); // Set font size and weight
        title.setFill(Color.WHITE); // Set text color to black

    // Add the title to the leftPane
        leftPane.getChildren().add(title);

        // Right side - Login Form
        VBox rightPane = new VBox(10);
        rightPane.setAlignment(Pos.CENTER);
        rightPane.setPadding(new Insets(20));

        // Username label and text field
        Label usernameLabel = new Label("Username");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username");

        // Password label and password field
        Label passwordLabel = new Label("Password");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");

        // Login button
        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: white;");

        // Signup link
        Label signUpLabel = new Label("Not a user? ");
        Button signUpButton = new Button("Sign up!");
        signUpButton.setStyle("-fx-background-color: transparent; -fx-text-fill: blue; -fx-underline: true;");

        HBox signUpBox = new HBox(5, signUpLabel, signUpButton);
        signUpBox.setAlignment(Pos.CENTER);

        // Add elements to the right pane
        rightPane.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, signUpBox);

        // Main layout: HBox for left and right panes
        HBox mainLayout = new HBox();
        mainLayout.getChildren().addAll(leftPane, rightPane);

        // Root layout for error messages
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(mainLayout);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login - Weather Forest Tracker");
        primaryStage.show();

        // Implement login logic
        loginButton.setOnAction(e -> {
            if (validateLogin(usernameField.getText(), passwordField.getText())) {
                new HomeScreen(primaryStage); // Navigate to the home page on successful login
            } else {
                Label loginFailedLabel = new Label("Login Failed: Invalid username or password");
                if (!root.getChildren().contains(loginFailedLabel)) {
                    root.getChildren().add(loginFailedLabel);
                }
            }
        });

        // Navigate to sign-up page
        signUpButton.setOnAction(e -> new RegisterPage(primaryStage));
    }

    private boolean validateLogin(String username, String password) {
        // Placeholder for actual authentication logic
        return "user".equals(username) && "pass".equals(password);
    }
}
