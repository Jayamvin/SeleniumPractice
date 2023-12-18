package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("justAnInputBox")).click();
		
		//45 spans --> 15 spans
		
		// //div[@id='comboTree758964DropDownContainer']
		
		// //div[@id='comboTree872487InputWrapper']/following-sibling::div//span
	
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		Thread.sleep(2000);
		
		//single selection-- multiple selection and all selection
		//look at the MultiselectDropdownhandling
		List<WebElement> choicesList = driver.findElements(By.xpath("//input[@id='justAnInputBox']/parent::div/following-sibling::div//span"));
		
		for(WebElement e : choicesList) {
			
			String text = e.getText();		
			System.out.println(text);
			
				if(text.contains("choice")) {
					e.click();
				
				}
//		
//	write down for select all choices 	
//		List<WebElement> choicesList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
//		
//		for(WebElement e : choicesList) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.contains("choice 2")) {
//					e.click();
//					break;
//				}
			
		}

		
	}
}



