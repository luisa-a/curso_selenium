package mistest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ActvidadWinFrameAlert {

	WebDriver driver;

	By lnkWindowTest = By.linkText("Window Open Test");
	By lnkConfirmPage = By.linkText("Confirm Page");
	By btnClickAlertText = By.name("b1");
	By lnkAlertText = By.linkText("Alert Test");

	@Test
	public void Actividad() throws InterruptedException {
		PrimerTest miPrimerTest = new PrimerTest();
		miPrimerTest.abrirnavegador();
		driver = miPrimerTest.getWebDriver();
		driver.get(WindowsExample.URL_SAHI);
		String firstWindow= driver.getWindowHandle();		
		driver.findElement(lnkWindowTest).click();
		// Obtengo las ventanas
		Set<String> allWindows = driver.getWindowHandles();
		// Identifico la segunda ventana
		String seconWindow = (String) allWindows.toArray()[1];
		System.out.println("Esta es la segunda ventana :" + seconWindow);
		// voy a la segunda ventana
		driver.switchTo().window(seconWindow);
		driver.switchTo().frame(0);
		driver.findElement(lnkConfirmPage).click();
		driver.findElement(btnClickAlertText).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
		driver.switchTo().window(firstWindow);
		driver.findElement(lnkAlertText).click();
		driver.findElement(btnClickAlertText).click();
		String alertTextContent = driver.switchTo().alert().getText();
		System.out.println("Este es el texto de la alerta:" + alertTextContent);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		ActvidadWinFrameAlert actividadWFA = new ActvidadWinFrameAlert();
		actividadWFA.Actividad();

	}

}
