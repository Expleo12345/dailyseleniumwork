package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Orangelogin.feature",glue="com.cumcumber7",plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
 
public class runner {
 
}