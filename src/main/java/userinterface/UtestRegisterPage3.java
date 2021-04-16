package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage3 {
    public static final Target INPUT_PASSWORD = Target.the( "input that shows us the password field")

            .located(By.id("password"));

    public static final Target INPUT_CONFPASSWORD= Target.the( "input that shows us the password field")

            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TERM= Target.the( "Checkbox that shows us the terms field")

            .located(By.id("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));

    public static final Target NEXT_BUTTON4 = Target.the("button that shows us the form ")

            .located(By.id("//a[@id='laddaBtn']"));
}
