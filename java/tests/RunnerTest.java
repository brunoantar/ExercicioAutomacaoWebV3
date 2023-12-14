package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features"
        ,glue = {"stepDefinition"}
        ,tags = "@VPC1" //usando o Auto + nome da feature são executados os 2 CTs de uma vez
        ,plugin = {"pretty", "html:reports/Relatório.html","json:reports/Relatório.json"}
)
public class RunnerTest {
}
