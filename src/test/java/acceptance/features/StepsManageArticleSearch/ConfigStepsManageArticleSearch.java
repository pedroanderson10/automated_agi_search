package acceptance.features.StepsManageArticleSearch;

import pages.HomePage;
import pages.pagesManageArticleSearch.ResultsPage;

public class ConfigStepsManageArticleSearch {

    protected HomePage homePage;
    protected ResultsPage resultsPage;

    public void setUp() {
        this.homePage = new HomePage();
    }

    public void tearDown(){
        this.resultsPage.closeBrowser();
    }
}
