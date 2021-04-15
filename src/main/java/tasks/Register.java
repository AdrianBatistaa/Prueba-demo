package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestRegisterPage;


public class Register implements Task {


    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),
            Enter.theValue("First name").into(UtestRegisterPage.INPUT_FIRSTNAME),
            Enter.theValue("last name").into(UtestRegisterPage.INPUT_LASTNAME),
            Enter.theValue("Email").into(UtestRegisterPage.INPUT_EMAIL),
            Enter.theValue("").into(UtestRegisterPage.DROPDOWN_DATE ),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_DAY ),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_YEAR ),
            Click.on(UtestRegisterPage.NEXT_BUTTON ),

            Enter.theValue("Email").into(UtestRegisterPage.INPUT_CITY),
            Enter.theValue("Email").into(UtestRegisterPage.INPUT_POSTALCODE ),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_COUNTRY ),
            Click.on(UtestRegisterPage.NEXT_BUTTON2 ),

            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_COMPUTER),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_VERSION),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_LANGUAGE),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_MOBILE),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_MODEL),
            Enter.theValue("Email").into(UtestRegisterPage.DROPDOWN_OS),
            Click.on(UtestRegisterPage.NEXT_BUTTON3),

            Enter.theValue("Email").into(UtestRegisterPage.INPUT_PASSWORD),
            Enter.theValue("Email").into(UtestRegisterPage.INPUT_CONFPASSWORD),
            Enter.theValue("Email").into(UtestRegisterPage.CHECKBOX_TERM),
            Click.on(UtestRegisterPage.NEXT_BUTTON4 )



    );

    }
}
