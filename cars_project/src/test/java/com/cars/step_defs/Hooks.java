package com.cars.step_defs;

import com.cars.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void teardownScenario(Scenario scenario){
        //we will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario")
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if(scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
     Driver.closeDriver();
    }

}
