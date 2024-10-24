package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public final class CreateLead {

	public static void main(String[] args) {	
		EdgeDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QEAGLE");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dharshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Dharshini18042004@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8838131781");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("dhiviya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("12 A ");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Salem");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("606 202");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title= driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println("Title is verified");
		}
		else {
			System.out.println("Title is not verified");
		}
	}

}
