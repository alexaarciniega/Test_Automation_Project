package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "itemc")
    private List<WebElement> categoriesListItem;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Samsung galaxy s6')]")
    private WebElement samsungGalaxyS6;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Nokia lumia 1520')]")
    private WebElement nokiaLumia1520;




    public List<WebElement> getCategoriesListItem() {
        return categoriesListItem;
    }

    public WebElement getSamsungGalaxyS6() {
        return samsungGalaxyS6;
    }

    public WebElement getNokiaLumia1520() {

        return nokiaLumia1520;
    }
}
