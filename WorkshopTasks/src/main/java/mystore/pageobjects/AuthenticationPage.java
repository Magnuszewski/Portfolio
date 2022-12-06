package mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AuthenticationPage {
    private final WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }
    public AccountPage fillUserAndPassword(String email, String password){
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"field-email\"]"));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"field-password\"]"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit-login\"]"));
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitButton.click();
        return new AccountPage(driver);
    }
    public ShirtPage fillAndReturn(String email, String password) {
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"field-email\"]"));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"field-password\"]"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit-login\"]"));
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitButton.click();
        WebElement myStoreButton = driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[1]/a/img"));
        myStoreButton.click();
        return new ShirtPage(driver);
    }
}