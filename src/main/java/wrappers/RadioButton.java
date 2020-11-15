package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton  {
    private UIElement uiElement;

    public RadioButton(WebDriver driver, By by) {
        uiElement = new UIElement(driver, by);
    }

    public RadioButton(WebDriver driver, WebElement webElement){
        uiElement = new UIElement(driver, webElement);
    }

    public void click() {
        uiElement.click();
    }
}
