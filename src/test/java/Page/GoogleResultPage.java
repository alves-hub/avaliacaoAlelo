package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleResultPage extends PageObject {

    @FindBy(xpath = "//div[@id='resultStats']")
    private WebElement result;


    public GoogleResultPage(WebDriver webdriver) {
        super(webdriver);
    }

    public String totResults() {
        String digitos = "";
        char[] letras = result.getText().toCharArray();
        for (char letra : letras) {
            if (Character.isDigit(letra)) {
                digitos += letra;
            }
        }
        return digitos;

    }
}
