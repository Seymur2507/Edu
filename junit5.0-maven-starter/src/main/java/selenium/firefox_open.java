package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class firefox_open {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // 1. По id
        driver.get("http://www.urn.su/i/selenium/basic_test/");

        WebElement searchField =
                driver.findElement(By.id("name1"));

        searchField.sendKeys("topbicycle.ru");
        searchField.submit();
    }
}
