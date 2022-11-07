package j__unitrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/caseS/caseS.feature"}, glue="definition",tags = "@PositiveTesting",plugin= {"html:testoutput/cucumber1.html"})
public class runner {

}
