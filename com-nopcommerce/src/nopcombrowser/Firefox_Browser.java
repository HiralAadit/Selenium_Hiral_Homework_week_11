package nopcombrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Firefox_Browser {
    public static void main(String[] args) {
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //get title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //get current URL
        System.out.println("Current url: " + driver.getCurrentUrl());
        //get page sources
        System.out.println("page source" +driver.getPageSource());
        //Navigate to login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc1@gmail.com");

        //find password field element
        WebElement passwordField=driver.findElement(By.name("Password"));
        emailField.sendKeys("abc1");

        driver.quit();

    }
}
