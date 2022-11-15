package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MS_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.Firefox.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
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
        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("standard_user");
        //find password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");
        driver.quit();
    }
}
