#language: pt

Funcionalidade: validação preço no carrinho
  EU como cliente do site Swag Labs
  Quero selecionar um produto do site
  Para que consiga verificar no carrinho o valor dele

  @VPC1 @AutoCarrinho
  Esquema do Cenário: validar produto no carrinho com usuário standard
    Dado que acesso o site Swag Labs
    Quando realizo o acesso com o usuario <usuario> e senha <senha>
    E adiciono o produto selecionado dentro do carrinho
    Então sou capaz de verificar o valor dele dentro do carrinho

    Exemplos:
      | usuario       | senha        |
      |"standard_user"|"secret_sauce"|

  @VPC2 @AutoCarrinho
  Esquema do Cenário: validar produto no carrinho com usuário visual
    Dado que acesso o site Swag Labs
    Quando realizo o acesso com o usuario <usuario> e senha <senha>
    E adiciono o produto selecionado dentro do carrinho
    Então sou capaz de verificar o valor dele dentro do carrinho

    Exemplos:
      |usuario       |senha         |
      |"visual_user" |"secret_sauce"|