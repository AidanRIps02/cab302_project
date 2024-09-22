import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import qut.group83.cab302_project.User;
import qut.group83.cab302_project.UserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static javafx.beans.binding.Bindings.when;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    private UserDAO userDAO;
    private Connection mockConnection;

    @BeforeEach
    void setUp() {
        mockConnection = mock(Connection.class);
        userDAO = new UserDAO();
    }

    @Test
    void testInsert() throws SQLException {
        User user = new User("password123", "JohnDoe");

        PreparedStatement mockStatement = mock(PreparedStatement.class);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);

        userDAO.insert(user);

        verify(mockStatement, times(1)).setString(1, "JohnDoe");
        verify(mockStatement, times(1)).setString(2, "password123");
        verify(mockStatement, times(1)).executeUpdate();
    }

    @Test
    void testGetByUsernameAndPassword() throws SQLException {
        User expectedUser = new User("password123", "JohnDoe");

        PreparedStatement mockStatement = mock(PreparedStatement.class);
        ResultSet mockResultSet = mock(ResultSet.class);

        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getString("userName")).thenReturn("JohnDoe");
        when(mockResultSet.getString("passWord")).thenReturn("password123");

        User actualUser = userDAO.getByUsernameAndPassword("JohnDoe", "password123");

        assertEquals(expectedUser.getUserName(), actualUser.getUserName());
        assertEquals(expectedUser.getPassWord(), actualUser.getPassWord());
    }

    @Test
    void testCreateTable() throws SQLException {
        Statement mockStatement = mock(Statement.class);
        when(mockConnection.createStatement()).thenReturn(mockStatement);

        userDAO.createTable();

        verify(mockStatement, times(1)).execute(anyString());
    }
}
