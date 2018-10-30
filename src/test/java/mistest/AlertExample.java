package mistest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertExample {

	WebDriver driver;

	// Elementos de page sahidemo
	By lnkAlertText = By.linkText("Alert Test");
	By btnClickAlertText = By.name("b1");
	By lnkConfirmPage = By.linkText("Confirm Page");
	By lnkPromptPage = By.linkText("Prompt Page");

	/**
	 * @author Ing Luisa Método que da clic en la opción aceptar de una alerta
	 * @throws InterruptedException:
	 *             Esta excepción de lanza si se interrumpe el .sleep
	 */
	public void alertAccept() throws InterruptedException {

		PrimerTest miPrimerTest = new PrimerTest();
		miPrimerTest.abrirnavegador();
		driver = miPrimerTest.getWebDriver();
		driver.get(WindowsExample.URL_SAHI);
		driver.findElement(lnkAlertText).click();
		driver.findElement(btnClickAlertText).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.quit();
	}

	/**
	 * @author Ing Luisa Método que obtiene el texto de una alerta
	 * @throws InterruptedException
	 */
	public void getalertText() throws InterruptedException {

		PrimerTest miPrimerTest = new PrimerTest();
		miPrimerTest.abrirnavegador();
		driver = miPrimerTest.getWebDriver();
		driver.get(WindowsExample.URL_SAHI);
		driver.findElement(lnkAlertText).click();
		driver.findElement(btnClickAlertText).click();
		Thread.sleep(3000);
		String alertTextContent = driver.switchTo().alert().getText();
		System.out.println("Este es el texto de la alerta:" + alertTextContent);
		driver.switchTo().alert().accept();
		driver.quit();
	}

	/**
	 * @author Ing Luisa Método que da clic en la opción cancelar de una alerta
	 * @throws InterruptedException
	 */
	public void alertDissmis() throws InterruptedException {

		PrimerTest miPrimerTest = new PrimerTest();
		miPrimerTest.abrirnavegador();
		driver = miPrimerTest.getWebDriver();
		driver.get(WindowsExample.URL_SAHI);
		driver.findElement(lnkConfirmPage).click();
		driver.findElement(btnClickAlertText).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.quit();
	}

	/**
	 * @author Ing Luisa
	 * Método ingresar información en una alerta
	 * @throws InterruptedException
	 */
	public void SendAlertText() throws InterruptedException {

		PrimerTest miPrimerTest = new PrimerTest();
		miPrimerTest.abrirnavegador();
		driver = miPrimerTest.getWebDriver();
		driver.get(WindowsExample.URL_SAHI);
		driver.findElement(lnkPromptPage).click();
		driver.findElement(btnClickAlertText).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Yo soy las más");
		
		//driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		AlertExample alertexample = new AlertExample();
		alertexample.SendAlertText();
		System.out.println("ingrese el dato");

	}

}
