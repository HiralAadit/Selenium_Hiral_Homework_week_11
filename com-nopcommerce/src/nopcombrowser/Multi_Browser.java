package nopcombrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser {
    static String browser = "Chrome";
    static String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.Edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser Name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL: " +driver.getCurrentUrl());
//get page source
        System.out.println("page source" + driver.getPageSource());
//Navigate to login in link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find Email ID field element
        WebElement emailFeild = driver.findElement(By.id("Email"));
        emailFeild.sendKeys("abc1@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc1");

        driver.quit();
    }
}
