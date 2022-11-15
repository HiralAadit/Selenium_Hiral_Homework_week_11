package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser {
    static String browser = "Chrome";
    static String baseUrl= "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.Firefox.driver","drivers/geckodriver.exe");
            driver= new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.Edge.driver","drivers/msedgedriver.exe");
            driver= new EdgeDriver();
        }else{
            System.out.println("Wrong Browser Name");
            }
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
        System.out.println("Current URL:"+driver.getCurrentUrl());
        //get page source
        System.out.println("Page Source:"+driver.getPageSource());
        //find element for username
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");
        //find element for password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Admin123");
        driver.quit();
        }
    }
