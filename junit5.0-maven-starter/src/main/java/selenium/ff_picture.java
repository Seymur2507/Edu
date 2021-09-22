package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Теперь разберёмся с картинкой. Воспользуемся поиском по тэгу.
public class ff_picture {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
// 4. По tagName

        driver.get("http://www.urn.su/i/selenium/basic_test/");

        WebElement imageLink =
                driver.findElements(By.linkText("https://urn.su/different/dudewife.php")).get(1);
        imageLink.click();
    }

}
