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

public class pagination_work {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

    }

    @Test
    public void paginationButton() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //click next pagination button

        WebElement next = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='next2']")));
        next.click();

        //click prev button

        Thread.sleep(2000);

        WebElement prev = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='prev2']")));
        prev.click();


    }

}
