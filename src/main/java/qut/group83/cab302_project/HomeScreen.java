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

public class HomeScreen {
    public HomeScreen(Stage primaryStage) {
        //
        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER); // Center the text vertically and horizontally
        pane.setPadding(new Insets(20)); // Reduce padding for better control
        pane.setStyle("-fx-background-color: #87CEFA;"); // Blue color

        // Set a preferred size for the VBox to prevent it from overflowing
        pane.setPrefWidth(600); // Set a reasonable width for the left pane
        pane.setPrefHeight(400); // Set height based on your window size

        // Title (Text node)
        Text title = new Text("Welcome to the Weather Forecast Tracker\n\n                         GET START!\n");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 28)); // Set font size and weight
        title.setFill(Color.WHITE); // Set text color to black

        // Login button
        Button LoginButton = new Button("  Login   ");
        LoginButton.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: white; -fx-font-size: 18px; "
                               + "-fx-padding: 10px 50px; -fx-border-radius: 10; -fx-background-radius: 10;");

        //space
        Text space = new Text("\n");

        // Signup button
        Button SignupButton = new Button(" Signup ");
        SignupButton.setStyle("-fx-background-color: #1E90FF; -fx-text-fill: white; -fx-font-size: 18px; "
                                + "-fx-padding: 10px 50px; -fx-border-radius: 10; -fx-background-radius: 10;");


        // Add the title and subtitle to the leftPane
        pane.getChildren().addAll(title, LoginButton, space, SignupButton);

        // Main layout: HBox for left and right panes
        HBox mainLayout = new HBox();
        mainLayout.getChildren().add(pane);

        // Root layout for error messages
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(mainLayout);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome - Weather Forest Tracker");
        primaryStage.show();


        // Navigate to Login page
        LoginButton.setOnAction(e -> new LoginScreen(primaryStage));
        // Navigate to sign-up page
        SignupButton.setOnAction(e -> new RegisterPage(primaryStage));
    }
}



