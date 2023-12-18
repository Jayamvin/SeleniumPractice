package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");

		driver.switchTo().frame(0);

		Thread.sleep(4000);

		driver.findElement(By.cssSelector("span#speed-button")).click();
		Thread.sleep(2000);

		// By.xpath("//ul[@class='ui-menu ui-corner-bottom ui-widget
		// ui-widget-content']/li)[4]")

		driver.findElement(By.xpath("(//ul[@class='ui-menu ui-corner-bottom ui-widget ui-widget-content']/li)[4]"))
				.click();

		System.out.println("vin");

//		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul#speed-menu div"));
//		
//		System.out.println(optionsList.size());
//		
//		for(WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.equals("Fast")) {
//					e.click();
//					break;
//				}

		driver.findElement(By.cssSelector("span#files-button")).click();
		Thread.sleep(2000);

		List<WebElement> optionsList2 = driver.findElements(By.cssSelector("ul#files-menu div"));
		System.out.println(optionsList2.size());

		for (WebElement e : optionsList2) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("ui.jQuery.js")) {
				e.click();
				break;

			}

		}

		driver.findElement(By.cssSelector("span#number-button")).click();
		Thread.sleep(2000);

		List<WebElement> optionsList3 = driver.findElements(By.cssSelector("ul#number-menu div"));
		System.out.println(optionsList3.size());

		for (WebElement e : optionsList3) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("6")) {
				e.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("span#salutation-button")).click();
		Thread.sleep(2000);

		List<WebElement> optionsList4 = driver.findElements(By.cssSelector("ul#salutation-menu div"));
		System.out.println(optionsList4.size());

		for (WebElement e : optionsList4) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Mrs.")) {
				e.click();
				break;
			}
		}
		
		

	}
}
