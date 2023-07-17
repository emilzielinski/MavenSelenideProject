import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.ProductsPage;

public class PositiveLoginTests extends TestBase {

    @Test
    public void successfulLoginWithGoodCredentials(){

        LandingPage landingPage = new LandingPage();
        ProductsPage productsPage = new ProductsPage();

        landingPage.loginField.sendKeys("standard_user");
        landingPage.passwordField.sendKeys("secret_sauc");
        landingPage.loginButton.click();

        Assert.assertEquals(productsPage.appLogo.getText(), "Swag Labs");
    }

}
