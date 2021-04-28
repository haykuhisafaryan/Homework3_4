package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompetePage {

    private WebDriver driver;
    private By headLine = By.xpath("//*[@id=\"site-content\"]/div[4]/div/div[1]/div[1]/h1");

    public CompetePage(WebDriver driver) {
        this.driver = driver;
    }

    public String findHeadline() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.presenceOfElementLocated(headLine));
        return wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(headLine))).getText();
    }
}
