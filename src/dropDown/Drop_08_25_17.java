package dropDown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drop_08_25_17 {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\workspace\\seleniumsetup\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.mortgagecalculator.org");
	}
		@AfterTest
		public void tearDown() {
			driver.quit();
		}
			
		@Test
		public void mortgage() throws Exception {
			driver.findElement(By.name("param[homevalue]")).clear();
			Thread.sleep(5000);
			driver.findElement(By.name("param[homevalue]")).sendKeys("5000000");
			driver.findElement(By.name("param[principal]")).clear();
			driver.findElement(By.name("param[principal]")).sendKeys("4000000");
			driver.findElement(By.id("loanterm")).clear();
			driver.findElement(By.id("loanterm")).sendKeys("15");
			//new Select(driver.findElement(By.name("param[start_month]"))).selectByIndex(8);
			//new Select(driver.findElement(By.name("param[start_month]"))).selectByValue("9");
			new Select(driver.findElement(By.name("param[start_month]"))).selectByVisibleText("Sep");
			


			Thread.sleep(5000);
			

			
		}	
		
	}


