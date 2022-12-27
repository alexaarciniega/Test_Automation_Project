package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseSteps {

    WebDriver webDriver;
    Actions customActions;
    JavascriptExecutor js;

    public BaseSteps (WebDriver webDriver) {
        this.webDriver = webDriver;
        this.customActions = new Actions(webDriver);
        js = (JavascriptExecutor) webDriver;
    }
}
