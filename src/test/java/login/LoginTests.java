package login;

import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.RegisterWithGoogle;
import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        RegisterPage registerPage = homePage.clickRegister();
        LoginPage loginPage = registerPage.clickRegisterWithEmailButton();
        loginPage.setEmailAddress("Sad Haykuhi");
        loginPage.setPassword("password");
        loginPage.setFullName("Abraham Geghamyan");
        loginPage.clickCancel();

    }
}
