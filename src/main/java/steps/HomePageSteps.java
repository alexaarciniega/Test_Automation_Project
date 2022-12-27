package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;

import java.util.List;

public class HomePageSteps extends BaseSteps {

    public int categoriesListNumber;
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);


    public HomePageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void countNumberOfCategories() {
        List<WebElement> categoriesList = homePage.getCategoriesListItem();
        categoriesListNumber = categoriesList.size();
        System.out.println("The number of categories in the Home Page is: " + categoriesListNumber);
    }

    public void clickOnProduct(String product) {
        homePage.getSamsungGalaxyS6().click();
    }
}

