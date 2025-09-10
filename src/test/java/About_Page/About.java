package About_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class About {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

    }

    @Test
    public void aboutPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //About Link Click

        WebElement aboutLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='About us']")));
        aboutLink.click();

        WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'][normalize-space()='Close'])[4]")));
        close.click();




    }


    }
