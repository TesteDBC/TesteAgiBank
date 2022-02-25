@desafio
Feature: Realizar pesquisa para elemento nao encontrado no site
 

  @02
  Scenario: Realizar pesquisa para elemento nao encontrado no site
    Given usuario esta na pagina de inicio
    When usuario clica na lupa
    And usuario preenche o campo de pesquisas com elemento invalido
    And usuario clica para pesquisar
    Then valido mensagem que nada foi encontrado



    