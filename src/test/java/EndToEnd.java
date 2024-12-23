import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class EndToEnd {
    @Test
    public void Testing() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(" https://askomdch.com/");
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.id("reg_username")).sendKeys("abcd");
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("9874");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='register']")).click();
        driver.findElement(By.linkText("Store")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("blue Jeans");
        driver.findElement(By.xpath("//*[@value='Search']")).click();
        Thread.sleep(3000);
        WebElement Default=driver.findElement(By.xpath("//*[@name='orderby']"));
        Select Option=new Select(Default);
        Option.selectByValue("rating");
        Thread.sleep(3000);
        JavascriptExecutor Scroll=(JavascriptExecutor)driver;
        Scroll.executeScript("window.scroll(0,500)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Basic Blue Jeans']")).click();
        Thread.sleep(3000);
        JavascriptExecutor Screen=(JavascriptExecutor)driver;
        Screen.executeScript("window.scroll(0,300)");
        File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File DectnationFile = new File("C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\sxreenShorts\\roduct.jpg");
        FileUtils.copyFile(SourceFile, DectnationFile);
        System.out.println("ScreenShort Saved");
        driver.findElement(By.xpath("//*[@class='single_add_to_cart_button button alt']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(" //*[@tabindex='1']")).click();
        Thread.sleep(3000);
        JavascriptExecutor CheckScroll=(JavascriptExecutor)driver;
        CheckScroll.executeScript("window.scroll(0,500)");
        driver.findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("billing_first_name")).sendKeys("abcd");
        Thread.sleep(2000);
        driver.findElement(By.id("billing_last_name")).sendKeys("ef");
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("India");
         driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[1]")).click();
         driver.findElement(By.xpath("//li[@class='select2-results__option'][contains(text(),'India')][2]")).click();
         driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
         driver.findElement(By.xpath("//li[@class='select2-results__option'][contains(text(), 'Karnataka')]")).click();
        driver.findElement(By.id("billing_address_1")).sendKeys("Dno:123/45 ");
        driver.findElement(By.name("billing_city")).sendKeys("Andhra Pradesh");
        driver.findElement(By.name("billing_postcode")).sendKeys("1234567");
        driver.findElement(By.id("billing_email")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='woocommerce_checkout_place_order'][contains(text(), 'Place order')]")).click();
        driver.close();
    }
}
