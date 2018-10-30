package mistest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsExample {
	
	
	private WebDriver driver;
	public static final String URL_SAHI="http://sahitest.com/demo/";
	By lnkWindowTest=By.linkText("Window Open Test");
	By lnkText = By.linkText("Alert Test");
	
	
	
	public void goToNewWindow() throws InterruptedException{
		PrimerTest miPrimerTest =new PrimerTest();
		 miPrimerTest.abrirnavegador();
		 driver=miPrimerTest.getWebDriver();
		 driver.get(URL_SAHI);
		 //identifico la primera ventana
		 String windowParent =driver.getWindowHandle();
		 System.out.println("Esta es la ventana inicial:"+ windowParent);
		 driver.findElement(lnkWindowTest).click();
	     //Obtengo las ventanas
		 Set<String> allWindows =driver.getWindowHandles();
		 //Identifico la segunda ventana
		 String seconWindow = (String) allWindows.toArray()[1];
		 System.out.println("Esta es la segunda ventana :"+ seconWindow);
		 //voy a la segunda ventana
		 driver.switchTo().window(seconWindow);
		 //Vamos a cerrar la ultima ventana
		 driver.close();
		 driver.switchTo().window(windowParent);
		 driver.findElement(lnkText).click();
		 Thread.sleep(5000);
		 driver.quit();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		 WindowsExample windowsExample = new WindowsExample();
		 windowsExample.goToNewWindow();

	}

}
