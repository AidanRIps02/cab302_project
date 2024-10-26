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

public class Alertpage {
    public Alertpage(Stage primaryStage) {
        // Create a welcome message
        Label welcomeLabel = new Label("Welcome back, {username}\n");
        welcomeLabel.setStyle("-fx-font-size: 40px; -fx-text-fill: white;");

        // Create labels and fields for UV level and rain percentage
        Label uvLabel = new Label("\n\nToday UV level:");
        uvLabel.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");
        Label uvValue = new Label("\n\n5");  // Example value
        uvValue.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

        Label rainLabel = new Label("Raining percentage:");
        rainLabel.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");
        Label rainValue = new Label("30%");  // Example value
        rainValue.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

        // HBox for UV level
        HBox uvBox = new HBox(10, uvLabel, uvValue);
        uvBox.setAlignment(Pos.CENTER_LEFT);

        // HBox for Rain percentage
        HBox rainBox = new HBox(10, rainLabel, rainValue);
        rainBox.setAlignment(Pos.CENTER_LEFT);

        // Close button (X) Navigate to WeatherReport page
        Button closeButton = new Button("X");
        closeButton.setStyle("-fx-background-color: transparent; -fx-text-fill: #ffd700; -fx-font-size: 20px;");
        closeButton.setOnAction(e -> new WeatherReport(primaryStage)); // Closes the window

        // Top section with close button aligned to the right
        HBox topSection = new HBox(closeButton);
        topSection.setAlignment(Pos.TOP_RIGHT);

        // Main layout
        VBox layout = new VBox(10, topSection, welcomeLabel, uvBox, rainBox);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.TOP_LEFT);
        layout.setStyle("-fx-background-color: #00bfff;");  // Set the background color to deepskyblue


        // Create scene and add layout
        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Alarm page - Weather Forest Tracker");
        primaryStage.show();

    }
}

