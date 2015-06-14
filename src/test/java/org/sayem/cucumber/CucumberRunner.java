package org.sayem.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sayem on 5/9/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/"},
        features = {"src/test/resources/"}
)
public class CucumberRunner {}
