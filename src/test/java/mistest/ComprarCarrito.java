package mistest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ComprarCarrito {
	
	WebDriver driver;
	
	
	//Mapeo objetos
	By lnkDress = By.cssSelector("div>ul>li>a[title='Dresses']");
	By lnkCasual = By.linkText("Casual Dresses");
	By lnkCarro = By.xpath("//a[@ title = 'Add to cart']");
	By lnkConfirmar = By.cssSelector("a[class='btn btn-default button button-medium']");
	By lnkImagen = By.xpath("//a[@ title ='Printed Dress']");
	
	
	public void compra() throws InterruptedException{
		
		PrimerTest miPrimerTest = new PrimerTest();
		miPrimerTest.abrirnavegador();
		driver=miPrimerTest.getWebDriver();
		PrimerTest login = new PrimerTest();
		login.hacerLogin(driver);
		
		
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(lnkDress)));

		driver.findElement(lnkDress).click();
		driver.findElement(lnkCasual).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(lnkImagen)).build().perform();
		driver.findElement(lnkCarro).click();
		
		
		
	}
	
	
	public static void main (String [] args) throws InterruptedException{
		ComprarCarrito comprarCarrito =new ComprarCarrito();
		comprarCarrito.compra();
		Thread.sleep (5000);
		//comprarCarrito.driver.close();
		
		
		
	}

}
