package first;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions( features = "src/main/java/cucumber/mystore-login-address.feature",
            plugin = {"pretty","html:out/registerUserReport.html"})

    public class WorkshopTaskTest {

    }

