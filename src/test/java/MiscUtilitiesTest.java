import org.example.LoginException;
import org.example.MiscUtilities;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MiscUtilitiesTest {
    static String result;

    @BeforeAll
    static void setup() {
        System.out.println("The @BeforeAll method has been executed");
    }

    @Test
    void testLogin_happyFlow() throws LoginException {
        System.out.println("Test Happy Flow");
        result = MiscUtilities.doLogin("omkarmatkar", "cvteygbu789");
        Assertions.assertEquals(result,"Login was successful!");
    }

    @Test
    void testLogin_invalidUsername() throws LoginException {
        System.out.println("Test Invalid Username");
        result = MiscUtilities.doLogin("omkar", "cvteygbu789");
        Assertions.assertEquals(result,"Invalid Username");
    }

    @Test
    void testLogin_invalidPassword() throws LoginException {
        System.out.println("Test Invalid Password");
        result = MiscUtilities.doLogin("omkarmatkar", "Wrongpassword1");
        Assertions.assertEquals(result,"Invalid Password");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("The @AfterAll method has been executed");
        result = null; //setting it to null so that the garbage collector can clean up the memory
    }
}
