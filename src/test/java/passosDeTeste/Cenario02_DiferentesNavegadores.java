package passosDeTeste;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import auxiliares.DriverFactory;
import auxiliares.Funcoes;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Cenario02_DiferentesNavegadores {

	WebDriver chromeDriver;
	WebDriver firefoxDriver;

	@After
	public void after() {
		if (this.chromeDriver != null) {
			this.chromeDriver.quit();
		}
		if (this.firefoxDriver != null) {
			this.firefoxDriver.quit();
		}
	}

	@Dado("^que estou utilizando um computador com sistema operacional Linux$")
	public void que_estou_utilizando_um_computador_com_sistema_operacional_Linux() {
	}

	@Quando("^eu acesso a pagina \"([^\"]*)\" do site \"([^\"]*)\" utilizando o navegador web Chrome$")
	public void eu_acesso_a_pagina_do_site_utilizando_o_navegador_web_Chrome(String pagina, String site) {
		this.chromeDriver = DriverFactory.getDriver("chrome");
		this.chromeDriver.get(site + pagina);
	}

	@Quando("^acesso a pagina \"([^\"]*)\" do site \"([^\"]*)\" utilizado o navegador web Firefox$")
	public void acesso_a_pagina_do_site_utilizado_o_navegador_web_Firefox(String pagina, String site) {
		this.firefoxDriver = DriverFactory.getDriver("firefox");
		this.firefoxDriver.get(site + pagina);
	}

	@Entao("^as informacoes contidas na pagina sao disponibilizadas da mesma forma tanto com Chrome quanto no Firefox$")
	public void as_informacoes_contidas_na_pagina_sao_disponibilizadas_da_mesma_forma_tanto_com_Chrome_quanto_no_Firefox() {
		WebElement logoChrome = this.chromeDriver.findElement(By.id("logo"));
		WebElement logoFirefox = this.firefoxDriver.findElement(By.id("logo"));
		Assert.assertTrue(logoChrome.isDisplayed());
		Assert.assertTrue(logoFirefox.isDisplayed());

		WebElement headerGridChrome = this.chromeDriver.findElement(By.id("header_grid"));
		WebElement headerGridFirefox = this.firefoxDriver.findElement(By.id("header_grid"));
		Assert.assertTrue(headerGridChrome.isDisplayed());
		Assert.assertTrue(headerGridFirefox.isDisplayed());

		WebElement barraBrasilChrome = this.chromeDriver.findElement(By.id("barra-brasil"));
		WebElement barraBrasilFirefox = this.firefoxDriver.findElement(By.id("barra-brasil"));
		Assert.assertTrue(barraBrasilChrome.isDisplayed());
		Assert.assertTrue(barraBrasilFirefox.isDisplayed());

		WebElement sideBarLeftChrome = this.chromeDriver.findElement(By.id("sidebar_left"));
		WebElement sideBarLeftFirefox = this.firefoxDriver.findElement(By.id("sidebar_left"));
		Assert.assertTrue(sideBarLeftChrome.isDisplayed());
		Assert.assertTrue(sideBarLeftFirefox.isDisplayed());

		WebElement sideBarRightChrome = this.chromeDriver.findElement(By.id("sidebar_right"));
		WebElement sideBarRightFirefox = this.firefoxDriver.findElement(By.id("sidebar_right"));
		Assert.assertTrue(sideBarRightChrome.isDisplayed());
		Assert.assertTrue(sideBarRightFirefox.isDisplayed());

		String textoConteudoChrome = this.chromeDriver.findElement(By.xpath("//*[@class='content clearfix']")).getText();
		String textoConteudoFirefox = this.firefoxDriver.findElement(By.xpath("//*[@class='content clearfix']")).getText();
		Assert.assertEquals(textoConteudoChrome, textoConteudoFirefox);

	}

	@Dado("^que eu estou utilizando um computador sem mouse$")
	public void que_eu_estou_utilizando_um_computador_sem_mouse() {
	}

	@Quando("^eu interajo utilizando apenas as teclas TAB e ENTER do teclado$")
	public void eu_interajo_utilizando_apenas_as_teclas_TAB_e_ENTER_do_teclado() throws Exception {
		this.chromeDriver.findElement(By.id("header_grid")).click();
		Funcoes.teclarTab(21);
		Funcoes.teclarEnter();
		Thread.sleep(500);
	}

	@Entao("^eu consigo acessar a pagina de contato do site$")
	public void eu_consigo_acessar_a_pagina_de_contato_do_site() {
		String URL = this.chromeDriver.getCurrentUrl();
		Assert.assertEquals(URL, "https://estrutura.ufsc.br/contatos/");
	}

	@Entao("^a pagina deve apresentar ao menos uma imagem ou videos para ilustrar a informacao$")
	public void a_pagina_deve_apresentar_ao_menos_uma_imagem_ou_videos_para_ilustrar_a_informacao() {
		boolean imagemEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='content clearfix']//img");
		boolean videoEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='content clearfix']//iframe");

		Assert.assertTrue(imagemEstaVisivel || videoEstaVisivel);
	}

}
