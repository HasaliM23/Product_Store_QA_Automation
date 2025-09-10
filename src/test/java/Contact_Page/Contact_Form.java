package Contact_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Contact_Form {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

    }

    private void slowDown(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void contact_Form() {

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //contact link click

        WebElement contactLink= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Contact']")));
        contactLink.click();


        //contact email

        WebElement contactEmail= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='recipient-email']")));
        contactEmail.click();

        contactEmail.sendKeys("rohitsharma@gmail.com");
        slowDown(1500);


        //contact name

        WebElement contactName= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='recipient-name']")));
        contactName.click();

        contactName.sendKeys("Rohit Sharma");
        slowDown(1500);


        //Message

        WebElement message= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='message-text']")));
        message.click();

        message.sendKeys("Plz send me more details");
        slowDown(1500);


        // click send message button
        WebElement send = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send message']")));
        send.click();
        // handle alert
        driver.switchTo().alert().accept();






    }


}
