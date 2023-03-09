package AbsoluteXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class trialdiffbrowser {
	static WebDriver driver;
	
	public static void T1() throws Throwable {
      driver=new EdgeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().fullscreen();
      driver.findElement(By.id("email")).sendKeys("kamatchi_rajarun@yahoo.co.in");
      driver.findElement(By.id("pass")).sendKeys("butterfly1979");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@value='1']")).click();
      //driver.close();
	}
	
	public static void T2() throws Throwable {
		driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	      driver.manage().window().fullscreen();
	      driver.findElement(By.id("email")).sendKeys("kamatchi_rajarun@yahoo.co.in");
	      driver.findElement(By.id("pass")).sendKeys("butterfly1979");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//button[@value='1']")).click();
	     // driver.close();
	}
	
public static void main(String[] args) throws Throwable {
	T1();
	T2();
}
}
