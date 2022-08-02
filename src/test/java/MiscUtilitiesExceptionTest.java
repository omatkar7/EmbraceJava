import org.example.LoginException;
import org.example.MiscUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MiscUtilitiesExceptionTest {

    @Test
    @DisplayName("Verify Custom Exception Handling")
    void testLoginException() {
        System.out.println("Test Exception Handling");
        Exception exception = Assertions.assertThrows(LoginException.class, () -> MiscUtilities.doLogin(null,null));
        Assertions.assertEquals(exception.getMessage(), "Username & Password must not be null");
    }
}