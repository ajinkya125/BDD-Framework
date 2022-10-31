package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		glue = "stepdefinations",
		features = "C:\\Users\\chait\\eclipse-workspace\\BDD_Automation_step_by_step\\src\\test\\java\\feature\\Login.feature",
		
		monochrome = true,	//to neat and clean console
		
	//	plugin = {"pretty", "html:target/HtmlReports/"}		
		
	//	plugin = {"pretty", "json:target/JSONReports/report.json"}
		
	//	plugin = {"pretty","junit:target/junitReports/report.xml"}
		
		//or we can create combine report
		
		plugin = {"pretty","html:target/Htmlreports",
				"json:target/JSONreports/report.json",
				"junit:target/junitReports/report.xml"}
		
		)

public class TestRun {

}
