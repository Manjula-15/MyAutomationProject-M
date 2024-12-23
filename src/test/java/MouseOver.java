import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MouseOver {
    @Test
    public void Pratice() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("name")).sendKeys("abcd");
        driver.findElement(By.id("mobile")).sendKeys("1234456798");
        driver.findElement(By.xpath("//*[@name='gender']")).click();
        Thread.sleep(3000);
        WebElement Statedropdown = driver.findElement(By.xpath("//select[@id='state']"));
        Select State = new Select(Statedropdown);
        List<WebElement> Option = State.getOptions();
        for (WebElement option : Option) {
            System.out.println(option.getText());
        }
        State.selectByValue("Uttar Pradesh");
        Thread.sleep(3000);
        File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File DectnationFile = new File("C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\sxreenShorts\\login.jpg");
        FileUtils.copyFile(SourceFile, DectnationFile);
        System.out.println("ScreenShort Saved");
    }
    @Test
    public void mouseover() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@class='btn btn-danger'] ")).click();
        Alert TextBox= driver.switchTo().alert();
        Thread.sleep(5000);
        TextBox.accept();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());

//        ConformBox
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
        Thread.sleep(5000);
        Alert Box= driver.switchTo().alert();
        Thread.sleep(5000);
        Box.accept();
        //driver.switchTo().alert().accept();
        Thread.sleep(5000);

    }
    @Test
    public void Scroll() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://askomdch.com/");
        Thread.sleep(5000);
        JavascriptExecutor Java=(JavascriptExecutor) driver;
        Java.executeScript("window.scroll(0,800)");
        Thread.sleep(5000);
        File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File DectnationFile = new File("C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\sxreenShorts\\fullScreen.jpg");
        FileUtils.copyFile(SourceFile, DectnationFile);
        System.out.println("ScreenShort Saved");


    }
}






















