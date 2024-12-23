import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
        @Test
        public static void allElements(){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\IdeaProjects\\MySelenium\\src\\main\\resources\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://github.com/login");
            highlight(driver, driver.findElement(By.id("login_field")));
            highlight(driver, driver.findElement(By.name("password")));
            highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
            highlight(driver, driver.findElement(By.className("header-logo")));
            highlight(driver, driver.findElement(By.linkText("Forgot password?")));
            highlight(driver, driver.findElement(By.partialLinkText("Create an")));
            highlight(driver, driver.findElement(By.tagName("h1")));
        }

        public static void highlight(WebDriver driver, WebElement element) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
        }
    }



