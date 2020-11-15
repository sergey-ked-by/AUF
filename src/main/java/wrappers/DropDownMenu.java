package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
    public WebDriver driver;
    public UIElement uiElement;

    public DropDownMenu(WebDriver driver, By by) {
        uiElement = new UIElement(driver, by);
    }

    public DropDownMenu(WebDriver driver, WebElement webElement){
        uiElement = new UIElement(driver, webElement);
    }

    public void selectDropDownMenu() {
        Select select = new Select(driver.findElement(By.id("language")));
        select.selectByVisibleText("English");
    }

}
