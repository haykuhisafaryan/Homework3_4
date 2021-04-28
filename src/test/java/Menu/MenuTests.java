package Menu;

import Pages.*;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MenuTests extends BaseTests {

    @Test
    public void homePageTest() {
        MenuPage menu = homePage.clickMenu();
        HomePage goToHomePage = menu.goToHomePage();
        Assert.assertNotSame(homePage, goToHomePage, "“Two objects are equal”");
    }

    @Test
    public void competePageHeadLineTest() {
        MenuPage menu = homePage.clickMenu();
        CompetePage competePage = menu.goToCompetePage();
        Assert.assertEquals(competePage.findHeadline(), "Competitions");

    }

    @Test
    public void dataPageTitleTest() {
        MenuPage menu = homePage.clickMenu();
        DataPage dataPage = menu.goToDataPage();
        Assert.assertEquals(dataPage.getTitle(), "Kaggle: Your Machine Learning and Data Science Community");

    }

    @Test
    public void codePageNotNullTest() {
        MenuPage menu = homePage.clickMenu();
        CodePage codePage = menu.goToCodePage();
        Assert.assertNotNull(codePage);

    }

    @Test
    public void communitiesPageURLTest() {
        MenuPage menu = homePage.clickMenu();
        CommunitiesPage communitiesPage = menu.goToCommunitiesPage();
        Assert.assertEquals(communitiesPage.findURL(), "https://www.kaggle.com/");

    }

    @Test
    public void coursePageDescriptionTest() {
        MenuPage menu = homePage.clickMenu();
        CoursesPage coursesPage = menu.goToCoursesPage();
        Assert.assertEquals(coursesPage.getDescription(),"Learn essential skills to complete your own data science projects. The courses are free, and you can earn completion certificates. Learn more.");

    }
}




