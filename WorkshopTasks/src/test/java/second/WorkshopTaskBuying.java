package second;

import mystore.pageobjects.*;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class WorkshopTaskBuying {

    private static WebDriver driver;
    private HomePage homePage;
    private AuthenticationPage authenticationPage;
    private ShirtPage shirtPage;
    private ScreenShotPage screenShotPage;
    private final String EMAIL = "magnuszewski87@gmail.com";
    private final String PASSWORD = "Celina23041987";

    @BeforeEach
    void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void LogInAndBuy() throws InterruptedException, IOException {
        homePage = new HomePage(driver);
        homePage.openPage();
        authenticationPage = homePage.signInButton();
        shirtPage = authenticationPage.fillAndReturn(EMAIL, PASSWORD);
        screenShotPage = shirtPage.shirtIcon();

    }
    @After
    static void tearDown(){
        driver.quit();
    }
}