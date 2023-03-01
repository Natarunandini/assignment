package week3.ss.day2;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		 String text=driver.findElement(By.xpath("//div[@class='length']")).getText();
         System.out.println(" text");
         Thread.sleep(2000) ;
          
         List<WebElement> brand = driver.findElements(By.xpath(("//div[@class='brand']")));
         
      List<WebElement> name = driver.findElements(By.xpath(("//div[@class='nameCls']")));
      for(int i=0;i<brand.size();i++) {
                 System.out.println(" brand:" + brand.get(i).getText());
                 System.out.println(" name:" +name.get(i).getText());
                         System.out.println(" ");    
		
		
		
		
		
		
		
                 }	
		
		
	}

}
