package mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {
    private final WebDriver driver;
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText() {
        WebElement alert = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article"));
        return alert.getText();
    }
}
