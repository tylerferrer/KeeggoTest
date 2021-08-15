#language: pt
Funcionalidade: Cadastro de contas

  Como um usuário
  Gostaria de cadastrar contas.
  Para que eu possa fazer compras.

  Cenário: Deve criar uma conta com sucesso
    Dado que estou acessando a aplicação
    Quando vejo a tela de cadastro
    Então preencho meu usuário "tylerferreira"
    E preencho meu email "tylerlucasferrer@gmail.com"
    E preencho minha senha "Qwe123!@#"
    E confirmo o preenchimento da minha senha "Qwe123!@#"
    E preencho meu nome "Tyler"
    E preencho meu sobrenome "Ferreira"
    E preencho meu telefone "11952011429"
    E seleciono meu país Brasil
    E preencho minha cidade "São Paulo"
    E preencho meu endereço "Rua Da Mata"
    E preencho meu estado "SP"
    E preencho meu CEP "05830555"
    E clico para aceitar os termos de uso
    Então seleciono registrar
    Então finalizo o cadastro

  Cenario: Deve logar e excluir a conta com sucesso.
    Dado que estou acessando a tela principal
    Quando clico no icone de login
    Então preencho usuário "tylerferreira"
    E minha senha "Qwe123!@#"
    Então clico em login
    Quando vejo meu usuário logado
    E clico nele
    E clico para acessar minha conta
    E vejo a tela da minha conta
    Então clico em deletar minha conta e seleciono sim no popup
    Então vejo o popup de conta deletada com sucesso

