package com.commencis.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/commencis/stepDefinitions",
        dryRun = false,
        tags = ""
)

public class CukesRunner {
}

