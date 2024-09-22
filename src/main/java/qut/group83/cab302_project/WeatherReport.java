package qut.group83.cab302_project;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WeatherReport extends Stage {
    public WeatherReport(String location) {
        setTitle("Weather Details for " + location);
        VBox root = new VBox(10);

        // Adding some mock details
        root.getChildren().addAll(
                new Label("Radar Image Here"),
                new Label("Upcoming Weather: Sunny"),
                new Label("General Week Long Weather Report"),
                new Label("Sunrise/Sunset Time: 06:00/18:00"),
                new Label("Feels Like Temperature: 28°C"),
                new Label("Humidity Level: 45%")
        );

        Scene scene = new Scene(root, 400, 300);
        setScene(scene);
        show();
    }
}
