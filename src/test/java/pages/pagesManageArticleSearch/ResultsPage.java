package pages.pagesManageArticleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PageObject;

public class ResultsPage extends PageObject {

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public String searchResult(){
        return driver.findElement(By.className("archive-title")).getText();
    }

    public String searchNoResults(){
        return driver.findElement(By.className("entry-title")).getText();
    }

    public String messageSearchNoResults(){
        return driver.findElement(By.className("entry-content")).getText();
    }



}
