package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ProductPage;


public class ProductPageSteps extends BaseSteps {

    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);

    public String addToCartElement, productDescriptionElement, productPriceElement, productNameElement, productImageElement, alertMessage;

    public boolean addToCartDisplayed, productDescriptionDisplayed, priceDisplayed, productNameDisplayed, productImageDisplayed, isOkButtonDisplayed;

    public ProductPageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void verifyAddToCartIsDisplayed() {
        addToCartElement = productPage.getLinkProductAddToCart().getText();
        addToCartDisplayed = productPage.getLinkProductAddToCart().isDisplayed();

        if (addToCartDisplayed == true) {
            System.out.println("The 'Add to cart' button is displayed.");
        } else {
            System.out.println("The 'Add to cart' button is not displayed.");
        }
    }

    public void verifyProductDescriptionIsDisplayed() {
        productDescriptionElement = productPage.getLinkProductDescription().getText();
        productDescriptionDisplayed = productPage.getLinkProductDescription().isDisplayed();

        if (productDescriptionDisplayed == true) {
            System.out.println("The 'Product description' is displayed.");
        } else {
            System.out.println("The 'Product description' is not displayed.");
        }
    }

    public void verifyPriceIsDisplayed() {
        productPriceElement = productPage.getLinkProductPrice().getText();
        priceDisplayed = productPage.getLinkProductPrice().isDisplayed();

        if (priceDisplayed == true) {
            System.out.println("The 'Product price' is displayed.");
        } else {
            System.out.println("The 'Product price' is not displayed.");
        }
    }

    public void verifyProductNameIsDisplayed() {
        productNameElement = productPage.getLinkProductName().getText();
        productNameDisplayed = productPage.getLinkProductName().isDisplayed();

        if (productNameDisplayed == true) {
            System.out.println("The 'Product name' is displayed.");
        } else {
            System.out.println("The 'Product name' is not displayed.");
        }
    }

    public void verifyProductImageIsDisplayed() {
        productImageElement = productPage.getLinkProductImage().getText();
        productImageDisplayed = productPage.getLinkProductImage().isDisplayed();

        if (productImageDisplayed == true) {
            System.out.println("The 'Product image' is displayed.");
        } else {
            System.out.println("The 'Product image' is not displayed.");
        }
    }

    public void clickOnAddToCart() {
        productPage.getLinkProductAddToCart().click();
    }

    public void clickOnCartLink() {
        productPage.getCartLink().click();
    }


}



