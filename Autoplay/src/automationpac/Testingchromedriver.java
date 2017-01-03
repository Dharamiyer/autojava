package automationpac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingchromedriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/dharam/Documents/Seleniumdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
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
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Chrome
        driver.close();
       
        // exit the program explicitly
        System.exit(0);

	}

}
