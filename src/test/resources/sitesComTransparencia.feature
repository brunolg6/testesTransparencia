#language: pt
Funcionalidade: Transparencia de software em sites de organizacoes publicas
  Eu, como um estudante universitario
  Quero ter acesso a informacoes transparentes em sites governamentais
  Entao eu estarei seguro de que as informacoes prestadas por estes sites são acessiveis, de qualidade e de facil entendimento e usabilidade aos interessados

  #Esquema do Cenario: Acesso ao site <site governamental> atraves de diferentes sistemas operacionais
  #Dado que estou utilizando o navegador Chrome com sua versao mais atualizada
  #Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o sistema operacional Windows
  #E acesso a mesma pagina utilizando o sistema operacional Linux
  #Entao as informacoes contidas na pagina sao disponibilizadas da mesma forma tanto com Windows quanto no Linux
  #
  #Exemplos:
  #| site governamental | pagina    |
  #| "site1"            | "pagina1" |
  Esquema do Cenario: Acesso ao site <site governamental> atraves de diferentes navegadores web
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o navegador web Chrome
    E acesso a pagina <pagina> do site <site governamental> utilizado o navegador web Firefox
    Entao as informacoes contidas na pagina sao disponibilizadas da mesma forma tanto com Chrome quanto no Firefox

    Exemplos: 
      | site governamental           | pagina                |
      | "https://estrutura.ufsc.br/" | "servicos-gratuitos/" |

  Esquema do Cenario: Navegar no site <site governamental> sem utilizar o mouse
    Dado que eu estou utilizando um computador sem mouse
    Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o navegador web Chrome
    E eu interajo utilizando apenas as teclas TAB e ENTER do teclado
    Entao eu consigo acessar a pagina de contato do site

    Exemplos: 
      | site governamental | pagina          |
      | "https://ufsc.br/" | "mapa-do-site/" |

  Esquema do Cenario: Pagina de noticias ilustrada com imagens ou videos
    Dado que estou utilizando um computador com sistema operacional Linux
    Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o navegador web Chrome
    Entao a pagina deve apresentar ao menos uma imagem ou videos para ilustrar a informacao

    Exemplos: 
      | site governamental          | pagina                                                                                           |
      | "https://noticias.ufsc.br/" | "2019/10/pesquisa-da-ufsc-revela-nova-perspectiva-para-diagnostico-e-tratamento-da-tuberculose/" |
  #Esquema do Cenario: Assinatura digital de documentos
    #Dado que estou utilizando um computador com sistema operacional Linux
    #Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o navegador web Chrome
    #E gero algum documento no site
    #Entao o documento deve apresentar assinatura digital
#
    #Exemplos: 
      #| site governamental | pagina    |
      #| "site1"            | "pagina1" |
#
  #Esquema do Cenario: Ferramenta de busca presente em todas as paginas
    #Dado que estou utilizando um computador com sistema operacional Linux
    #Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o navegador web Chrome
    #E acesso a pagina <página>
    #E acesso a pagina <página>
    #Entao todas as paginas devem apresentar a ferramenta de busca do site
#
    #Exemplos: 
      #| site governamental | pagina    |
      #| "site1"            | "pagina1" |
#
  #Esquema do Cenario: Informacoes que orientem no preenchimento de formularios
    #Dado que estou utilizando um computador com sistema operacional Linux
    #Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o navegador web Chrome
    #Entao a pagina deve conter informacoes que orientem preenchimento de seu formulario corretamente
#
    #Exemplos: 
      #| site governamental | pagina    |
      #| "site1"            | "pagina1" |
#
  #Esquema do Cenario: Servico essencial destacado na pagina inicial do site
    #Dado que estou utilizando um computador com sistema operacional Linux
    #Quando eu acesso a pagina <pagina> do site <site governamental> utilizando o navegador web Chrome
    #Entao a pagina deve conter um link destacado para o servico <servico essencial do site>
#
    #Exemplos: 
      #| site governamental | pagina    | servico essencial do site |
      #| "site1"            | "pagina1" | "servico1"                |
