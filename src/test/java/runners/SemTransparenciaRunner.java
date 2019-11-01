package runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/sitesSemTransparencia.feature" }, glue = { "semTransparencia" })
public class SemTransparenciaRunner {

}
