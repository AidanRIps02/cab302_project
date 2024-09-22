package qut.group83.cab302_project;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScreen {
    public HomeScreen(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Welcome label placed in the top with VBox for additional components
        VBox topBox = new VBox(10);
        Label welcomeLabel = new Label("Welcome to the Home Page!");
        topBox.getChildren().add(welcomeLabel);
        root.setTop(topBox);

        // North panel with combo box
        HBox northPanel = new HBox(10);
        northPanel.setAlignment(Pos.CENTER);
        Label locationLabel = new Label("Select Location:");
        ComboBox<String> locations = new ComboBox<>();
        locations.getItems().addAll("Location 1", "Location 2", "Location 3");
        northPanel.getChildren().addAll(locationLabel, locations);
        topBox.getChildren().add(northPanel);  // Add to top VBox

        // Center panel with weather report text area
        TextArea weatherReport = new TextArea("Weather report...");
        root.setCenter(weatherReport);

        // South panel with a button
        HBox southPanel = new HBox(10);
        southPanel.setAlignment(Pos.CENTER);
        Button setAlertsButton = new Button("Set Alerts");
        southPanel.getChildren().add(setAlertsButton);
        root.setBottom(southPanel);

        Scene scene = new Scene(root, 300, 300);  // Adjusted scene size for better layout view
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Page");
    }
}
