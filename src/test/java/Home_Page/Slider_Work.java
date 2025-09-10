package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Slider_Work {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

    }

    @Test
    public void sliderButton() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //click slider

        WebElement nextBtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='carousel-control-next-icon']")));
        nextBtn.click();

        Thread.sleep(2000);
        WebElement prevBtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='carousel-control-prev-icon']")));
        prevBtn.click();
    }


    }
