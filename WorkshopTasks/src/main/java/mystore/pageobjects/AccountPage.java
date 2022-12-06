package mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
    private final WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public AddressesPage addressesButton(){
        WebElement addressesButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[2]/span/i"));
        addressesButton.click();
        return new AddressesPage(driver);
    }
}