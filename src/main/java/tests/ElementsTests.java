package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import steps.CartPageSteps;
import steps.HomePageSteps;
import steps.ProductPageSteps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ElementsTests extends BaseTest {

    HomePageSteps homePageSteps = new HomePageSteps(driver);
    ProductPageSteps productPageSteps = new ProductPageSteps(driver);
    CartPageSteps cartPageSteps = new CartPageSteps(driver);



    @Test (description = "Test to verify that there are three categories in the Home Page")
    public void checkCategoriesHomePage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageSteps.countNumberOfCategories();
        int actualNumberOfCategories = homePageSteps.categoriesListNumber;
        int expectedNumberOfCategories = 3;
        CustomAssertions.isNumberOfCategoriesThree(actualNumberOfCategories, expectedNumberOfCategories);
    }

    @Test (description = "Test to verify that each product page has the elements 'Add to cart button', 'Product Description', 'Price', 'Name of Product' and 'Image of Product'")
    public void checkElementsProductPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageSteps.clickOnProduct("nokiaLumia1520");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        productPageSteps.verifyAddToCartIsDisplayed();
        CustomAssertions.isElementDisplayed(productPageSteps.addToCartElement, productPageSteps.addToCartDisplayed);
        productPageSteps.verifyProductDescriptionIsDisplayed();
        CustomAssertions.isElementDisplayed(productPageSteps.productDescriptionElement, productPageSteps.productDescriptionDisplayed);
        productPageSteps.verifyPriceIsDisplayed();
        CustomAssertions.isElementDisplayed(productPageSteps.productPriceElement, productPageSteps.priceDisplayed);
        productPageSteps.verifyProductNameIsDisplayed();
        CustomAssertions.isElementDisplayed(productPageSteps.productNameElement, productPageSteps.productNameDisplayed);
        productPageSteps.verifyProductImageIsDisplayed();
        CustomAssertions.isElementDisplayed(productPageSteps.productImageElement, productPageSteps.productImageDisplayed);
    }
    

    @Test (description = "Test to verify that the alert after adding an item to the cart is displayed")
    public void checkAlertAfterAddingToCart() {
        String expectedAlertMessage = "Product added";
        boolean alertPresent = false;

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageSteps.clickOnProduct("nokiaLumia1520");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        productPageSteps.clickOnAddToCart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        //Check if alert is present
        Alert alert = driver.switchTo().alert();
        if (alert != null) {
            alertPresent = true;
            System.out.println("The alert is present.");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Check if alert is present
        CustomAssertions.isAlertPresent(alertPresent);

        //Get message from alert
        String alertMessage = driver.switchTo().alert().getText();
        //Verify if alert message is as expected
        CustomAssertions.isTextFromAlertRight(expectedAlertMessage, alertMessage);
        //Click ok button from Alert
        driver.switchTo().alert().accept();
        System.out.println("The text displayed in the alert is: " + alertMessage);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test (description = "Test to verify that each of all the items are displayed in the cart")
    public void checkElementsInCart() {
        String expectedHeaderOne = "Pic";
        String expectedHeaderTwo = "Title";
        String expectedHeaderThree = "Price";
        String expectedHeaderFour = "x";
        String expectedPic = "https://www.demoblaze.com/imgs/galaxy_s6.jpg";
        String expectedTitle = "Samsung galaxy s6";
        String expectedPrice = "360";
        String expectedDelete = "Delete";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageSteps.clickOnProduct("samsungGalaxyS6");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        productPageSteps.clickOnAddToCart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        productPageSteps.clickOnCartLink();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cartPageSteps.getHeaderText();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        CustomAssertions.isCartTextAsExpected(cartPageSteps.headerOne, expectedHeaderOne);
        CustomAssertions.isCartTextAsExpected(cartPageSteps.headerTwo, expectedHeaderTwo);
        CustomAssertions.isCartTextAsExpected(cartPageSteps.headerThree, expectedHeaderThree);
        CustomAssertions.isCartTextAsExpected(cartPageSteps.headerFour, expectedHeaderFour);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cartPageSteps.verifyElementsFromProductAreDisplayed("samsungGalaxyS6");
        CustomAssertions.isCartTextAsExpected(cartPageSteps.samsungS6Pic, expectedPic);
        CustomAssertions.isCartTextAsExpected(cartPageSteps.samsungS6Title, expectedTitle);
        CustomAssertions.isCartTextAsExpected(cartPageSteps.samsungS6Price, expectedPrice);
        CustomAssertions.isCartTextAsExpected(cartPageSteps.samsungS6Delete, expectedDelete);
        cartPageSteps.getTotalFromCart();
        CustomAssertions.isCartTextAsExpected(cartPageSteps.totalCart, expectedPrice);
        cartPageSteps.getBtnPlaceOrder();
        CustomAssertions.isElementDisplayed(cartPageSteps.btnPlaceOrder, cartPageSteps.isBtnPlaceOrderPresent);
    }
}
