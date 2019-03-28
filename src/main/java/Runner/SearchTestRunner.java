package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\selvi\\NewJava\\CucumbetTestNew\\src\\main\\java\\Features\\search.feature",
		glue= {"stepDefinition"},
		format= {"pretty","html:test_output","junit:junit_xml/search.xml"},
		monochrome=true,
		dryRun=false
		)
public class SearchTestRunner {

}
