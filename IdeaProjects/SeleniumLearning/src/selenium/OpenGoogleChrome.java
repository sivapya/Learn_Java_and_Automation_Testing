package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sivakumar\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.quit();
    }
}
