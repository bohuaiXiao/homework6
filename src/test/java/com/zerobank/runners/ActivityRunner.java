package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author:
 * @create:
 * @date:
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/zerobank/stepdefnitions",
        features = "src/test/java/com/zerobank/stepdefnitions",
        dryRun = false,
        strict = false,
        tags = "@account_activity",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber2.json",
                "rerun:target/rerun.txt"
        }

)
public class ActivityRunner {
}
