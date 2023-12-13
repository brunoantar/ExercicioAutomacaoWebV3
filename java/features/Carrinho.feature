#language: pt

Funcionalidade: validação preço no carrinho
  EU como cliente do site Swag Labs
  Quero selecionar um produto do site
  Para que consiga verificar no carrinho o valor dele

  @VPC1 @AutoCarrinho
  Esquema do Cenário: validar produto no carrinho com usuário standard
    Dado que sou cliente do site Swag Labs
    Quando seleciono um produto do site com usuario <usuario> e senha <senha>
    Então sou capaz de verificar o valor dele dentro do carrinho

    Exemplos:
      | usuario       | senha        |
      |"standard_user"|"secret_sauce"|

  @VPC2 @AutoCarrinho
  Esquema do Cenário: validar produto no carrinho com usuário visual
    Dado que sou cliente do site Swag Labs
    Quando seleciono um produto do site com usuario <usuario> e senha <senha>
    Então sou capaz de verificar o valor dele dentro do carrinho

    Exemplos:
      |usuario       |senha         |
      |"visual_user" |"secret_sauce"|