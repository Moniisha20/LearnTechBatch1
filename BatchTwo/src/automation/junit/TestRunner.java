package automation.junit;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
public static void main(String[] args) {
	Result result = JUnitCore.runClasses(Junit_demo.class);
	

	System.out.println("Ignore Count" + result.getIgnoreCount());
	System.out.println("Failure Count" + result.getFailureCount());
	System.out.println("Run Count" + result.getRunCount());
	System.out.println("Run Time" + result.getRunTime());
	List<Failure> Failures = result.getFailures();
	
	
	
    for (Failure failure : Failures) {
       System.out.println(failure.toString());
       System.out.println("Failures" + failure);
    }
		
    System.out.println(result.wasSuccessful());
}
}
