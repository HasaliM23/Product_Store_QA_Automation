package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sign_up {

    WebDriver driver;

    @BeforeMethod

    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void signUp() throws InterruptedException {

        // click sign up link

        WebElement signUpLink = driver.findElement(By.xpath("//a[@id='signin2']"));
        signUpLink.click();
        Thread.sleep(1000);

        //sign up form

        WebElement username = driver.findElement(By.id("sign-username"));
        username.click();
        Thread.sleep(1000);
        username.sendKeys("Rohit Sharma");



        WebElement psw = driver.findElement(By.xpath("//input[@id='sign-password']"));
        psw.click();
        Thread.sleep(1000);
        psw.sendKeys("test1234");

        // click register
        Thread.sleep(1000);

        WebElement register = driver.findElement(By.xpath("//button[text()='Sign up']"));
        register.click();



    }



}
