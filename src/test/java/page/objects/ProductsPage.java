package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    @FindBy(className = "app_logo")
    public WebElement appLogo;

    public ProductsPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

}
