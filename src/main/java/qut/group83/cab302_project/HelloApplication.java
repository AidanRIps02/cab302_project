package qut.group83.cab302_project;
import java.sql.Connection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 640;
    public static Weather APIuser;



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), WIDTH, HEIGHT);
        stage.setTitle("APITest");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch();

//        Connection connection = DatabaseConnection.getInstance();
//
//        UserDAO userDAO = new UserDAO();
//        userDAO.createTable();
//
//        //insert new user
//        userDAO.insert(new User("John", "John"));
//
//        // Retrieve a user by username and password
//        User user = userDAO.getByUsernameAndPassword("John", "John");
//
//        userDAO.close();




        //API TEST SPACE
        WeatherFetcher fetcher = new WeatherFetcher();
        //BRISBANE r7hs1z
        //ALICE SPRINGS qgz1nj
        //SIMPSON DESERT r50z9g

        APIuser = fetcher.fetchCurrentWeatherForecast("qgz1nj");
    }
}