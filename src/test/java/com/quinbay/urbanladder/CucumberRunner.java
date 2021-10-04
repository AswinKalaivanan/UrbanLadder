package com.quinbay.urbanladder;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/Users/apaswinkalaivanan/IdeaProjects/UrbanLadder/src/test/java/com/quinbay/urbanladder/Feature" ,
        glue = {"com.quinbay.urbanladder"},
        tags="",
        plugin = {"rerun:target/rerun.txt", "json:target/destination/cucumber.json"} )


public class CucumberRunner {
}
