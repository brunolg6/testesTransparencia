import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import auxiliares.DriverFactory;
import auxiliares.Funcoes;

public class Teste {

	WebDriver chromeDriver = DriverFactory.getDriver("chrome");
	// WebDriver firefoxDriver = DriverFactory.getDriver("firefox");

	@Test
	public void teste1() {

		this.chromeDriver.get("https://noticias.ufsc.br/2019/10/ufsc-na-midia-protese-desenvolvida-na-engenharia-mecanica-beneficia-pacientes-que-perderam-a-laringe/");

		boolean imagemEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='content clearfix']//img");
		boolean videoEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='content clearfix']//iframe");

		Assert.assertTrue(imagemEstaVisivel || videoEstaVisivel);
	}

}
