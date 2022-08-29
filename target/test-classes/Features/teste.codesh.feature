@teste
Feature: Acessar HomePage
Como usuario da plataforma 
Desejo acessar a pagina da Beta.codesh  
Para realizar pesquisa de vagas

Scenario: Validar HomePage
Given que estou no site
When valido a HomePage
Then clico no botao ver vagas

Scenario: Pesquisar uma empresa
Given que pesquise uma empresa
When clicar em buscar
Then valido as vagas disponiveis

Scenario: Visualizacao de vaga
Given que clique na vaga
When carregar a pagina
Then valido a descricao da vaga 

Scenario: Cadastramento da vaga
Given que clique em candidatar a vaga
When carregar o modal
Then valido a mensagem de registro






