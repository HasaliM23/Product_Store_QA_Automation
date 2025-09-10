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

public class Laptop_Section {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

    }

    @Test
    public void laptop_Section() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Click laptop link

        WebElement laptopLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Laptops']")));
        laptopLink.click();

        WebElement clickLaptop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sony vaio i5']")));
        clickLaptop.click();


        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-success btn-lg']")));
        addToCart.click();

        // handle "Product added" alert
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Cart']")));
        cart.click();

        WebElement placeOrder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-success']")));
        placeOrder.click();

        //fill the Order Form

        // fill the name

        WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
        name.click();
        name.sendKeys("Joe Root");


        // fill the country
        WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='country']")));
        country.click();

        country.sendKeys("England");


        // fill the city
        WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='city']")));
        city.click();

        city.sendKeys("London");


        // fill the card Number
        WebElement card = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='card']")));
        card.click();

        card.sendKeys("45-567-90-890-90");


        // fill the Month
        WebElement month = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='month']")));
        month.click();

        month.sendKeys("June");


        // fill the Year
        WebElement year = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='year']")));
        year.click();

        year.sendKeys("2030");

        //click purchase


        WebElement purchase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //button[text()='Purchase']")));
        purchase.click();
    }


}
