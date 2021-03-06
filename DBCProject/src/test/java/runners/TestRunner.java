package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
glue={"steps"},
monochrome=true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@desafio"
)
public class TestRunner {

}
