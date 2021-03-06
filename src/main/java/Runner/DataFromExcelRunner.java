package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//check how to revert from remote repo after commit and push
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\selvi\\NewJava\\CucumbetTestNew\\src\\main\\java\\Features\\datafromexcel.feature",
		glue={"stepDefinition"},
		format= {"pretty","html:test-output1","json:json_output/test.json"},
		strict=true,
		monochrome=true,
		dryRun=false
		
		)

public class DataFromExcelRunner {

}
