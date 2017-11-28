package d3dCom;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty"},features="src/test/resources/",tags = {"@Reg-Datatable"})
public class RunCukesTest {


}
//in tags mention what scenario/feature file to test.
//Always good practise is to right click on Runcukestest for execution rather than using from menu bar as sometimes if u stop run/debug any other file and if u click there it starts the previous file execution.

// each time u r running run cukes go to menu and check--Run-->edit config--->vm opions enter -Dbrowser=Chrome, so mention "browser" in above system.get.property command as it gets '-Dbrowser=Chrome'and put that in variable for ex:br.