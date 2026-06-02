package org.scalesoft;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest
{


    @Test
    public  void launch() {
     WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");        // run without UI
    options.addArguments("--no-sandbox");      // required in CI
    options.addArguments("--disable-dev-shm-usage"); // avoid shared memory issues

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println("successfully application launched");
        driver.close();

    }
}
