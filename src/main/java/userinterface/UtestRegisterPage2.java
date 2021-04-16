package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage2 {

    public static final Target DROPDOWN_COMPUTER= Target.the( "dropdown that shows us the computer field")

            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target DROPDOWN_VERSION = Target.the( "dropdown that shows us the version field")

            .located(By.xpath("//span[contains(text(),'Select OS language')]"));

    public static final Target DROPDOWN_LANGUAGE = Target.the( "dropdown that shows us the language field")

            .located(By.xpath("//select[@id='birthMonth']"));

    public static final Target DROPDOWN_MOBILE = Target.the( "dropdown that shows us the mobile field")

            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target DROPDOWN_MODEL = Target.the( "dropdown that shows us the model field")

            .located(By.xpath("//span[contains(text(),'Select a Model')]"));

    public static final Target DROPDOWN_OS = Target.the( "dropdown that shows us the os field")

            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target NEXT_BUTTON3 = Target.the("button that shows us the form to register")

            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
