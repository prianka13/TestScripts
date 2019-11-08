import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bongoContentLoad {
	WebDriver driver;
	public void pageScroll() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.bongobd.com");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)");
		//Actions action = new Actions(driver);
		//WebElement we = 
		driver.findElement(By.cssSelector("div.hovered> a[href*='/bn/watch?v=p6g3n3ZmNW2']")).click();
		//action.moveToElement(we).build().perform();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bongoContentLoad obj = new bongoContentLoad();
		obj.pageScroll();

	}

}
