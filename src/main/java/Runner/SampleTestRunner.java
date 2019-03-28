package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\selvi\\NewJava\\CucumbetTestNew\\src\\main\\java\\Features\\sampletest.feature",
		glue= {"stepDefinition"},
		monochrome=true,
		strict=true,
		dryRun=false,
		format= {"pretty","html:test-output","json:json_output/sampletest.json","junit:junit_xml/sampletest.xml"},
		tags= {"~@Registration1", "@Registration2"," ~@Registration3"}
		)


//public class SampleTest extends AbstractTestNGCucumberTests {
public class SampleTestRunner{
}
