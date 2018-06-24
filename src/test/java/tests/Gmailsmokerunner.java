package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\testing1\\gmailbdd\\src\\test\\resources\\gmailresources\\feature1.feature","C:\\testing1\\gmailbdd\\src\\test\\resources\\gmailresources\\feature2.feature"},plugin= {"pretty","html:target/smokeresult"},tags= {"~@smoketest"},monochrome=true)

public class Gmailsmokerunner {
	

}
