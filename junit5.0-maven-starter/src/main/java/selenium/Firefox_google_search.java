package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_google_search {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // 1. По id
        driver.get("https://www.google.ru/");

        WebElement searchField =
                driver.findElement(By.name("q"));

        searchField.sendKeys("велосипед");
        searchField.submit();
    }
}
