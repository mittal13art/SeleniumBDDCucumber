package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() throws IllegalAccessException {
        driverManager.runOnLocalBrowser(); // to see all execution on browser
        //driverManager.runInHeadlessMode(); // it will run on GitCloud, you can't see execution
        driverManager.goToURL();
        driverManager.maxBrowser();
        driverManager.applyImplicitWait();
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            driverManager.takeScreenshot(scenario);
        }
        driverManager.closeBrowser();
    }

}
