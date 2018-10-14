// Youtube

package twelth_class;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Elements {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		List <WebElement> ls1 = driver.findElements(By.id("video-title"));
		
		System.out.println(ls1.size());
		
		/*ls1.get(0).click();*/
		
		for (int i=0; i<2; i++)
		{
			ls1.get(i).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			ls1 = driver.findElements(By.id("video-title"));
		}
			
		
	}
}