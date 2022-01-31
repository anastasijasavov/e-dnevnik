package uni.fmi.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty","json:target/login-feature.json"})
//@CucumberOptions(monochrome = true, plugin = {"pretty","json:target/login-feature.json"})
public class LoginStarter {

}
