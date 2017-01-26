package automationpac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ndtvTestNg {
  @Test
  public void testNDTV() {
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//		driver = new ChromeDriver( options );
		WebDriver driver = new ChromeDriver(options);
		
	 
		String baseUrl = "http://www.ndtv.com";
	  String expectedTitle = "NDTV: Latest News, India News, Breaking News, Business, Bollywood, Cricket, Videos & Photos";
		String actualTitle = "";
		// launch Chrome and direct it to the Base URL
		driver.get(baseUrl);
		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page witht the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("found title");
		} else {
			System.out.println("failed finding title");
		}
		
		// This is a classic situation to Try waiting..
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notnow")));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("notnow")));
	
//		if(driver.findElement(By.className("notnow")).isDisplayed());
		driver.findElement(By.className("notnow")).click();

		System.out.println("Clicked not now");
		if(driver.findElement(By.id("h_search_menu")).isDisplayed());
		System.out.println("aloha !");

		if(driver.findElement(By.className("n_searchfld")).isEnabled());
		System.out.println("Found class name");

		WebElement search = driver.findElement(By.id("s"));
		search.sendKeys("Narendra modi");
		driver.findElement(By.className("n_searchbtn")).click();
		System.out.println("Search Button Clicked");
		
		
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/dharam/Documents/Driversnstuff/chromedriver");
		
		
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
