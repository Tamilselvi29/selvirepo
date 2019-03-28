	package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\selvi\\NewJava\\CucumbetTestNew\\src\\main\\java\\Features\\multiplication.feature",
		glue={"stepDefinition"},
		format={"pretty","html:test-output","junit:junit_xml/mul.xml"},
		monochrome=true,
		dryRun=false
		)

public class MultiplicationTestRunner {

}
