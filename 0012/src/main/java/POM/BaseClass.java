package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	// encapsulation abstraction>>> follow
	
  @FindBy (xpath="")
  private WebElement Button;

  
  @FindBy (xpath="")
  private WebElement Button2;
 //------------------------------------------- 
  
	public BaseClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickonButton() {
		Button.click();
		
		
	}
	public void titlereadverify() {
		Button2.clear();
		
	}
	
	 

}
