import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import qut.group83.cab302_project.User;
import qut.group83.cab302_project.UserDAO;

public class UserTest {

    private UserDAO userDAO;

    @BeforeEach
    void setUp() {
        // Initialize the UserDAO and create the Users table if it doesn't exist
        userDAO = new UserDAO();
        userDAO.createTable();
        userDAO.insert(new User("John", "John"));
        userDAO.insert(new User("Jimmy", "Gin"));
    }

    @AfterEach
    void tearDown() {
        userDAO.clearTable();
        userDAO.close();
    }

    @Test
    void userPull() {
        // Retrieve the user by username and password
        User user = userDAO.getByUsernameAndPassword("John", "John");

        assertNotNull(user);
        assertEquals("John", user.getUserName());
        assertEquals("John", user.getPassWord());
    }

    @Test
    void userPull2() {
        // Retrieve the user by username and password
        User user = userDAO.getByUsernameAndPassword("Jimmy", "Gin");

        assertNotNull(user);
        assertEquals("Gin", user.getUserName());
        assertEquals("Jimmy", user.getPassWord());
    }

    @Test
    void userNotFound() {
        // Try to retrieve a user that does not exist
        User user = userDAO.getByUsernameAndPassword("NonExistent", "Password");

        assertNull(user);
    }

}
