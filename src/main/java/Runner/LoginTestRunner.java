 package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\selvi\\NewJava\\CucumbetTestNew\\src\\main\\java\\Features\\datatablewithmap.feature",
		glue={"stepDefinition"},
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		strict=true,
		monochrome=true,
		dryRun=false
		//tags= {"@SmokeTest, @End2End"} 
		)
      
public class LoginTestRunner {

}



//Available CucumberOptions
//1)features - the path of feature file
//2) glue --the path of step definition where step definition available
//3)  dryRun - to check the mapping is proper between feature file and step definition file
//4) monochrome - to display the console output in the proper readable format
//5 format -- "html:test-output","json:json_output/cucumber.json"
//6) strict --it will fail the execution if there are any undefined or pending steps are there
//7) tags -mention the tag names which we want to execute
	//OR condition: tags={"@SmokeTest , @RegressionTest"} -- execute all test cases tagged as @SmokeTest or @RegressionTest
	//And Condition: tags={"@SmokeTest" , "@End2End"} -- execute all test cases tagged as @SmokeTest and @End2End
    //Ignore Condition : tags={"~@SmokeTest"} -- ignore test cases tagged as "@SmokeTest"