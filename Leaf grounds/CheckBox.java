package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//a/span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//div[@class='grid formgrid']//div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[2]//div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']//div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("paris");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']/span")).click();

	}

}
