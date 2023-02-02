package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.example.driver.DriverManager;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommonSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @And("^the url should contain with \"([^\"]*)\"$")
    public void theUrlShouldContainWith(String expUrl) throws Throwable {
        String actualUrl = driverManager.getURL();
        assertThat(actualUrl, containsString(expUrl));
    }
}
