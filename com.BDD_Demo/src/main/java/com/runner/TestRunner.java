package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 

@CucumberOptions(
		
		features="src/main/java/com/feature",
        glue="com.stepdef",
	    dryRun=false,   //it is used to compile feature file
        monochrome=true,    //to readable output
	   plugin="html:target",
	   tags="@JBK"  // tag are used specific scenario
	//tags="@login"    //to run feature file mention the tag(@)tagName
		)
public class TestRunner {

}
