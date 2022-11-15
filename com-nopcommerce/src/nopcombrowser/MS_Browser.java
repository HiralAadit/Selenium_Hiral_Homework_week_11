package nopcombrowser;

import graphql.relay.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MS_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.Edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //Launch the URL
        driver.get(baseUrl);

        //maximize window
        driver.manage().window().maximize();

        //give time implicit to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get current URL
        System.out.println("Current url:" + driver.getCurrentUrl());

        //get page source
        System.out.println("page sourced:" + driver.getPageSource());
        WebElement loginLink=driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //find Email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc1@gmail.com");

        //find password field element
        WebElement passwordFIeld = driver.findElement(By.name("Password"));
        passwordFIeld.sendKeys("abc1");

        driver.quit();

    }
}
