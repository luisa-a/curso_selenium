package mistest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesExample {

	private WebDriver driver;
	By lnkFrame = By.linkText("Frames Test");
	By lnkBreakFrame = By.linkText("Break Frames");
	

	public void goToFrame() throws InterruptedException {

		PrimerTest miPrimerTest = new PrimerTest();
		miPrimerTest.abrirnavegador();
		driver = miPrimerTest.getWebDriver();
		driver.get(WindowsExample.URL_SAHI);
		driver.findElement(lnkFrame).click();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		driver.findElement(lnkBreakFrame).click();
		Thread.sleep(5000);
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		FramesExample frameExample =new FramesExample();
		frameExample.goToFrame();

	}

}
