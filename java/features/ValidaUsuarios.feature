#language: pt

Funcionalidade: validação os acessos dos usuários
  EU como QA do site Swag Labs
  Quero verificar os acessos dos usuários
  Para que consiga validar os produtos no checkout a mensagem de erro no login

  @VL1 @AutoValidaUsuarios
  Esquema do Cenário: Acessar com os usuários sem bloqueio na aplicação para validar o checkout
    Dado que acesso o site Swag Labs
    Quando realizo o acesso com o usuario <usuario> e senha <senha>
    E adiciono o produto selecionado dentro do carrinho
    E informo o primeiro nome <primeiroNome> ultimo nome <ultimoNome> e codigo postal <codigoPostal>
    Então sou capaz de verificar no checkout o valor total da compra

  Exemplos:
  |usuario                    |senha          |primeiroNome  |ultimoNome  |codigoPostal  |
  |"standard_user"            |"secret_sauce" |"Carlos"      |"Silva"     |"04544-110"   |
  |"performance_glitch_user"  |"secret_sauce" |"Lucas"       |"Souza"     |"04755-215"   |
  |"error_user"               |"secret_sauce" |"Carlos"      |"Silva"     |"04544-110"   |
  |"visual_user"              |"secret_sauce" |"Lucas"       |"Souza"     |"04755-215"   |

  @VL2 @AutoValidaUsuarios
  Esquema do Cenário: Acessar com os usuários com bloqueio na aplicação para validar mensagem de erro
    Dado que acesso o site Swag Labs
    Quando realizo o acesso com o usuario <usuario> e senha <senha>
    Então sou capaz de verificar a mensagem de erro no login

  Exemplos:
  |usuario             |senha          |
  |"locked_out_user"   |"secret_sauce" |
