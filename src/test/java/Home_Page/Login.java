package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    WebDriver driver;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void login_to_Page() throws InterruptedException {
        //click login link
        WebElement loginLink = driver.findElement(By.xpath("//a[@id='login2']"));
        loginLink.click();

        Thread.sleep(1000);

        //Login form

        WebElement userName = driver.findElement(By.xpath("//input[@id='loginusername']"));
        userName.click();
        Thread.sleep(1000);
        userName.sendKeys("Rohit Sharma");

        //password

        WebElement psw = driver.findElement(By.xpath("//input[@id='loginpassword']"));
        psw.click();
        Thread.sleep(1000);
        psw.sendKeys("test1234");

        Thread.sleep(1000);

        //Login Page

        WebElement loginButton = driver.findElement(By.xpath("//button[text() = 'Log in' ]"));
        loginButton.click();
    }
}
