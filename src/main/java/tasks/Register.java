package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.*;



public class Register implements Task {
  private String join_today;

  public Register(String join_today){
      this.join_today = join_today;
  }

    public static Register the(String join_today) {
        return Tasks.instrumented(Register.class, join_today);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),
            Enter.theValue("First name").into(UtestRegisterPage.INPUT_FIRSTNAME),
            Enter.theValue("last name").into(UtestRegisterPage.INPUT_LASTNAME),
            Enter.theValue("Email").into(UtestRegisterPage.INPUT_EMAIL),
            Enter.theValue("Month").into(UtestRegisterPage.DROPDOWN_DATE ),
            Enter.theValue("Day").into(UtestRegisterPage.DROPDOWN_DAY ),
            Enter.theValue("Year").into(UtestRegisterPage.DROPDOWN_YEAR ),
            Click.on(UtestRegisterPage.NEXT_BUTTON ),

            Enter.theValue("City").into(UtestRegisterPage1.INPUT_CITY),
            Enter.theValue("Postal code").into(UtestRegisterPage1.INPUT_POSTALCODE ),
            Enter.theValue("Country").into(UtestRegisterPage1.DROPDOWN_COUNTRY ),
            Click.on(UtestRegisterPage1.NEXT_BUTTON2 ),

            Enter.theValue("Your computer").into(UtestRegisterPage2.DROPDOWN_COMPUTER),
            Enter.theValue("Version").into(UtestRegisterPage2.DROPDOWN_VERSION),
            Enter.theValue("Language").into(UtestRegisterPage2.DROPDOWN_LANGUAGE),
            Enter.theValue("Mobile device").into(UtestRegisterPage2.DROPDOWN_MOBILE),
            Enter.theValue("Model").into(UtestRegisterPage2.DROPDOWN_MODEL),
            Enter.theValue("Operating system").into(UtestRegisterPage2.DROPDOWN_OS),
            Click.on(UtestRegisterPage2.NEXT_BUTTON3),

            Enter.theValue("Password").into(UtestRegisterPage3.INPUT_PASSWORD),
            Enter.theValue("Confirm password").into(UtestRegisterPage3.INPUT_CONFPASSWORD),
            Enter.theValue("Terms").into(UtestRegisterPage3.CHECKBOX_TERM),
            Click.on(UtestRegisterPage3.NEXT_BUTTON4 )



    );

    }
}
