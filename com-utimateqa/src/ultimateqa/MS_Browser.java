package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MS_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.Edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
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
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("abc1@gmail.com");
        //find password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("abc1");
        driver.quit();
    }
}


