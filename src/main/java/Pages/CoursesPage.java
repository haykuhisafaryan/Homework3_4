package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoursesPage {
    private WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By descriptionButton = By.xpath("  //*[@id=\"site-content\"]/div[3]/div/div/div[1]/span");

    public String getDescription() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.presenceOfElementLocated(descriptionButton));
        return wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(descriptionButton))).getText();
    }
}
