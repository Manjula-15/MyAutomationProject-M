import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase {
   public WebDriver driver;
    public void BrowserInti(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    @Test
    public void dummytest() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://askomdch.com/");
//        driver.manage().window().maximize();
        BrowserInti("https://askomdch.com/");
        String expectedName = "AskOmDch";
        String ActualName = driver.findElement(By.linkText("AskOmDch")).getText();
        if (ActualName.equals(expectedName)) {
            System.out.println("Validated" + ActualName);
        } else {
            System.out.println("not Validated" + ActualName);
        }
        String exp = "Raining Offers for Hot Summer!";
        String Act = driver.findElement(By.xpath("//h1[text()='Raining Offers for Hot Summer!']")).getText();
        if (Act.equals(exp)) {
            System.out.println("matched" + Act);
        } else {
            System.out.println("miss matched" + Act);
        }
        driver.close();
    }
    @Test
    public void Select() {
        BrowserInti("https://www.google.com/");
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




