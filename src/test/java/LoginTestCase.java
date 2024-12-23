import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase {
    @Test
    public void dummytest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://askomdch.com/");
        driver.manage().window().maximize();
        String exp = "Raining Offers for Hot Summer!";
        String Act = driver.findElement(By.xpath("//h1[text()='Raining Offers for Hot Summer!']")).getText();
        if (Act.equals(exp)) {
            driver.findElement(By.linkText("Account")).click();
            String expert = "Account";
            String actul =driver.findElement(By.tagName("h1")).getText();
            if(actul.equals(expert)){
                driver.findElement(By.xpath("//li[@id='menu-item-1237']/a[text()='Account']")).click();
                Thread.sleep(1000);
                driver.findElement(By.id("username")).sendKeys("ambqa");
                Thread.sleep(1000);
                driver.findElement(By.name("password")).sendKeys("1234");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[@value='Log in']")).click();
                Thread.sleep(6000);
                    Thread.sleep(1000);
        }else{
                System.out.println("miss matched" + Act);
            }
            driver.close();
        }
    }
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://askomdch.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@id='menu-item-1237']/a[text()='Account']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.id("username")).sendKeys("ambqa");
        //Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@value='Log in']")).click();
        Thread.sleep(6000);
        driver.close();
    }
    @Test
    public void loginfun() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://askomdch.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@id='menu-item-1237']/a[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("ambqa");
        Thread.sleep(1000);
//        driver.findElement(By.name("password")).sendKeys("1234");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@value='Log in']")).click();
        Thread.sleep(6000);
        driver.close();
    }
    @Test
    public void userfunalit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://askomdch.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@id='menu-item-1237']/a[text()='Account']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("username")).sendKeys("ambqa");
//        Thread.sleep(1000);
//        driver.findElement(By.name("password")).sendKeys("1234");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@value='Log in']")).click();
        Thread.sleep(6000);
        driver.close();
    }
//    @Test
//    public static void screenshotTest() throws IOException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\IdeaProjects\\MySelenium\\src\\main\\resources\\drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://askomdch.com/account/");
//        driver.manage().window().maximize();
//        WebElement loginButton = driver.findElement(By.name("login"));
//        System.out.println(loginButton.isEnabled());
//        File SourceFile = loginButton.getScreenshotAs(OutputType.FILE);
//        File Destination = new File("C:\\Users\\ADMIN\\IdeaProjects\\MySelenium\\src\\screenshots\\loginButton.jpg");
//        FileUtils.copyFile(SourceFile,Destination);
//        System.out.println("Screenshot Saved");
}
