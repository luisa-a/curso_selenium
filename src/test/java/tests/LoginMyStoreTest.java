package tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import common.BaseTest;
import common.DataPropertiesManagement;
import constantes.ConstantesPruebas;

public class LoginMyStoreTest extends BaseTest {
	
	By lnkLogin = By.linkText("Sign in");
	By txtUser = By.id("email");
	By txtPassword = By.id("passwd");
	By btnLogin = By.id("SubmitLogin");
	By lnkUsuario = By.cssSelector("a[title='View my customer account']");

	@Test
	public void hacerLogin() throws IOException, InterruptedException {
		driver.get(ConstantesPruebas.URL_MY_STORE);
		driver.findElement(lnkLogin).click();
		
		DataPropertiesManagement datosLogin = new DataPropertiesManagement();
		Properties properties = datosLogin.getProperties();
		Thread.sleep(5000);
		
        
		driver.findElement(txtUser).sendKeys(properties.getProperty("user"));
		driver.findElement(txtPassword).sendKeys(properties.getProperty("password"));
		driver.findElement(btnLogin).click();
	}
	
	

}
