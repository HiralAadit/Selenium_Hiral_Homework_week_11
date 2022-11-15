package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_Browser {
    static String browser = "Chrome";

    static String baseUrl = "https://www.saucedemo.com/";


    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.firefox.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser Name");
        }

    }

}

