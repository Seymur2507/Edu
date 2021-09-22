package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //@FindBy(xpath = "//input[name=\"login\"]")
    @FindBy(xpath = "//input[@name=\"login\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordInput;

    //@FindBy(xpath = "//input[@class=\"btn btn-danger\"]")
    @FindBy(xpath = "//input[@value=\"Авторизоваться\"]")
    private WebElement AuthBtn;

    //ВВод почты
    public void inputEmail(String email) {
        emailInput.sendKeys(email);}
    //Ввод пароля
    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }
    //Клик логина
    public void AuthClick(){
        AuthBtn.click();
    }
}




