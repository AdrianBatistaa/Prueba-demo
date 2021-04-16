package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage1 {

    public static final Target INPUT_CITY = Target.the( "input that shows us the city field")

            .located(By.id("city"));

    public static final Target INPUT_POSTALCODE = Target.the( "input that shows us the postal code field")

            .located(By.id("zip"));

    public static final Target DROPDOWN_COUNTRY = Target.the( "dropdown that shows us the country field")

            .located(By.xpath("//span[contains(text(),'Colombia')]"));

    public static final Target NEXT_BUTTON2 = Target.the("button that shows us the form to register")

            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

}
