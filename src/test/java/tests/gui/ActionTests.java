package tests.gui;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DashboardPage;
import steps.LoginSteps;

import java.util.concurrent.TimeUnit;

public class ActionTests extends BaseTest {


    @Test
    public void clickBottomLink() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());
        DashboardPage dashboardPage = new DashboardPage(driver, false);
        dashboardPage.clickBottomProjectLink();
    }

//    @Test
//    public void dragAndDropTest() {
//        LoginStps loginStps = new LoginStps(driver);
//        loginStps.login(readProperties.getUserName(), readProperties.getPassword());
//
//        driver.get("https://aqa071.testrail.io/index.php?/cases/edit/1/1");
//
//        WebElement icon = driver.findElement(By.className("icon-markdown-image"));
//        WebElement stepField = driver.findElement(By.cssSelector(".form-control.form-control"));
//
//       icon.click();
//       WebElement dialogField = driver.findElement(By.xpath("//div="));
//    }

    @Test
    public void uploadTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/upload");

        WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
        uploadInput.sendKeys("C://Users//user//OneDrive//Pictures//Screenshots//Screenshot_5.png");

        driver.findElement(By.id("file-sendKeys")).click();
    }


}
