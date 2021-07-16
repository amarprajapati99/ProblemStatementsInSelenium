package pages;

import ObjectRepository.ReadDataConfig;
import com.bridgelabz.selenium.problem.statements.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Log;

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
        Log.info ("fetch the user name from config file");

        emailId.sendKeys(ReadDataConfig.getProperty(ReadDataConfig.CONFIG_PATH,"username"));
        Thread.sleep (2000);

        Log.info ("fetch the user pass from config file");
        password.sendKeys(ReadDataConfig.getProperty(ReadDataConfig.CONFIG_PATH,"password"));
        Thread.sleep (2000);

        loginButton.click ();
        driver.getTitle ();
    }
}
