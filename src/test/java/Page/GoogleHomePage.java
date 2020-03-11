package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.esther.talkingtestealelo.cucumber.pageobjects.PageObject;

public class GoogleHomePage extends PageObject{
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchField;
	
	@FindBy(xpath="//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")
	private WebElement searchButton;

	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}
	
	public GoogleResultPage search(String text) {
		searchField.sendKeys(text);
		searchButton.click();
		return new GoogleResultPage(webdriver);
		
	}

}
