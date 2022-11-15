package nopcombrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome_Browser {

    public static void main(String[] args) {
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //get current URL
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
