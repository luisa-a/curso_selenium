package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	public WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void abrirnavegador(String browser) {

		if ("chrome".equals(browser)) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");

			driver = new ChromeDriver(chromeOptions);

		} else {
			
			System.err.println("El parametro no corresponde al nombre de un navegador");

		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// 1.definir la propiedad del sistema que va a tener el driver
		// 2.crear una instancia de chrome options
		// 3.configurar el navegador
		// 4.preferencias del navegador
		// 5.crear una instancia del navegador para el uso de la clase del
		// driver
		// en los argumentos se definen las opciones de como abrir el navegador

		// NOTA. para trabajar con firefox new FirefoxDriver
		// driver = new FirefoxDriver ();

		// NOTA. para trabajar con IE new InternetExplorerDriver
		// driver = new InternetExplorerDriver ();

	}

	@AfterTest
	public void cerrarNavegador() {

		if (driver != null) {
			driver.quit();
			System.out.println("Se cierra el navegador");
		} else {
			System.out.println("No hay drivers con sesión activa");
		}

	}

}
