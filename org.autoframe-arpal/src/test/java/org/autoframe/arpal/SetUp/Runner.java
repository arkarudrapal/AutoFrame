package org.autoframe.arpal.SetUp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
				glue={"org.autoframe.arpal.SetUp","org.autoframe.arpal.Steps"},
				tags={"@arka"})

public class Runner {

}
