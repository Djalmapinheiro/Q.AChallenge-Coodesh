package pages;

import elementos.Elementos;
import metodos.Metodos;

public class HomePage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void aceitarCookies() {
		metodos.clicar(el.getBtnCookies());

	}

	public void validarHome(String urlEsperado) {
		metodos.esperarElemento(el.getBtnCookies());
		metodos.scroll(0, 250);
		metodos.validarUrl(urlEsperado);
		metodos.evidencias("CT01 - Validar Carregamento da page");

	}

	public void menuSuperior(String opcaoMenu) {

		// para navegação menu digitar opção "Ver Vagas", "Blog" ou "Login"
		metodos.navegarMenuSuperior(opcaoMenu);

	}

}
