#language: pt
Funcionalidade: Transparencia de software em sites de organizacoes publicas
  Eu, como um estudante universitario
  Quero ter acesso a informacoes transparentes em sites governamentais
  Entao eu estarei seguro de que as informacoes prestadas por estes sites são acessiveis, de qualidade e de facil entendimento e usabilidade aos interessados

  Cenario: Acesso ao site "http://www.sectur.ma.gov.br/" atraves de diferentes navegadores web
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "/" do site "http://www.sectur.ma.gov.br/" utilizando o navegador web Chrome
    E entro na pagina "/" do site "http://www.sectur.ma.gov.br" utilizado o navegador web Firefox
    Entao as informacoes contidas na pagina sao disponibilizadas da mesma forma tanto com Chrome quanto no Firefox

  Cenario: Navegacao no site "https://www.fernao.sp.gov.br" sem utilizar o mouse
    Dado que eu estou utilizando um computador sem mouse
    Quando eu acesso a pagina "/" do site "https://www.fernao.sp.gov.br" utilizando o navegador web Chrome
    E eu interajo utilizando apenas as teclas TAB e ENTER do teclado
    Entao eu consigo acessar a pagina de contato do site

  Cenario: Pagina de noticias ilustrada com imagens ou videos
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "noticias/?noticia=25" do site "http://desterrodeentrerios.mg.gov.br/" utilizando o navegador web Chrome
    Entao a pagina deve apresentar ao menos uma imagem ou videos para ilustrar a informacao

  Esquema do Cenario: Ferramenta de busca presente em todas as paginas
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina <pagina> do site "https://alterosa.mg.gov.br/" utilizando o navegador web Chrome
    Entao todas as paginas devem apresentar a ferramenta de busca do site

    Exemplos: 
      | pagina           |
      | "prefeito/"      |
      | "vice-prefeito/" |
      | "gabinete/"      |
      | "controladoria/" |
      | "procuradoria/"  |
      | "tesouraria/"    |
      | "conselhos/"     |
      | "contato/"       |
      | "sec-educacao/"  |
      | "sec-saude/"     |

  Cenario: Informacoes que orientem no preenchimento de formularios
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "debito/Web/Debito/CalculoDeDebito.faces" do site "https://contas.tcu.gov.br/" utilizando o navegador web Chrome
    Entao a pagina deve conter informacoes que orientem preenchimento de seu formulario corretamente

  Cenario: Existencia do mapa do site
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina inicial do site "https://www.trabiju.sp.gov.br/" utilizando o navegador web Chrome
    Entao deve haver um link para o mapa do site na pagina

  Cenario: Servico essencial destacado na pagina inicial do site
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina inicial do site "https://www.tjrs.jus.br" utilizando o navegador web Chrome
    Entao a pagina deve conter um link destacado para o servico "Acompanhamento Processual"

  Cenario: Indicacao de campos obrigatorios ou opcionais
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina "debito/Web/Debito/CalculoDeDebito.faces" do site "https://contas.tcu.gov.br/" utilizando o navegador web Chrome
    E submeto o formulario sem o preenchimento dos campos
    Entao a pagina deve informar quais campos obrigatorios devem ser preenchidos
