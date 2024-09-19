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
    }

    @Test
    void userPull() {
        // Retrieve the user by username and password
        User user = userDAO.getByUsernameAndPassword("John", "John");

        assertNotNull(user);
        assertEquals("John", user.getUserName());
        assertEquals("John", user.getPassWord());
    }
}
