package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "./driverrr/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devcounselor.qspiders.com");
        driver.findElement(By.name("login")).sendKeys("counselor@qspiders.com");
        driver.findElement(By.name("password")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        Thread.sleep(1000);

		   
		   
	   }
	   
   
 
	}

}
