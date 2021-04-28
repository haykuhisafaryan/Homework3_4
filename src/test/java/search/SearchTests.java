package search;

import Pages.*;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTests {
    @Test
    public void testSearchFromContainer() {
        SearchPage searchPage = homePage.clickSearch();
        SearchResultPage searchResultPage = searchPage.chooseFromContainer();
        Assert.assertEquals(searchResultPage.searchResultPageSubheading(), "Searching for sales fore within");
    }

    @Test
    public void testSearchWithValue() {
        SearchPage searchPage = homePage.clickSearch();
        searchPage.enterSearchValue("murder");
        SearchResultPage resultPage = searchPage.searchForValue();
        Assert.assertTrue(resultPage.datasetsIsClicked());
    }

    @Test
    //Failing Test for screenshot
    public void checkTitlesH6() {
        SearchPage searchPage = homePage.clickSearch();
        searchPage.enterSearchValue("homicide");
        SearchResultPage resultPage = searchPage.searchForValue();
        String[] titles = resultPage.getDatasetTitlesH6();
        for (int i = 0; i < titles.length; i++) {
            Assert.assertFalse(titles[i].contains("homicide"));
        }
    }

}
