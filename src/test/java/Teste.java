import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import auxiliares.DriverFactory;

public class Teste {

	WebDriver chromeDriver = DriverFactory.getDriver("chrome");
	// WebDriver firefoxDriver = DriverFactory.getDriver("firefox");

	@Test
	public void teste1() {

		this.chromeDriver.get("https://www.tjsc.jus.br");

		String descricaoLinks = this.chromeDriver.findElement(By.xpath("//*[@class='fw3-processo-judicial fw3-panel-inverse']")).getText();
		Assert.assertTrue(descricaoLinks.contains("Consulta Processual"));
	}

}
