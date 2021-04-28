package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

    private WebDriver driver;
    private By homeButton = By.xpath("//*[@id=\"site-container\"]/div/div[2]/div[2]/ul/li[1]/div/a");
    private By competeButton = By.xpath("//*[@id=\"site-container\"]/div/div[2]/div[2]/ul/li[2]/div/a");
    private By dataButton = By.xpath("//*[@id=\"site-container\"]/div/div[2]/div[2]/ul/li[3]/div/a");
    private By codeButton = By.xpath("//*[@id=\"site-container\"]/div/div[2]/div[2]/ul/li[4]/div/a");
    private By communitiesButton = By.xpath("//*[@id=\"site-container\"]/div/div[2]/div[2]/ul/li[5]/div/a");
    private By coursesButton = By.xpath("//*[@id=\"site-container\"]/div/div[2]/div[2]/ul/li[6]/div/a");


    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage goToHomePage() {
        driver.findElement(homeButton).click();
        return new HomePage(driver);
    }

    public CompetePage goToCompetePage() {
        driver.findElement(competeButton).click();
        return new CompetePage(driver);

    }

    public DataPage goToDataPage() {
        driver.findElement(dataButton).click();
        return new DataPage(driver);

    }

    public CodePage goToCodePage() {
        driver.findElement(codeButton).click();
        return new CodePage(driver);

    }

    public CommunitiesPage goToCommunitiesPage() {
        driver.findElement(communitiesButton).click();
        return new CommunitiesPage(driver);

    }

    public CoursesPage goToCoursesPage() {
        driver.findElement(coursesButton).click();
        return new CoursesPage(driver);

    }

}
