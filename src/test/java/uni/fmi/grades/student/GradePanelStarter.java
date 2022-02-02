package uni.fmi.grades.student;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty","html:target/checkgrade-feature"})

public class GradePanelStarter {

}
