package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features={"src/test/resources/skeleton/case1.feature"},glue="Steps",plugin="html:target/htmlreport")
//@CucumberOptions(features={"src/test/resources/skeleton/case2.feature"},glue="Steps",plugin="html:target/htmlreport")
@CucumberOptions(features={"src/test/resources/skeleton/case2.feature","src/test/resources/skeleton/case3.feature","src/test/resources/skeleton/cas4.feature"},glue="Steps",plugin="html:target/jsonreport.json")

public class RunCukesTest {
}
