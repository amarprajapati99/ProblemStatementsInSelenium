package pages;

import com.bridgelabz.selenium.problem.statements.base.BaseClass;
import org.openqa.selenium.By;

public class Registration extends BaseClass{

    public  void signUpPage(){

        driver.findElement (By.xpath ("//span[normalize-space()='Sign up']")).click ();
        driver.findElement (By.xpath ("//input[@id='id_fullname']")).sendKeys ("Amar Prajapati");

        driver.findElement (By.xpath ("//input[@id='email--1']")).sendKeys ("jack@gmail.com");
        driver.findElement (By.xpath ("//input[@id='password']")).sendKeys ("abcderggdd@1234");
        driver.findElement (By.xpath ("//input[@id='submit-id-submit']")).click ();
    }
}
