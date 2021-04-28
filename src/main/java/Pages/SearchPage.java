package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.SearchResult;

public class SearchPage {

    private WebDriver driver;
    private By searchBar = By.xpath("//*[@id=\"site-container\"]/div/div[3]/div[1]/div/div[1]/form/input");
    private By searchIconButton = By.xpath("//*[@id=\"site-container\"]/div/div[3]/div[1]/div/div[2]/button[1]");
    private By containerSelect = By.xpath("//*[@id=\"site-container\"]/div/div[3]/div[2]/div/div/div[1]/div[3]/li/div/div[2]");

    public SearchPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterSearchValue(String searchValue) {

        driver.findElement(searchBar).sendKeys(searchValue);
    }

    public SearchResultPage searchForValue() {
        driver.findElement(searchIconButton).click();
        return new SearchResultPage(driver);
    }

    public SearchResultPage chooseFromContainer() {
        driver.findElement(containerSelect).click();
        return new SearchResultPage(driver);
    }

}
