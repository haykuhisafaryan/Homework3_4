package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class LoginPage {

    private WebDriver driver;
    private By emailAddressField = By.xpath("/html/body/main/div[1]/div[1]/div/form/div[2]/div[1]/div/div/input");
    private By passwordField = By.xpath("/html/body/main/div[1]/div[1]/div/form/div[2]/div[2]/div/div/input");
    private By fullNameField = By.xpath("/html/body/main/div[1]/div[1]/div/form/div[2]/div[3]/div/div/input");
    private By cancelButton = By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div[7]/button[1]/span");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitSendKeys(By button, String keys) {
        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(button));
        driver.findElement(button).click();

    }

    public void setEmailAddress(String emailAddress) {
        waitSendKeys(emailAddressField, emailAddress);
//
    }

    public void setPassword(String password) {
        waitSendKeys(passwordField, password);
    }

    public void setFullName(String fullName) {
        waitSendKeys(fullNameField, fullName);
    }

    public HomePage clickCancel() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
        driver.findElement(cancelButton).click();
        return new HomePage(driver);
    }


}