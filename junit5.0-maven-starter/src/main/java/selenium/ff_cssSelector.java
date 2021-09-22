package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Будем искать ссылку, то есть cssSelector a, с классом march8
public class ff_cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // 3. По cssSelector

        driver.get("http://www.urn.su/i/selenium/basic_test/");

        WebElement march8Link =
                driver.findElements(By.cssSelector("a[class=march8]")).get(0);
        march8Link.click();
    }
}
