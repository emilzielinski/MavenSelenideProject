import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.ProductsPage;

public class PositiveLoginTest extends TestBase {

    @Test
    public void successfulLoginWithGoodCredentialsTest(){

        LandingPage landingPage = new LandingPage();
        ProductsPage productsPage = new ProductsPage();

        landingPage.loginField.sendKeys("standard_user");
        landingPage.passwordField.sendKeys("secret_sauce");
        landingPage.loginButton.click();

        Assert.assertEquals(productsPage.appLogo.getText(), "Swag Labs");
    }

}
