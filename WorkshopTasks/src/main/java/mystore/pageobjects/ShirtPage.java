package mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class ShirtPage {
    private final WebDriver driver;

    public ShirtPage(WebDriver driver) {
        this.driver = driver;
    }

    public ScreenShotPage shirtIcon() throws InterruptedException, IOException {
        WebElement shirtIcon = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/section/div/div[2]/article/div/div[1]/a/img"));
        shirtIcon.click(); //click icon from z glownego menu
        WebElement changeSizeDropdown = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
        changeSizeDropdown.click(); //wybor rozmairu koszuli dropdown
        WebElement changeSizeM = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]"));
        changeSizeM.click(); //wybor M
        WebElement clickQuantityBox = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
        Thread.sleep(1000);
        clickQuantityBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        Thread.sleep(1000);
        clickQuantityBox.sendKeys("5");
        WebElement addToCart = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button"));
        addToCart.click(); //proced do checkout
        Thread.sleep(1000);
        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        proceedToCheckout.click();
        WebElement proceedToCheckoutSecond = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a"));
        proceedToCheckoutSecond.click();
        WebElement continueToPay = driver.findElement(By.xpath("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button"));
        continueToPay.click();
        WebElement continueToShippingMethod = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        continueToShippingMethod.click();
        WebElement payByCheck = driver.findElement(By.xpath("//*[@id=\"payment-option-1\"]"));
        payByCheck.click();
        WebElement agreeTerms = driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]"));
        agreeTerms.click();
        WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        placeOrder.click();
        return new ScreenShotPage(driver);
    }
}


