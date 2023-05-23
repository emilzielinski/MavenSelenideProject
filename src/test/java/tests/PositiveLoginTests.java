package tests;

import org.testng.annotations.Test;
import page.objects.LandingPage;

public class PositiveLoginTests extends TestBase {

    @Test
    public void successfulLoginWithGoodCredentials(){

        LandingPage landingPage = new LandingPage();

        landingPage.loginField.sendKeys("standard_user");
        landingPage.passwordField.sendKeys("secret_sauce");
        landingPage.loginButton.click();

    }

}
