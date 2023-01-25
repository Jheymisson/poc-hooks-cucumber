#language: pt

@poc
Funcionalidade: Poc

  @poc_success
  Cenário: Poc com sucesso
    Dado que informo o nome "Usuario 1"
    Quando realizo uma busca pelo nome "Usuario 2"
    Entao valido que o nome "Usuario 3"
