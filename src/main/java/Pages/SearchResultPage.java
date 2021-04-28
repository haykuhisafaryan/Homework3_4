package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    private WebDriver driver;
    private By heading = By.xpath("//*[@id=\"site-container\"]/div/div[3]/div[2]/div/div/div[1]/p");
    private By datasetsButton = By.xpath("//*[@id=\"site-container\"]/div/div[3]/div[2]/div/div/div[1]/div/div[1]/div/button[1]");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String searchResultPageSubheading() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.presenceOfElementLocated(heading));
        return wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(heading))).getText();

    }

    public boolean datasetsIsClicked() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(datasetsButton));
        if (null != driver.findElement(datasetsButton)) {
            driver.findElement(datasetsButton).click();
            return true;
        }
        return false;

    }

    public String[] getDatasetTitlesH6() {

        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".searchTarget h6")));
        var headings = driver.findElements(By.cssSelector(".searchTarget h6"));
        String[] titles = new String[headings.size()];
        for (int i = 0; i < headings.size(); i++) {
            titles[i] = headings.get(i).getText();
        }
        return titles;
    }

}
