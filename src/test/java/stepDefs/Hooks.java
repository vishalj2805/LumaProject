package stepDefs;

import base.ContextSetup;
import io.cucumber.java.After;

import java.io.IOException;

public class Hooks {

    ContextSetup contextSetup;

    public Hooks(ContextSetup contextSetup){
        this.contextSetup = contextSetup;
    }

    @After
    public void afterScenario() throws IOException {
//        contextSetup.testBase.getDriver().quit();
    }

}
