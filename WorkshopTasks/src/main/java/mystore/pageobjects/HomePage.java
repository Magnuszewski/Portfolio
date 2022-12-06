package mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {

    private final WebDriver driver;
    private final String URL = "https://mystore-testlab.coderslab.pl/index.php";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage openPage(){
        driver.get(URL);
        return this;
    }
    public AuthenticationPage signInButton(){
        WebElement signInButton = driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span"));
        signInButton.click();
        return new AuthenticationPage(driver);
    }
}