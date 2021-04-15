package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register").located(By.xpath(" //unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));

    public static final Target INPUT_FIRSTNAME = Target.the( "input that shows us the first name field").located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the( "input that shows us the last name field").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the( "input that shows us the email field").located(By.id("email"));

    public static final Target DROPDOWN_DATE = Target.the( "dropdown that shows us the date field").located(By.xpath("//select[@id='birthMonth']"));

    public static final Target DROPDOWN_DAY = Target.the( "dropdown that shows us the date field").located(By.xpath("//select[@id='birthDay']"));

    public static final Target DROPDOWN_YEAR = Target.the( "dropdown that shows us the date field").located(By.xpath("//select[@id='birthYear']"));

    public static final Target NEXT_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//span[contains(text(),'Next: Location')]"));

    public static final Target INPUT_CITY = Target.the( "input that shows us the city field").located(By.id("city"));

    public static final Target INPUT_POSTALCODE = Target.the( "input that shows us the postal code field").located(By.id("zip"));

    public static final Target DROPDOWN_COUNTRY = Target.the( "dropdown that shows us the country field").located(By.xpath("//span[contains(text(),'Colombia')]"));

    public static final Target NEXT_BUTTON2 = Target.the("button that shows us the form to register").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

    public static final Target DROPDOWN_COMPUTER= Target.the( "dropdown that shows us the computer field").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target DROPDOWN_VERSION = Target.the( "dropdown that shows us the version field").located(By.xpath("//span[contains(text(),'Select OS language')]"));

    public static final Target DROPDOWN_LANGUAGE = Target.the( "dropdown that shows us the language field").located(By.xpath("//select[@id='birthMonth']"));

    public static final Target DROPDOWN_MOBILE = Target.the( "dropdown that shows us the mobile field").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target DROPDOWN_MODEL = Target.the( "dropdown that shows us the model field").located(By.xpath("//span[contains(text(),'Select a Model')]"));

    public static final Target DROPDOWN_OS = Target.the( "dropdown that shows us the os field").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target NEXT_BUTTON3 = Target.the("button that shows us the form to register").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD = Target.the( "input that shows us the password field").located(By.id("password"));

    public static final Target INPUT_CONFPASSWORD= Target.the( "input that shows us the password field").located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TERM= Target.the( "Checkbox that shows us the terms field").located(By.id("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));

    public static final Target NEXT_BUTTON4 = Target.the("button that shows us the form ").located(By.id("//a[@id='laddaBtn']"));





}
