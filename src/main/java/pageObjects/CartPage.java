package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//th[1]")
    private WebElement tableHeaderOne;

    @FindBy(how = How.XPATH, using = "//th[2]")
    private WebElement tableHeaderTwo;

    @FindBy(how = How.XPATH, using = "//th[3]")
    private WebElement tableHeaderThree;

    @FindBy(how = How.XPATH, using = "//th[4]")
    private WebElement tableHeaderFour;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/galaxy_s6.jpg']")
    private WebElement samsungGalaxyS6Pic;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Samsung galaxy s6')]")
    private WebElement samsungGalaxyS6Title;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'360')]")
    private WebElement samsungGalaxyS6Price;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Delete')]")
    private WebElement samsungGalaxyS6Delete;

    @FindBy(how = How.ID, using = "totalp")
    private WebElement totalCart;

    @FindBy(how = How.CLASS_NAME, using = "btn-success")
    private WebElement btnPlaceOrder;






    public WebElement getTableHeaderOne() {
        return tableHeaderOne;
    }

    public WebElement getTableHeaderTwo() {
        return tableHeaderTwo;
    }

    public WebElement getTableHeaderThree() {
        return tableHeaderThree;
    }

    public WebElement getTableHeaderFour() {
        return tableHeaderFour;
    }

    public WebElement getSamsungGalaxyS6Pic() {
        return samsungGalaxyS6Pic;
    }

    public WebElement getSamsungGalaxyS6Title() {
        return samsungGalaxyS6Title;
    }

    public WebElement getSamsungGalaxyS6Price() {
        return samsungGalaxyS6Price;
    }

    public WebElement getSamsungGalaxyS6Delete() {
        return samsungGalaxyS6Delete;
    }

    public WebElement getTotalCart() {
        return totalCart;
    }

    public WebElement getBtnPlaceOrder() {
        return btnPlaceOrder;
    }
}