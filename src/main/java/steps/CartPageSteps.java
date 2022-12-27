package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CartPage;


public class CartPageSteps extends BaseSteps {


    public String headerOne, headerTwo, headerThree, headerFour, samsungS6Pic, samsungS6Title, samsungS6Price, samsungS6Delete, totalCart;
    public boolean isBtnPlaceOrderPresent;
    public WebElement btnPlaceOrder;
    CartPage cartPage = PageFactory.initElements(webDriver, CartPage.class);
    public CartPageSteps(WebDriver webDriver) {
        super(webDriver);
    }


    public void getHeaderText() {
        headerOne = cartPage.getTableHeaderOne().getText();
        headerTwo = cartPage.getTableHeaderTwo().getText();
        headerThree = cartPage.getTableHeaderThree().getText();
        headerFour = cartPage.getTableHeaderFour().getText();
    }

    public void verifyElementsFromProductAreDisplayed(String product) {


        cartPage.getSamsungGalaxyS6Pic().isDisplayed();
        samsungS6Pic = cartPage.getSamsungGalaxyS6Pic().getAttribute("src");

        cartPage.getSamsungGalaxyS6Title().isDisplayed();
        samsungS6Title = cartPage.getSamsungGalaxyS6Title().getText();

        cartPage.getSamsungGalaxyS6Price().isDisplayed();
        samsungS6Price = cartPage.getSamsungGalaxyS6Price().getAttribute("innerText");

        cartPage.getSamsungGalaxyS6Delete().isDisplayed();
        samsungS6Delete = cartPage.getSamsungGalaxyS6Delete().getText();


    }

    public void getTotalFromCart() {
        cartPage.getTotalCart().isDisplayed();
        totalCart = cartPage.getTotalCart().getAttribute("innerText");
    }

    public void getBtnPlaceOrder() {
    isBtnPlaceOrderPresent = cartPage.getBtnPlaceOrder().isDisplayed();
    btnPlaceOrder = cartPage.getBtnPlaceOrder();
    }


}

