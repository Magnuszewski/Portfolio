package mystore.pageobjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotPage {

    private final WebDriver driver;

    public ScreenShotPage(WebDriver driver) throws IOException {
        this.driver = driver;

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Coders2\\Zrzut\\Zrzut.png"));
    }
}