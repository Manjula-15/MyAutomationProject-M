import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class TestGoogle {
    @Test
    public static void dummytest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        String expectedName = "Google Search";
        String ActualName = driver.findElement(By.name("btnK")).getAttribute("value");
        if (ActualName.equals(expectedName)) {
            System.out.println("Validated" + ActualName);
        } else {
            System.out.println("not Validated" + ActualName);
        }
        String expectedName2 = "I'm Feeling Lucky";
        String ActualName2 = driver.findElement(By.name("btnI")).getAttribute("value");
        if (ActualName2.equals(expectedName2)) {
            System.out.println("Validated" + ActualName2);
        } else {
            System.out.println("not Validated" + ActualName2);
        }
    }
}
//highlight(driver, driver.findElement(By.id("login_field")));
//highlight(driver, driver.findElement(By.name("password")));
//highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
////highlight(driver, driver.findElement(By.xpath("//*[@type='submit']")));
//highlight(driver, driver.findElement(By.className("header-logo")));
//highlight(driver, driver.findElement(By.linkText("Forgot password?")));
//highlight(driver, driver.findElement(By.partialLinkText("Create an")));
//highlight(driver, driver.findElement(By.tagName("h1")));
