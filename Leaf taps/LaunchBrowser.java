package sample;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Title is verfied");
		} else {
			System.out.println("Title is not verfied");
		}
		driver.close();
	}
}