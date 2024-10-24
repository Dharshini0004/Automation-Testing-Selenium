package sample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> allHandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allHandles.get(1));

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

		driver.switchTo().window(allHandles.get(0));

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		allWindows = driver.getWindowHandles();
		allHandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allHandles.get(1));

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2]")).click();

		driver.switchTo().window(allHandles.get(0));

		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		String title = driver.getTitle();
		if (title.contains("View Contact")) {
			System.out.println("Merge successful, and title verified.");
		} else {
			System.out.println("Title verification failed.");
		}

	}

}
