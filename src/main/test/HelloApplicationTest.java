import org.junit.jupiter.api.Test;
import qut.group83.cab302_project.UserDAO;

import static org.mockito.Mockito.*;

class HelloApplicationTest {

    @Test
    void testMainMethod() {
        UserDAO mockUserDAO = mock(UserDAO.class);

        // Assuming you can refactor main logic into a method for testing
        HelloApplication.mainLogic(mockUserDAO);

        verify(mockUserDAO, times(1)).createTable();
        verify(mockUserDAO, times(1)).insert(any(User.class));
        verify(mockUserDAO, times(1)).getByUsernameAndPassword(anyString(), anyString());
    }
}

