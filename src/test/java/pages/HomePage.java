package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.pagesManageArticleSearch.ResultsPage;

public class HomePage extends PageObject{

    private static final String URL_HOME_PAGE = "https://blogdoagi.com.br/";

    public HomePage() {
        super(null);
        driver.navigate().to(URL_HOME_PAGE);
    }

    public boolean isPageHome(){
        awaitPage();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("front-section-title"))).isDisplayed();
    }

    public void openSearchComponent(){
        awaitPage();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("search-open"))).click();
    }

    public boolean verifyFieldSearch(){
        awaitPage();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-field"))).isDisplayed();
    }

    public void fillIinSearchField(String textSearch){
        awaitPage();
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.className("search-field")));

        searchField.click();
        searchField.sendKeys(textSearch);
    }

    public boolean verifyButtonSearch(){
        awaitPage();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-submit"))).isDisplayed();
    }

    public ResultsPage clickButtonSearch(){
        driver.findElement(By.className("search-submit")).click();
        return new ResultsPage(driver);
    }

}
