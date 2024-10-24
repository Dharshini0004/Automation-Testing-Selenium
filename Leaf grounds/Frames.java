package sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node06syyyvwmivu81qlskoy5c4otk7458840.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();

		WebElement frameNest1 = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(frameNest1);
		WebElement frameNest2 = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		driver.switchTo().frame(frameNest2);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(frame3);
		String text = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();

		List<WebElement> frameCount = driver.findElements(By.xpath("//iframe"));
		System.out.println("Number of Frames:" + frameCount.size());

	}
}
