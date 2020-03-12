package Hooks;

public class CucumberRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/java/Features/Google.features"},
            plugin{
                    "pretty", "html: target/cucumber""
            })
}
