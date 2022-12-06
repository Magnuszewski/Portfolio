package first;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mystore.pageobjects.*;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WorkshopTaskAddressSteps {

    private WebDriver driver;
    private HomePage homePage;
    private AccountPage accountPage;
    private AuthenticationPage authenticationPage;
    private AlertPage alertPage;
    private AddressesPage addressesPage;
    private final String EMAIL = "magnuszewski87@gmail.com";
    private final String PASSWORD = "Celina23041987";

    public WorkshopTaskAddressSteps() {
    }
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }
    @Given("an open browser with HomePage")
    public void openBrowserOnHomePage() {
        homePage = new HomePage(driver);
        homePage.openPage();
    }
    @And("click signIn button")
    public void signInButton() {
        authenticationPage = homePage.signInButton();
    }

    @And("fill out login with email and password")
    public void fillUserAndPassword() {
        accountPage = authenticationPage.fillUserAndPassword(EMAIL, PASSWORD);
    }

    @Then("click Addresses tab")
    public void addressesButton() {
        addressesPage = accountPage.addressesButton();
    }

    @And("^fill out (.*) and (.*) and (.*) and (.*) and (.*)")
    public void createNewAddress(String alias, String address,String postalCode, String city,String phone) {
        alertPage = addressesPage.createNewAddress(alias, address, postalCode, city, phone);
    }
    @And("get alert")
    public void getAlertText() {
        String expectedMessage = "Address successfully added!";
        String alertText = alertPage.getAlertText();
        Assertions.assertThat(alertText).isEqualTo(expectedMessage);
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
