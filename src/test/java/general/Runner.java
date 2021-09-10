package general;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= "steps",
        plugin = {"pretty",  // plugin em todos os relatórios
                  "html:target/relatorioSimples",
                  "json:target/relatorioSimples",
                "com.vilmaselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }
)
public class Runner {


}
