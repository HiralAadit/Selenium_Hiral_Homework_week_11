package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.Firefox.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get tiltl of the page
        String title = driver.getTitle();
        System.out.println(title);
        //get current URL
        System.out.println("Current URL: "+ driver.getCurrentUrl());
        //Get page source
        System.out.println("Page Source:" + driver.getPageSource());
        //find email ID field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");
        //find password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        driver.quit();

    }
}

