package qut.group83.cab302_project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegisterPage {
    private UserDAO userDAO;

    public RegisterPage(Stage primaryStage) {
        userDAO = new UserDAO(); // Initialize the DAO
        // Left side - Logo and Title
        VBox leftPane = new VBox();
        leftPane.setAlignment(Pos.CENTER); // Center the text vertically and horizontally
        leftPane.setPadding(new Insets(20)); // Reduce padding for better control
        leftPane.setStyle("-fx-background-color: #1E90FF;"); // Blue color

// Set a preferred size for the VBox to prevent it from overflowing
        leftPane.setPrefWidth(350); // Set a reasonable width for the left pane
        leftPane.setPrefHeight(400); // Set height based on your window size

// Title (Text node)
        Text title = new Text("JOIN and became a NEW USER");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20)); // Set font size and weight
        title.setFill(Color.WHITE); // Set text color to black

// Add the title to the leftPane
        leftPane.getChildren().add(title);

        // Right side - Signup Form
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

        // register button
        Button submitButton = new Button("Signup");
        submitButton.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: white;");
        // Implement signup logic
        submitButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            User newUser = new User(username, password);
            userDAO.insert(newUser);

            System.out.println("User registered successfully!");
            // Optionally navigate to the login screen
            new LoginScreen(primaryStage);
        });

        // back link
        Label BackLabel = new Label("Already have an account?");
        Button BackButton = new Button("Login");
        BackButton.setStyle("-fx-background-color: transparent; -fx-text-fill: blue; -fx-underline: true;");

        HBox BackBox = new HBox(5, BackLabel, BackButton);
        BackBox.setAlignment(Pos.CENTER);

        // Add elements to the right pane
        rightPane.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, submitButton, BackBox);

        // Main layout: HBox for left and right panes
        HBox mainLayout = new HBox();
        mainLayout.getChildren().addAll(leftPane, rightPane);

        // Root layout for error messages
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(mainLayout);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Signup - Weather Forest Tracker");
        primaryStage.show();



        /////////////////////////////////
//        VBox root = new VBox(10);
//
//        TextField usernameField = new TextField();
//        TextField passwordField = new TextField();
//        TextField emailField = new TextField();
//        Button submitButton = new Button("Register");
//
//        root.getChildren().addAll(
//                new Label("Username:"),
//                usernameField,
//                new Label("Password:"),
//                passwordField,
//                submitButton );

//        submitButton.setOnAction(e -> {
//            // Here you can add your registration logic
//            primaryStage.setScene(primaryStage.getScene()); // Optionally navigate back or elsewhere
//        });
        // Navigate to sign-up page
        BackButton.setOnAction(e -> new LoginScreen(primaryStage));

//        Scene scene = new Scene(root, 600, 400);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Register");
    }
}
