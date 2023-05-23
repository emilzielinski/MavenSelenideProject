package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    @FindBy(xpath = "//*[@data-test='username']")
    public WebElement loginField;

    @FindBy(xpath = "//*[@data-test='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@data-test='login-button']")
    public WebElement loginButton;

    public LandingPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

}
