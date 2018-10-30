package mistest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistrarTest {
	public WebDriver  driver;
	
	By lnkLogin =By.linkText("Sign in"); 
	By txtUser =By.id("email_create");
	By btncrearCta=By.name("SubmitCreate");
	By rdbEstado=By.id("id_gender1");
	By txtprimerNombre=By.id("customer_firstname");
	By txtsegundoNombre=By.id("customer_lastname");
	By txtEmail=By.id("email");
	By txtPassword=By.id("passwd");
	By lstDias=By.id("days");
	By lstMeses=By.id("months");
	
	
	
	
	
	
	
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
}
		
		public void hacerRegistro (){
			driver.get("http://automationpractice.com/index.php");
			
			
		}
		
		

	
public static void main (String [] args){
	
	RegistrarTest registrarTest = new RegistrarTest ();
	registrarTest.abrirnavegador();
	registrarTest.hacerRegistro();
	
}

}
