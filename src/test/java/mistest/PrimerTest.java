package mistest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrimerTest {

	public WebDriver  driver;
	
	//mapear los objetos para hacer login
	//Objetos del login
	By lnkLogin =By.linkText("Sign in"); 
	By txtUser = By.id("email");
	By txtPassword =By.id("passwd");
	By btnsinIn = By.id("SubmitLogin");
	By lnkCount =By.cssSelector("a[title='Log me out']");
	
	public void abrirnavegador(){
		
		//1.definir la propiedad del sistema que va a tener el driver	
		//2.crear una instancia de chrome options
		//3.configurar el navegador
		//4.preferencias del navegador
		//5.crear una instancia del navegador para el uso de la clase del driver
		//en los argumentos se definen  las opciones de como abrir el navegador
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");			
		ChromeOptions chromeOptions = new ChromeOptions();		
		chromeOptions.addArguments("start-maximized");
		
		
		
		driver = new ChromeDriver (chromeOptions);		
		
		//NOTA. para trabajar con firefox new FirefoxDriver
		//driver = new FirefoxDriver ();
		
		//NOTA. para trabajar con IE new InternetExplorerDriver
		//driver = new InternetExplorerDriver ();		
		
		
	}
	public void hacerLogin (WebDriver driver){
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(lnkLogin).click();
		driver.findElement(txtUser).clear();
		driver.findElement(txtUser).sendKeys("luchis1829@hotmail.com ");
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).sendKeys("Luisa0118");
		//driver.findElement(btnsinIn).click();
		//river.findElement(lnkCount).click();
		//driver.quit();
		//System.out.println("Cerré y me voy");
		
	}
	
	public WebDriver getWebDriver(){
		return driver;
		
	}
	
	
	public static void main (String [] args){
		
		PrimerTest primerTest = new PrimerTest ();
		primerTest.abrirnavegador();
		primerTest.hacerLogin(primerTest.getWebDriver());
		
	}
}
