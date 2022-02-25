@desafio
Feature: Realizar pesquisa para elemento encontrado no site
 
  @01
  Scenario: Realizar pesquisa para elemento encontrado no site
    Given usuario esta na pagina inicial
    When usuario clica na busca
    And usuario preenche o campo de pesquisas com elemento conhecido
    And usuario clica em pesquisar
    Then valido que o elemento foi encontrado
