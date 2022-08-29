package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.BuscarVagasPage;
import pages.HomePage;
import runner.Executa;

public class PesquisaVagas {

	Executa executa = new Executa();
	BuscarVagasPage vagasPage = new BuscarVagasPage();
	HomePage hPages = new HomePage();

	@Given("que estou no site")
	public void queEstouNoSite() {
		executa.abrirNavegador("https://beta.coodesh.com", "Chrome");

	}

	@When("valido a HomePage")
	public void validoAHomePage() {
		hPages.aceitarCookies();
		hPages.validarHome("https://beta.coodesh.com/");

	}

	@Then("clico no botao ver vagas")
	public void clicoNoBotaoVerVagas() {
		hPages.menuSuperior("Ver Vagas");

	}

	@Given("que pesquise uma empresa")
	public void quePesquiseUmaEmpresa() {
		vagasPage.pesquisarEmpresa("WCSA Soluções em Teste");

	}

	@When("clicar em buscar")
	public void clicarEmBuscar() {
		vagasPage.btnBuscar();

	}

	@Then("valido as vagas disponiveis")
	public void validoAsVagasDisponiveis() {
		vagasPage.validarVagas("Warrior");
	}

	@Given("que clique na vaga")
	public void queCliqueNaVaga() {
		vagasPage.abrirVaga();

	}

	@When("carregar a pagina")
	public void carregarAPagina() {

	}

	@Then("valido a descricao da vaga")
	public void validoADescricaoDaVaga() {
		vagasPage.validarDescricao("Venha fazer parte do time Warrior");

	}

	@Given("que clique em candidatar a vaga")
	public void queCliqueEmCandidatarAVaga() {
		vagasPage.candidatarVaga();

	}

	@When("carregar o modal")
	public void carregarOModal() {
		vagasPage.validarModal("Registre-se");
	}

	@Then("valido a mensagem de registro")
	public void validoAMensagemDeRegistro() {
		vagasPage.preencherModal("Teste1234", "teste@email.com", "Teste*123");

	}

}
