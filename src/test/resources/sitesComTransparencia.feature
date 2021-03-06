#language: pt
Funcionalidade: Transparencia de software em sites de organizacoes publicas
  Eu, como um estudante universitario
  Quero ter acesso a informacoes transparentes em sites governamentais
  Entao eu estarei seguro de que as informacoes prestadas por estes sites são acessiveis, de qualidade e de facil entendimento e usabilidade aos interessados

  Cenario: Acesso ao site "https://estrutura.ufsc.br/" atraves de diferentes navegadores web
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "servicos-gratuitos/" do site "https://estrutura.ufsc.br/" utilizando o navegador web Chrome
    E entro na pagina "servicos-gratuitos/" do site "https://estrutura.ufsc.br/" utilizado o navegador web Firefox
    Entao as informacoes contidas na pagina sao disponibilizadas da mesma forma tanto com Chrome quanto no Firefox

  Cenario: Navegacao no site "https://ufsc.br/" sem utilizar o mouse
    Dado que eu estou utilizando um computador sem mouse
    Quando eu acesso a pagina "mapa-do-site/" do site "https://ufsc.br/" utilizando o navegador web Chrome
    E eu interajo utilizando apenas as teclas TAB e ENTER do teclado
    Entao eu consigo acessar a pagina de contato do site

  Cenario: Pagina de noticias ilustrada com imagens ou videos
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "2019/10/pesquisa-da-ufsc-revela-nova-perspectiva-para-diagnostico-e-tratamento-da-tuberculose/" do site "https://noticias.ufsc.br/" utilizando o navegador web Chrome
    Entao a pagina deve apresentar ao menos uma imagem ou videos para ilustrar a informacao

  Esquema do Cenario: Ferramenta de busca presente em todas as paginas
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina <pagina> do site "https://www.tjsc.jus.br/" utilizando o navegador web Chrome
    Entao todas as paginas devem apresentar a ferramenta de busca do site

    Exemplos: 
      | pagina                  |
      | "web/academia-judicial" |
      | "composicao"            |
      | "documentacao"          |
      | "estrutura-judiciaria"  |
      | "eventos"               |
      | "museu"                 |
      | "diretorias"            |
      | "presidencia"           |
      | "circunscricoes"        |
      | "missao-e-visao"        |

  Cenario: Informacoes que orientem no preenchimento de formularios
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "gru_novosite/gru_simples.asp" do site "http://consulta.tesouro.fazenda.gov.br/" utilizando o navegador web Chrome
    Entao a pagina deve conter informacoes que orientem preenchimento de seu formulario corretamente

  Cenario: Existencia do mapa do site
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina inicial do site "https://ufsc.br/" utilizando o navegador web Chrome
    Entao deve haver um link para o mapa do site na pagina

  Cenario: Servico essencial destacado na pagina inicial do site
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina inicial do site "https://www.tjsc.jus.br" utilizando o navegador web Chrome
    Entao a pagina deve conter um link destacado para o servico "Consulta Processual"

  Cenario: Indicacao de campos obrigatorios ou opcionais
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "otrs/public.pl?Action=NewTicketWizardPublic" do site "https://otrs.setic.ufsc.br/" utilizando o navegador web Chrome
    E submeto o formulario sem o preenchimento dos campos
    Entao a pagina deve informar quais campos obrigatorios devem ser preenchidos
