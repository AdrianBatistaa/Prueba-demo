package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;
import tasks.Register;

public class UtestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Adrian wants to work automation test at the utest platform$")
    public void thanAdrianWantsToWorkAutomationTestAtTheUtestPlatform() {
        OnStage.theActorCalled("Adrian").wasAbleTo(OpenUp.thePage());
    }


    @When("^he search on (.*)$")
    public void heSearchOnButtonForRegister(String join_today) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(join_today));
    }

    @Then("^he type a form to create a new user$")
    public void heTypeAFormToCreateANewUser() {

    }



}
