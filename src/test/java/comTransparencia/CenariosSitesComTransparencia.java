// package comTransparencia;
//
// import org.junit.Assert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
//
// import auxiliares.DriverFactory;
// import auxiliares.Funcoes;
// import cucumber.api.java.After;
// import cucumber.api.java.pt.Dado;
// import cucumber.api.java.pt.Entao;
// import cucumber.api.java.pt.Quando;
//
// public class CenariosSitesComTransparencia {
//
// WebDriver chromeDriver;
// WebDriver firefoxDriver;
//
// @After
// public void after() {
// if (this.chromeDriver != null) {
// this.chromeDriver.quit();
// }
// if (this.firefoxDriver != null) {
// this.firefoxDriver.quit();
// }
// }
//
// @Dado("^que estou utilizando um computador com sistema operacional Linux$")
// public void que_estou_utilizando_um_computador_com_sistema_operacional_Linux() {
// }
//
// @Quando("^eu acesso a pagina \"([^\"]*)\" do site \"([^\"]*)\" utilizando o navegador web Chrome$")
// public void eu_acesso_a_pagina_do_site_utilizando_o_navegador_web_Chrome(String pagina, String site) {
// this.chromeDriver = DriverFactory.getDriver("chrome");
// this.chromeDriver.get(site + pagina);
// }
//
// @Quando("^entro na pagina \"([^\"]*)\" do site \"([^\"]*)\" utilizado o navegador web Firefox$")
// public void acesso_a_pagina_do_site_utilizado_o_navegador_web_Firefox(String pagina, String site) {
// this.firefoxDriver = DriverFactory.getDriver("firefox");
// this.firefoxDriver.get(site + pagina);
// }
//
// @Entao("^as informacoes contidas na pagina sao disponibilizadas da mesma forma tanto com Chrome quanto no Firefox$")
// public void as_informacoes_contidas_na_pagina_sao_disponibilizadas_da_mesma_forma_tanto_com_Chrome_quanto_no_Firefox() {
// WebElement logoChrome = this.chromeDriver.findElement(By.id("logo"));
// WebElement logoFirefox = this.firefoxDriver.findElement(By.id("logo"));
// Assert.assertTrue(logoChrome.isDisplayed());
// Assert.assertTrue(logoFirefox.isDisplayed());
//
// WebElement headerGridChrome = this.chromeDriver.findElement(By.id("header_grid"));
// WebElement headerGridFirefox = this.firefoxDriver.findElement(By.id("header_grid"));
// Assert.assertTrue(headerGridChrome.isDisplayed());
// Assert.assertTrue(headerGridFirefox.isDisplayed());
//
// WebElement barraBrasilChrome = this.chromeDriver.findElement(By.id("barra-brasil"));
// WebElement barraBrasilFirefox = this.firefoxDriver.findElement(By.id("barra-brasil"));
// Assert.assertTrue(barraBrasilChrome.isDisplayed());
// Assert.assertTrue(barraBrasilFirefox.isDisplayed());
//
// WebElement sideBarLeftChrome = this.chromeDriver.findElement(By.id("sidebar_left"));
// WebElement sideBarLeftFirefox = this.firefoxDriver.findElement(By.id("sidebar_left"));
// Assert.assertTrue(sideBarLeftChrome.isDisplayed());
// Assert.assertTrue(sideBarLeftFirefox.isDisplayed());
//
// WebElement sideBarRightChrome = this.chromeDriver.findElement(By.id("sidebar_right"));
// WebElement sideBarRightFirefox = this.firefoxDriver.findElement(By.id("sidebar_right"));
// Assert.assertTrue(sideBarRightChrome.isDisplayed());
// Assert.assertTrue(sideBarRightFirefox.isDisplayed());
//
// String textoConteudoChrome = this.chromeDriver.findElement(By.xpath("//*[@class='content clearfix']")).getText();
// String textoConteudoFirefox = this.firefoxDriver.findElement(By.xpath("//*[@class='content clearfix']")).getText();
// Assert.assertEquals(textoConteudoChrome, textoConteudoFirefox);
//
// }
//
// @Dado("^que eu estou utilizando um computador sem mouse$")
// public void que_eu_estou_utilizando_um_computador_sem_mouse() {
// }
//
// @Quando("^eu interajo utilizando apenas as teclas TAB e ENTER do teclado$")
// public void eu_interajo_utilizando_apenas_as_teclas_TAB_e_ENTER_do_teclado() throws Exception {
// this.chromeDriver.findElement(By.id("header_grid")).click();
// Funcoes.teclarTab(21);
// Funcoes.teclarEnter();
// Thread.sleep(500);
// }
//
// @Entao("^eu consigo acessar a pagina de contato do site$")
// public void eu_consigo_acessar_a_pagina_de_contato_do_site() {
// String URL = this.chromeDriver.getCurrentUrl();
// Assert.assertEquals(URL, "https://estrutura.ufsc.br/contatos/");
// }
//
// @Entao("^a pagina deve apresentar ao menos uma imagem ou videos para ilustrar a informacao$")
// public void a_pagina_deve_apresentar_ao_menos_uma_imagem_ou_videos_para_ilustrar_a_informacao() {
// boolean imagemEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='content clearfix']//img[@height>50]");
// boolean videoEstaVisivel = Funcoes.estaVisivel(this.chromeDriver, "//*[@class='content clearfix']//iframe");
//
// Assert.assertTrue(imagemEstaVisivel || videoEstaVisivel);
// }
//
// @Quando("^acesso a pagina (.*)$")
// public void acesso_a_pagina(String pagina) {
// this.chromeDriver.get(pagina);
// }
//
// @Entao("^todas as paginas devem apresentar a ferramenta de busca do site$")
// public void todas_as_paginas_devem_apresentar_a_ferramenta_de_busca_do_site() {
// boolean contemTextoBusque = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Busque')]");
// boolean contemTextoBusca = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Busca')]");
// boolean contemTextoBuscar = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Buscar')]");
// boolean contemTextoPesquise = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Pesquise')]");
// boolean contemTextoPesquisa = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Pesquisa')]");
// boolean contemTextoPesquisar = Funcoes.estaVisivel(this.chromeDriver, "/html/body//*[contains(text(),'Pesquisar')]");
//
// Assert.assertTrue(contemTextoBusque || contemTextoBusca || contemTextoBuscar
// || contemTextoPesquise || contemTextoPesquisa || contemTextoPesquisar);
// }
//
// @Entao("^a pagina deve conter informacoes que orientem preenchimento de seu formulario corretamente$")
// public void a_pagina_deve_conter_informacoes_que_orientem_preenchimento_de_seu_formulario_corretamente() throws Exception {
// Funcoes.moverMouse(this.chromeDriver, "//*[@id='frm']/table[1]/tbody/tr/td[1]/a[2]");
// Thread.sleep(200);
// boolean ajudaUnidadeGestoraEstaVisivel = this.chromeDriver.findElement(By.id("apoio-ug")).isDisplayed();
// Assert.assertTrue(ajudaUnidadeGestoraEstaVisivel);
//
// Funcoes.moverMouse(this.chromeDriver, "//*[@id='frm']/table[2]/tbody/tr/td[1]/a[2]");
// Thread.sleep(200);
// boolean ajudaGestaoEstaVisivel = this.chromeDriver.findElement(By.id("apoio-gestao")).isDisplayed();
// Assert.assertTrue(ajudaGestaoEstaVisivel);
//
// Funcoes.moverMouse(this.chromeDriver, "//*[@id='frm']/table[4]/tbody/tr/td[1]/a[2]");
// Thread.sleep(200);
// boolean ajudaRecolhimentoEstaVisivel = this.chromeDriver.findElement(By.id("apoio-recolhimento")).isDisplayed();
// Assert.assertTrue(ajudaRecolhimentoEstaVisivel);
// }
//
// @Quando("^eu acesso a pagina inicial do site \"([^\"]*)\" utilizando o navegador web Chrome$")
// public void eu_acesso_a_pagina_inicial_do_site_utilizando_o_navegador_web_Chrome(String site) {
// this.chromeDriver = DriverFactory.getDriver("chrome");
// this.chromeDriver.get(site);
// }
//
// @Entao("^deve haver um link para o mapa do site na pagina$")
// public void deve_haver_um_link_para_o_mapa_do_site_na_pagina() {
// this.chromeDriver.findElement(By.xpath("/html/body//*[contains(text(),'Mapa do site') or contains(text(),'Mapa do Site') or contains(text(),'MAPA DO SITE')]")).click();
// String descricaoLinks = this.chromeDriver.findElement(By.xpath("//*[@class='content clearfix']")).getText();
// Assert.assertTrue(descricaoLinks.contains("Apresentação"));
// Assert.assertTrue(descricaoLinks.contains("Serviços gratuitos"));
// Assert.assertTrue(descricaoLinks.contains("Graduação"));
// Assert.assertTrue(descricaoLinks.contains("Editora"));
// Assert.assertTrue(descricaoLinks.contains("Instagram"));
// }
//
// @Entao("^a pagina deve conter um link destacado para o servico \"([^\"]*)\"")
// public void a_pagina_deve_conter_um_link_destacado_para_o_servico(String servico) {
// boolean servicoEstaVisivel = this.chromeDriver.findElement(By.xpath("/html/body//*[contains(text(),'" + servico + "')]")).isDisplayed();
// Assert.assertTrue(servicoEstaVisivel);
// }
//
// @Quando("^submeto o formulario sem o preenchimento dos campos$")
// public void submeto_o_formulario_sem_o_preenchimento_dos_campos() throws Exception {
// this.chromeDriver.findElement(By.xpath("//*[@class='Validate_Required ']")).click();
// this.chromeDriver.findElement(By.xpath("//*[@id='ServiceID']/option[4]")).click();
// this.chromeDriver.findElement(By.xpath("//*[@class='Validate_Required ']")).click();
// Thread.sleep(1000);
// this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[2]/button")).click();
// Thread.sleep(1000);
// }
//
// @Entao("^a pagina deve informar quais campos obrigatorios devem ser preenchidos$")
// public void a_pagina_deve_informar_quais_campos_obrigatorios_devem_ser_preenchidos() {
// String mensagemCampoUnidade = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[2]/div/div[1]")).getText();
// String mensagemCampoNome = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[3]/div/div")).getText();
// String mensagemCampoEmail = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[4]/div/div[1]")).getText();
// String mensagemCampoLocal = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[5]/div/div")).getText();
// String mensagemCampoTelefone = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[6]/div/div")).getText();
// String mensagemCampoMotivo = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[7]/div/div[1]")).getText();
// String mensagemCampoAssunto = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[8]/div/div")).getText();
// String mensagemCampoDescricao = this.chromeDriver.findElement(By.xpath("//*[@id='alpaca2']/div[1]/div/div[9]/div/div")).getText();
//
// String esteCampoEhObrigatorio = "Este campo é obrigatório.";
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoUnidade);
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoNome);
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoEmail);
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoLocal);
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoTelefone);
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoMotivo);
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoAssunto);
// Assert.assertEquals(esteCampoEhObrigatorio, mensagemCampoDescricao);
//
// }
//
// }
