package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//svg graph elements we cannot use cssselector only special xpath see below -- normal xpath doesn't work 

public class SVGGraphElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");

		Thread.sleep(5000);

		// Browser --page -- iframe -- svg

		String stateXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
		// 51

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		List<WebElement> statesList = driver.findElements(By.xpath(stateXpath));

		System.out.println(statesList.size());

		Actions act = new Actions(driver);
		for (WebElement e : statesList) {
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String idVal = e.getAttribute("id");
			System.out.println(idVal);
			if (idVal.contains("california")) {
				e.click();
				break;
			}
		}
			String countypath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='california']//*[name()='g' and @class ='subregion']//*[name()='path']";

//			driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='forecast-map-container']//iframe")));

			List<WebElement> countyList = driver.findElements(By.xpath(countypath));

			System.out.println(countyList.size());

			Actions act1 = new Actions(driver);

			for (WebElement e1 : countyList) {
				act1.moveToElement(e1).perform();
				Thread.sleep(500);
				String countyName = e1.getAttribute("name");
				System.out.println(countyName);
//				if (countyName.contains("SanDiego county")) {
//					e1.click();
//					break;
//				}

//			//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='california']//*[name()='g' and [contsins(@id,'subregion']
//			//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='california']//*[name()='g' and @class ='subregion']
//				//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='california']//*[name()='g' and @class ='subregion']//*[name()='path']
			
		}

	}

}
