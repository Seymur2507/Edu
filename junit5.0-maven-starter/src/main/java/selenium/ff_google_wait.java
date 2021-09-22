package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ff_google_wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
        // Initialize and wait till element(link) became clickable - timeout in 10 seconds
        /*WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        // Print the first result
        System.out.println(firstResult.getText());*/
}}
