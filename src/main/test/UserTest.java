import org.junit.jupiter.api.Test;
import qut.group83.cab302_project.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testUserConstructor() {
        User user = new User("password123", "JohnDoe");
        assertEquals("password123", user.getPassWord());
        assertEquals("JohnDoe", user.getUserName());
    }

    @Test
    void testSettersAndGetters() {
        User user = new User("password123", "JohnDoe");
        user.setPassWord("newPassword");
        user.setUserName("JaneDoe");

        assertEquals("newPassword", user.getPassWord());
        assertEquals("JaneDoe", user.getUserName());
    }

    @Test
    void testToString() {
        User user = new User("password123", "JohnDoe");
        String expected = "User{UserName=JohnDoe, Password='password123']";
        assertEquals(expected, user.toString());
    }
}