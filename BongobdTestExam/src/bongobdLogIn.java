import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bongobdLogIn {
	WebDriver driver;
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http:www.bongobd.com/en");
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Log In")).click();
		
		
	}
	public void logIn() {
		driver.findElement(By.cssSelector("ul> li > a[href*='/en/login?type=login']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='regNext']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
//		System.out.println(childId);
		driver.findElement(By.id("u_0_6q")).sendKeys("01705870398");
		driver.findElement(By.id("u_0_6r")).click();
		driver.findElement(By.id("u_0_2")).sendKeys("479113");
		driver.findElement(By.id("u_0_3")).click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bongobdLogIn obj = new bongobdLogIn();
		obj.invokeBrowser();
		obj.logIn();
	}

}
