import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import javafx.scene.control.Label;
import qut.group83.cab302_project.HelloController;
import qut.group83.cab302_project.User;
import qut.group83.cab302_project.UserDAO;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HelloControllerTest {

    private HelloController helloController;
    private UserDAO mockUserDAO;

    @BeforeEach
    void setUp() {
        helloController = new HelloController();
        mockUserDAO = mock(UserDAO.class);
        helloController.welcomeText = new Label();
    }

    @Test
    void testOnHelloButtonClick() {
        User mockUser = new User("password123", "JohnDoe");
        when(mockUserDAO.getByUsernameAndPassword(anyString(), anyString())).thenReturn(mockUser);

        helloController.onHelloButtonClick();

        assertEquals("User{UserName=JohnDoe, Password='password123']",
                helloController.welcomeText.getText());
    }
}

