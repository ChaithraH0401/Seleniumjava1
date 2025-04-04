package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/r.php?entry_point=login");
	 driver.findElement(By.name("firstname")).click();
	 driver.findElement(By.name("lastname")).click();
	 driver.quit();
	 
	}

}
