package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    private WebDriver driver;
    protected By registerWithGoogleButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div/div[1]/a/li/div");
    private By registerWithEmailButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div/div[2]/a/li/div");
    private By signInButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div/span/a");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterWithGoogle clickRegisterWithGoogleButton() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(registerWithGoogleButton));
        driver.findElement(registerWithGoogleButton).click();
        return new RegisterWithGoogle(driver);
    }

    public LoginPage clickRegisterWithEmailButton() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(registerWithEmailButton));
        driver.findElement(registerWithEmailButton).click();
        return new LoginPage(driver);
    }

    public void clickSignInButton() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        driver.findElement(signInButton).click();
    }

}
