package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTests extends BaseTest {

    @Test
    public void infoAlertTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/javascrip_alerts");

        driver.findElement(By.xpath("//button[. = 'Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();

    }

    @Test
    public void  confirmAlertTest(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/javascrip_alerts");

        driver.findElement(By.xpath("//button[. = 'Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.sendKeys("OK");
        alert.accept();






    }
}
