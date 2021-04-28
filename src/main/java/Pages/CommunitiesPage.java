package Pages;

import org.openqa.selenium.WebDriver;

public class CommunitiesPage {
    private WebDriver driver;

    public CommunitiesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String findURL() {
        return driver.getCurrentUrl();
    }
}
