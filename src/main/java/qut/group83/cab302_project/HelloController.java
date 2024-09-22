package qut.group83.cab302_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        Connection connection = DatabaseConnection.getInstance();

        UserDAO userDAO = new UserDAO();

        // Retrieve a user by username and password
        User user = userDAO.getByUsernameAndPassword("John", "John");

        userDAO.close();

        DummyUserFetcher fetcher = new DummyUserFetcher();
        DummyUser APIuser = fetcher.fetchDummyUser(100);
        welcomeText.setText(APIuser.toString());
    }
}