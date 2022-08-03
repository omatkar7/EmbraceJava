import org.example.LoginDto;
import org.example.LoginException;
import org.example.MiscUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MiscUtilitiesParameterizedTest {

    @DisplayName("Parameterized Test")
    @ParameterizedTest
    @MethodSource("setupInputs")
    void testLogin_multipleInputs(LoginDto loginDetails, String expected) throws LoginException {
        Assertions.assertEquals(expected, MiscUtilities.doLogin(loginDetails));
    }

    private static Stream<Arguments> setupInputs() {
        return Stream.of(
                Arguments.of(new LoginDto("invalidUser1","invalidpassword1","localuser1"), "Invalid Username & Password"),
                Arguments.of(new LoginDto("invalidUser2","invalidpassword2","localuser2"), "Invalid Username & Password"),
                Arguments.of(new LoginDto("invalidUser3","invalidpassword3","localuser3"), "Invalid Username & Password"),
                Arguments.of(new LoginDto("omkarmatkar","cvteygbu789","admin"), "Login was successful!")
        );
    }
}
