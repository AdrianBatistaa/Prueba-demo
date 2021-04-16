package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register")

            .located(By.xpath(" //unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));

    public static final Target INPUT_FIRSTNAME = Target.the( "input that shows us the first name field")

            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the( "input that shows us the last name field")

            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the( "input that shows us the email field")

            .located(By.id("email"));

    public static final Target DROPDOWN_DATE = Target.the( "dropdown that shows us the date field")

            .located(By.xpath("//select[@id='birthMonth']"));

    public static final Target DROPDOWN_DAY = Target.the( "dropdown that shows us the date field")

            .located(By.xpath("//select[@id='birthDay']"));

    public static final Target DROPDOWN_YEAR = Target.the( "dropdown that shows us the date field")

            .located(By.xpath("//select[@id='birthYear']"));

    public static final Target NEXT_BUTTON = Target.the("button that shows us the form to register")

            .located(By.xpath("//span[contains(text(),'Next: Location')]"));

     }
