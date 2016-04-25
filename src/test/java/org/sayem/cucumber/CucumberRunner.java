package org.sayem.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sayem on 5/9/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/org/sayem/cucumber/feature" }, plugin = { "pretty",
		"html:target/cucumber", "json:target/cucumber.json" }, snippets = SnippetType.CAMELCASE, monochrome = true)

public class CucumberRunner {
}
