package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Adrian wants to work automation test at the utest platform$")
    public void thanAdrianWantsToWorkAutomationTestAtTheUtestPlatform() {

    }


    @When("^he search on where register and click on the button$")
    public void heSearchOnWhereRegisterAndClickOnTheButton() {

    }

    @Then("^he type a form to create a new user$")
    public void heTypeAFormToCreateANewUser() {

    }



}
