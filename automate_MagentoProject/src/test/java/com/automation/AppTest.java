package com.automation;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {

    @Test
    void openBrowserAndNavigate() {
        try {
            // Set the path for your ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

            // Set Chrome Options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-web-security");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--no-sandbox");
            // Uncomment the next line if you want headless mode
            // options.addArguments("--headless=new");  

            System.out.println("Launching ChromeDriver...");
            WebDriver driver = new ChromeDriver(options);

            System.out.println("Navigating to Google...");
            driver.get("https://int-connect.surewerx.com/en-us/");

            System.out.println("Maximizing window...");
            driver.manage().window().maximize();

            System.out.println("Test completed. Waiting for 5 seconds...");
            Thread.sleep(5000);

            System.out.println("Closing browser...");
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
