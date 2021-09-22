package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//С помощью linkText найдём все ссылки с текстом Renovation, выберем первую и кликнем на неё
public class ff_renovation {
    public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver","C:/webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // 2. По linkText

        driver.get("http://www.urn.su/i/selenium/basic_test/");

        WebElement renovationLink =
                driver.findElements(By.linkText("Renovation")).get(0);
        renovationLink.click();
    }
}