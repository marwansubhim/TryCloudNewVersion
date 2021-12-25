package com.tryCloud.stepDefinitions;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /*
    @Before (order = 2)
    public void setUpScenario(){
        System.out.println("------Setting up browser with further details...");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabase(){
        System.out.println("----- CONNECTING TO DATABASE ");
    }

    @After(value = "@db", order = 1)
    public void closeDBConnection(){
        System.out.println("------Closing browser");
        System.out.println("------Take a screenshot");
    }

    @After (order = 2)
    public void tearDownScenario(Scenario scenario){
        //if my scenario failed
            // go and take screen shot

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        BrowserUtils.wait(1);
        Driver.closeDriver();

    }

    @BeforeStep
    public void runBeforeSteps(){
        System.out.println("________________Running Before Each STEP ________________");

    }

    @AfterStep
    public void runsAfterSteps(){
        System.out.println("________________Running AFTER Each STEP ________________");
    }

     */
    @Before
    public void setUpScenario(){

        System.out.println("------Setting up browser with further details...");
    }


    @After
    public void tearDownScenario(Scenario scenario){
        //if my scenario failed
        // go and take screen shot
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        BrowserUtils.waitFor(1);
        Driver.closeDriver();
    }
}
