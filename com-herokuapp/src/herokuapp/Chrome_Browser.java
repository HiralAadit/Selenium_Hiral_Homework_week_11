package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome_Browser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
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
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //get page source
        System.out.println("Page Source : " + driver.getPageSource());

        //find Email ID field element
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("abc1@gmail.com");
        //find password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("abc1");
        driver.quit();
    }
}










