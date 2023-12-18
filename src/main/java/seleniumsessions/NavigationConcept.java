package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	
		public static void main(String[] args) throws MalformedURLException {

			WebDriver driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/");
			
			System.out.println(driver.getTitle());
			
			// to method and get method both are same to method internally calling get method 
			
			driver.navigate().to("https://www.google.com/");
			
			System.out.println(driver.getTitle());

			driver.navigate().back();
			
			System.out.println(driver.getTitle());

			driver.navigate().forward();
			
			System.out.println(driver.getTitle());

			driver.navigate().back();
			
			System.out.println(driver.getTitle());	
			
			
			//driver.navigate().to("https://naveenautomationlabs.com/opencart/");
			driver.navigate().to(new URL("https://naveenautomationlabs.com/opencart/"));
			
			driver.navigate().refresh();//refresh the page
			
			
			
			
			
		

	}

}
