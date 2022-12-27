package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add to cart')]")
    private WebElement linkProductAddToCart;

    @FindBy(how = How.ID, using = "more-information")
    private WebElement linkProductDescription;

    @FindBy(how = How.CLASS_NAME, using = "price-container")
    private WebElement linkProductPrice;

    @FindBy(how = How.CLASS_NAME, using = "name")
    private WebElement linkProductName;

    @FindBy(how = How.TAG_NAME, using = "img")
    private WebElement linkProductImage;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Cart')]")
    private WebElement cartLink;



    public WebElement getLinkProductAddToCart() {

        return linkProductAddToCart;
    }

    public WebElement getLinkProductDescription() {

        return linkProductDescription;
    }

    public WebElement getLinkProductPrice() {
        return linkProductPrice;
    }

    public WebElement getLinkProductName() {

        return linkProductName;
    }

    public WebElement getLinkProductImage() {

        return linkProductImage;
    }

    public WebElement getCartLink() {
        return cartLink;
    }


}

