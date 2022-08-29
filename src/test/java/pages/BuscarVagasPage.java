package pages;

import elementos.Elementos;
import metodos.Metodos;

public class BuscarVagasPage {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void pesquisarEmpresa(String palavraChave) {
		metodos.esperarElemento(el.getBuscaEmpresa());
		metodos.escrever(el.getBuscaEmpresa(), palavraChave);

	}

	public void btnBuscar() {
		metodos.clicar(el.getBtnBuscar());

	}

	public void validarVagas(String empresaPesquisada) {
		metodos.evidencias("CT02 - Validar retorno das vagas ");
		metodos.validarTexto(el.getTextVaga(), empresaPesquisada);

	}

	public void abrirVaga() {
		metodos.clicar(el.getTextVaga());

	}

	public void validarDescricao(String textoEsperado) {
		metodos.esperarElemento(el.getDescVaga());
		metodos.validarTexto(el.getDescVaga(), textoEsperado);

	}

	public void candidatarVaga() {
		metodos.clicar(el.getBtnCandidatar());

	}

	public void validarModal(String textoEsperado) {
		metodos.validarTexto(el.getTituloModal(), textoEsperado);
		metodos.evidencias("CT03 - Validar Modal");

	}

	public void preencherModal(String nomeCompleto, String email, String senha) {
		metodos.escrever(el.getNomeModal(), nomeCompleto);
		metodos.escrever(el.getEmailModal(), email);
		metodos.escrever(el.getSenhaModal(), senha);
		metodos.clicar(el.getAceiteModal());
		metodos.clicar(el.getEntrarModal());
		metodos.evidencias("CT04- Validar preenchimento");

	}

}
