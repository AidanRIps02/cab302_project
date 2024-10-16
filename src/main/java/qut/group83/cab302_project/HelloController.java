package qut.group83.cab302_project;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import qut.group83.cab302_project.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.sql.Connection;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    private Button nextButton;

    @FXML
    protected void onHelloButtonClick()
    {

//        Connection connection = DatabaseConnection.getInstance();
//
//        UserDAO userDAO = new UserDAO();
//
//        // Retrieve a user by username and password
//        User user = userDAO.getByUsernameAndPassword("John", "John");
//
//        userDAO.close();
//
//        DummyUserFetcher fetcher = new DummyUserFetcher();
//        DummyUser APIuser = fetcher.fetchDummyUser(100);

//        //API TEST SPACE
//        WeatherFetcher fetcher = new WeatherFetcher();
//        //BRISBANE r7hs1z
//        //ALICE SPRINGS qgz1nj
//        //SIMPSON DESERT r50z9g
//
//        Weather APIuser = fetcher.fetchCurrentWeatherForecast("r7hs1z");
//        System.out.println(APIuser);
//
//        welcomeText.setText("Hello World!");
    }

    @FXML
    protected void onNextButtonClick() throws IOException {
        Stage stage = (Stage) nextButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), HelloApplication.WIDTH, HelloApplication.HEIGHT);
        stage.setScene(scene);
    }
}