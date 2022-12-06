package mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {
    private final WebDriver driver;

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public AlertPage createNewAddress(String alias, String address, String city, String postalCode, String phone) {
        WebElement aliasInput = driver.findElement(By.xpath("//*[@id=\"field-alias\"]"));
        aliasInput.sendKeys(alias);
        WebElement addressInput = driver.findElement(By.xpath("//*[@id=\"field-address1\"]"));
        addressInput.sendKeys(address);
        WebElement postalCodeInput = driver.findElement(By.xpath("//*[@id=\"field-postcode\"]"));
        postalCodeInput.sendKeys(postalCode);
        WebElement cityInput = driver.findElement(By.xpath("//*[@id=\"field-city\"]"));
        cityInput.sendKeys(city);
        WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"field-id_country\"]"));
        countryDropdown.click();
        WebElement unitedKingdom = driver.findElement(By.xpath("//*[@id=\"field-id_country\"]/option[2]"));
        unitedKingdom.click();
        WebElement phoneInput = driver.findElement(By.xpath("//*[@id=\"field-phone\"]"));
        phoneInput.sendKeys(phone);
        WebElement saveButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/footer/button"));
        saveButton.click();
        return new AlertPage(driver);
    }
}