package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button  {
    private UIElement uiElement;

    public Button(WebDriver driver, By by) {
        uiElement = new UIElement(driver, by);
    }

    public Button(WebDriver driver, WebElement webElement){
        uiElement = new UIElement(driver, webElement);
    }

    public void click() {
        uiElement.click();
    }

    public void submit() {
        uiElement.submit();
    }
}
