import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class DropDown {
     @Test
     public void Dropdown() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\IdeaProjects\\MySeleniumProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");

         WebElement country= driver.findElement(By.id("country"));
         Select countrydropdown=new Select(country);
         String expectedName = "India";
         String ActualName = countrydropdown.getFirstSelectedOption().getText();
         if(ActualName.equals(expectedName)){
         Thread.sleep(1000);
         countrydropdown.selectByIndex(1);
         WebElement monthElement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
         Select monthdropdown=new Select(monthElement);
         monthdropdown.selectByIndex(3);
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@value='f']")).click();
         Thread.sleep(1000);

     }else{
             System.out.println("invalis"+ActualName);
         }
     }
 }

