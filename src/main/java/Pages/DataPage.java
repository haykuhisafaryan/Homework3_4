package Pages;

import org.openqa.selenium.WebDriver;

public class DataPage {
    private WebDriver driver;

    public DataPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
