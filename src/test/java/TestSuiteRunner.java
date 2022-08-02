import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MiscUtilitiesTest.class,MiscUtilitiesExceptionTest.class})
public class TestSuiteRunner {
}