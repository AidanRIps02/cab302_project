import org.junit.jupiter.api.Test;
import qut.group83.cab302_project.DatabaseConnection;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    @Test
    void testSingletonConnection() {
        Connection connection1 = DatabaseConnection.getInstance();
        Connection connection2 = DatabaseConnection.getInstance();

        // Ensure both connections are the same instance (Singleton behavior)
        assertSame(connection1, connection2);
    }

    @Test
    void testConnectionNotNull() {
        Connection connection = DatabaseConnection.getInstance();
        assertNotNull(connection, "Database connection should not be null");
    }
}
