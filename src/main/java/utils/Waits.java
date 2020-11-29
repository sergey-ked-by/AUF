package utils;

import browserService.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public Waits(WebDriver driver, int timeOut) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, timeOut);
    }

    public Waits(WebDriver driver) {
        this.driver = driver;
        ReadProperties readProperties = new ReadProperties();
        webDriverWait = new WebDriverWait(driver, readProperties.getTimeOut());
    }

    public boolean isElementDisplayed(By by) {
       try {
           webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
           return true;
       } catch (TimeoutException ex) {
           return false;
       }
    }

    public WebElement getElementBy(By by) {
        try {
            return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException ex) {
            return null;
        }
    }

    public WebElement isElementClickable(WebElement webElement) {
        try {
            return webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
        } catch (TimeoutException ex) {
            return null;
        }
    }

    // Home Work.

    // 1. Проверка присутствия элемента на странице.
    public WebElement isElementPresences(By by) {
        try {
            return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (TimeoutException ex) {
            return null;
        }
    }

    // 2. Проверка на предмет того, что элемент был выбран.
    public Boolean isElementToBeSelected(By by) {
        try {
            webDriverWait.until(ExpectedConditions.elementToBeSelected(by));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    // 3. Проверка на предмет того, что элемент содержит атрибут с требуемым значением значением.
    public boolean hasAttributeValue(By by) {
        try {
            webDriverWait.until(ExpectedConditions.attributeToBe(by, "Attribute", "Value"));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    // 4. Проверка соответствия заголовка страницы требуемому.
    public boolean hasWebPageTitle(By by) {
        try {
            webDriverWait.until(ExpectedConditions.titleIs("Title"));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    // 5. Проверка на предмет того, что заданный атрибут требуемого элемента содержит какое-то значение.
    public Boolean isAttributeNotEmpty(WebElement webElement) {
        try {
            webDriverWait.until(ExpectedConditions.attributeToBeNotEmpty(webElement, "Attribute"));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    // 6. Проверка на предмет того, что страница содержит фрэйм с возможнотью переключения на него.
    public WebDriver isFrameAvailable(WebElement webElement) {
        try {
            return webDriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
        } catch (TimeoutException ex) {
            return null;
        }
    }

    // 7. Проверка на предмет того, что требуемого элемента нет на странице.
    public Boolean isElementInvisible(WebElement webElement) {
        try {
            webDriverWait.until(ExpectedConditions.invisibilityOf(webElement));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    // 8. Проверка на предмет того, что JavaScript возвращает какое-то значение.
    public boolean isJsReturnedValue(By by) {
        try {
            webDriverWait.until(ExpectedConditions.jsReturnsValue("Java Script"));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    // 9. Проверка на предмет соответствия количества открытых окон браузера требуемому.
    public boolean isNumberOfWindows(int number) {
        try {
            webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(number));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    // 10. Проверка на предмет того что элемент, содержащий заданный текст, присутствует на странице.
    public boolean isTextPresentedInElement(By by) {
        try {
            webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(by, "Some Text"));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }
}
