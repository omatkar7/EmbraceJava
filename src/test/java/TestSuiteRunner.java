import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MiscUtilitiesTest.class,MiscUtilitiesExceptionTest.class,MiscUtilitiesParameterizedTest.class})
public class TestSuiteRunner {
}