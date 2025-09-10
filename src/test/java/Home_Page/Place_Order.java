package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Place_Order {

    WebDriver driver;

    @BeforeMethod
    public void openLink() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(2000);
    }

    @Test
    public void placeOrder() throws InterruptedException {

        //click the item

        WebElement itemClick= driver.findElement(By.xpath("//a[text() = 'Samsung galaxy s6']"));
        itemClick.click();

        Thread.sleep(2000);

        //Click add to cart button

        WebElement addToCart = driver.findElement(By.xpath("//a[text() = 'Add to cart']"));
        addToCart.click();


    }
}
