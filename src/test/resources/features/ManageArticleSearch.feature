#language: en

@tagf1
Feature:Perform a search on AGI's blog

  @tags1
  # Step a1
  Scenario:a1 - Search With Only Letters
    Given que o usuário está na tela inicial do blog
    When  ele clica no ícone de pesquisa
    And   ele insere um texto apenas com letras no campo de pesquisa
    And   ele clica no botão Pesquisar
    Then  o sistema deve mostrar uma nova página com o resultado da busca pelo texto

  # Step a2
  Scenario:a2 - Search With Only Special Characters
    Given que o usuário está na tela inicial do blog 2
    When  ele clica no ícone de pesquisa 2
    And   ele insere um texto apenas com caracteres especiais no campo de pesquisa
    And   ele clica no botão Pesquisar 2
    Then  o sistema deve mostrar uma nova página com uma mensagem indicando que nenhuma mensagem foi encontrada