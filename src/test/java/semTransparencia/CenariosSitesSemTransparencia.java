package semTransparencia;

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

public class CenariosSitesSemTransparencia {

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

	@Quando("^entro na pagina \"([^\"]*)\" do site \"([^\"]*)\" utilizado o navegador web Firefox$")
	public void acesso_a_pagina_do_site_utilizado_o_navegador_web_Firefox(String pagina, String site) {
		this.firefoxDriver = DriverFactory.getDriver("firefox");
		this.firefoxDriver.get(site + pagina);
	}

	@Entao("^as informacoes contidas na pagina sao disponibilizadas da mesma forma tanto com Chrome quanto no Firefox$")
	public void as_informacoes_contidas_na_pagina_sao_disponibilizadas_da_mesma_forma_tanto_com_Chrome_quanto_no_Firefox() {
		WebElement logoChrome = this.chromeDriver.findElement(By.id("/html/body/div[4]/div[2]/div[3]/div[1]/div"));
		WebElement logoFirefox = this.firefoxDriver.findElement(By.id("/html/body/div[4]/div[2]/div[3]/div[1]/div"));
		Assert.assertTrue(logoChrome.isDisplayed());
		Assert.assertTrue(logoFirefox.isDisplayed());

	}

	@Dado("^que eu estou utilizando um computador sem mouse$")
	public void que_eu_estou_utilizando_um_computador_sem_mouse() {
	}

	@Quando("^eu interajo utilizando apenas as teclas TAB e ENTER do teclado$")
	public void eu_interajo_utilizando_apenas_as_teclas_TAB_e_ENTER_do_teclado() throws Exception {
		Funcoes.teclarTab(80);
		Thread.sleep(500);
		Funcoes.teclarEnter();
		Thread.sleep(500);
	}

	@Entao("^eu consigo acessar a pagina de contato do site$")
	public void eu_consigo_acessar_a_pagina_de_contato_do_site() {
		String URL = this.chromeDriver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.fernao.sp.gov.br/fale-conosco/");
	}

	@Entao("^a pagina deve apresentar ao menos uma imagem ou videos para ilustrar a informacao$")
	public void a_pagina_deve_apresentar_ao_menos_uma_imagem_ou_videos_para_ilustrar_a_informacao() {
		boolean imagemEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='paragraph-padding']//img[@height>50]");
		boolean videoEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='paragraph-padding']//iframe");

		Assert.assertTrue(imagemEstaVisivel || videoEstaVisivel);
	}

	@Entao("^todas as paginas devem apresentar a ferramenta de busca do site$")
	public void todas_as_paginas_devem_apresentar_a_ferramenta_de_busca_do_site() {
		boolean contemTextoBusque = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Busque')]");
		boolean contemTextoBusca = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Busca')]");
		boolean contemTextoBuscar = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Buscar')]");
		boolean contemTextoPesquise = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Pesquise')]");
		boolean contemTextoPesquisa = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Pesquisa')]");
		boolean contemTextoPesquisar = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Pesquisar')]");

		Assert.assertTrue(contemTextoBusque || contemTextoBusca || contemTextoBuscar
				|| contemTextoPesquise || contemTextoPesquisa || contemTextoPesquisar);
	}

	@Quando("^eu acesso a pagina inicial do site \"([^\"]*)\" utilizando o navegador web Chrome$")
	public void eu_acesso_a_pagina_inicial_do_site_utilizando_o_navegador_web_Chrome(String site) {
		this.chromeDriver = DriverFactory.getDriver("chrome");
		this.chromeDriver.get(site);
	}

	@Entao("^deve haver um link para o mapa do site na pagina$")
	public void deve_haver_um_link_para_o_mapa_do_site_na_pagina() {
		this.chromeDriver.findElement(By.xpath("/html/body//*[contains(text(),'Mapa do site') or contains(text(),'Mapa do Site') or contains(text(),'MAPA DO SITE')]")).click();
		String descricaoLinks = this.chromeDriver.findElement(By.xpath("//*[@class='content clearfix']")).getText();
		Assert.assertTrue(descricaoLinks.contains("Cursos"));
		Assert.assertTrue(descricaoLinks.contains("Leilões"));
		Assert.assertTrue(descricaoLinks.contains("Pregões"));
		Assert.assertTrue(descricaoLinks.contains("Contratos"));
		Assert.assertTrue(descricaoLinks.contains("Leis"));
	}

	@Entao("^a pagina deve conter um link destacado para o servico \"([^\"]*)\"")
	public void a_pagina_deve_conter_um_link_destacado_para_o_servico(String servico) {
		boolean servicoEstaVisivel = this.chromeDriver.findElement(By.xpath("/html/body//*[contains(text(),'" + servico + "')]/..")).isDisplayed();
		Assert.assertTrue(servicoEstaVisivel);
	}

}
