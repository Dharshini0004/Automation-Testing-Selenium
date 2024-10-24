package test1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesForceDelete {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		WebElement click = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", click);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"))
				.sendKeys("Salesforce Automation by Dharshini");

		Thread.sleep(5000);
		WebElement element = driver.findElement(
				By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button']"));
		driver.executeScript("arguments[0].click();", element);
		Thread.sleep(9000);
		WebElement delete = driver.findElement(By.xpath("//a[@title='Delete']/div"));
		driver.executeScript("arguments[0].click();", delete);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		Thread.sleep(1000);

		WebElement OpportunityFound = driver.findElement(By.xpath("//a[text()='Salesforce Automation by Dharshini']"));
		String text = OpportunityFound.getText();
		if (text.equals("Salesforce Automation by Dharshini")) {
			System.out.println("Opportunity is Found");
		} else {
			System.out.println("Opportunity is deleted");
		}

	}

}
