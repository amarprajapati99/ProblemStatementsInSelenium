package pages;

import com.bridgelabz.selenium.problem.statements.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

    @FindBy(xpath = "//span[normalize-space()='Log in']")
    WebElement clickLogin;
    @FindBy(xpath = "//input[@id='email--1']")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='id_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='submit-id-submit']")
    WebElement loginButton;

    public LoginPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public void setLoginPage() throws InterruptedException {

        clickLogin.click ();
        emailId.sendKeys ("jacky@gmail.com");
        Thread.sleep (2000);
        password.sendKeys ("abcde@1234");
        Thread.sleep (2000);
        loginButton.click ();
    }
}
