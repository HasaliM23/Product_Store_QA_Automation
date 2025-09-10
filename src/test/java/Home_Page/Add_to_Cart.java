package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_to_Cart {


    WebDriver driver;

    @BeforeMethod
    public void openLink() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(2000);
    }

    @Test

    public void addToCart() throws InterruptedException {

        //click the item

        WebElement itemClick= driver.findElement(By.xpath("//a[text() = 'Samsung galaxy s6']"));
        itemClick.click();

        Thread.sleep(2000);

        //Click add to cart button

        WebElement addToCart = driver.findElement(By.xpath("//a[text() = 'Add to cart']"));
        addToCart.click();

        Thread.sleep(2000);

        //click the cart

        WebElement cartClick = driver.findElement(By.xpath("//a[@id='cartur']"));
        cartClick.click();

        Thread.sleep(2000);
        //click the place order Button

        WebElement placeOrder = driver.findElement(By.xpath("//button[text()='Place Order']"));
        placeOrder.click();

        Thread.sleep(2000);

        //fill the Order Form

        // fill the name

        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.click();
        Thread.sleep(1000);
        name.sendKeys("Kane Williamson");

        Thread.sleep(1000);
        // fill the country
        WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
        country.click();
        Thread.sleep(1000);
        country.sendKeys("New Zealand");

        Thread.sleep(1000);
        // fill the city
        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.click();
        Thread.sleep(1000);
        city.sendKeys("Wellington");

        Thread.sleep(1000);
        // fill the card Number
        WebElement card = driver.findElement(By.xpath("//input[@id='card']"));
        card.click();
        Thread.sleep(1000);
        card.sendKeys("23-678-90-567-89");

        Thread.sleep(1000);
        // fill the Month
        WebElement month = driver.findElement(By.xpath("//input[@id='month']"));
        month.click();
        Thread.sleep(1000);
        month.sendKeys("June");

        Thread.sleep(1000);
        // fill the Year
        WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
        year.click();
        Thread.sleep(1000);
        year.sendKeys("2030");

        //click purchase
        Thread.sleep(1000);

        WebElement purchase = driver.findElement(By.xpath("//button[text()='Purchase']"));
        purchase.click();



    }
}
