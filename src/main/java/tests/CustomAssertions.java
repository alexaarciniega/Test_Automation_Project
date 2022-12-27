package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CustomAssertions extends Assert {

    public static void isNumberOfCategoriesThree (int actualNumberOfCategories, int expectedNumberOfcategories) {
        String errorMessage = "The number of categories is different thant three. The actual number is: " + actualNumberOfCategories;
        Assert.assertEquals(actualNumberOfCategories, expectedNumberOfcategories, errorMessage);
    }

    public static void isElementDisplayed(String element, boolean condition) {
        String errorMessage = "The element " + element + " is not being displayed";
        Assert.assertTrue(condition, errorMessage);
    }

    public static void isElementDisplayed(WebElement element, boolean condition) {
        String errorMessage = "The element " + element + " is not being displayed";
        Assert.assertTrue(condition, errorMessage);
    }

    public static void isTextFromAlertRight(String actualAlertMessage, String expectedAlertMessage) {
        String errorMessage = "The message is not correct.";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, errorMessage);
    }

    public static void isAlertPresent(boolean alertBool) {
        String errorMessage = "The alert is not present.";
        Assert.assertTrue(alertBool, errorMessage);
    }

    public static void isCartTextAsExpected(String actualText, String expectedText) {
        String errorMessage = "The actual text of the header does not match with the expected one. Expected: " + expectedText + ". Got instead: " + actualText + ".";
        Assert.assertEquals(actualText, expectedText, errorMessage);
    }

}
