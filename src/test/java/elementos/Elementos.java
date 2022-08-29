package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnCookies = By.xpath("//button[@id='onetrust-accept-btn-handler'] ");
	private By buscaEmpresa = By.xpath("//input[@placeholder='Buscar']");
	private By btnBuscar = By.xpath("//div[@class='align-self-lg-end col-lg-2'] ");
	private By textVaga = By.xpath("//h3[@class='h4 font-weight-medium text-dark mb-1'] ");
	private By descVaga = By.xpath(
			"//div[@class='mb-lg-0 d-none d-lg-block col-lg-7']//div[@class='styleJobDescription p-3']//div[@class=\"mb-5\"]//p[text()='Venha fazer parte do time Warrior'] ");
	private By btnCandidatar = By.xpath(
			"//div[@class='d-none d-lg-block col']//nav[@class='pl-lg-4']//div[@class='row']//div[@class='m-0 row']//*[text()='Tenho Interesse']");
	private By tituloModal = By.xpath("//div[@class='text-center space-bottom-1']");
	private By nomeModal = By.xpath("//input[@placeholder='Nome Completo'] ");
	private By emailModal = By.xpath("//input[@placeholder='E-mail'] ");
	private By senhaModal = By.xpath("//input[@placeholder='********'] ");
	private By aceiteModal = By.xpath("//input[@class='form-check-input'] ");
	private By entrarModal = By.xpath("//button[@class='transition-3d-hover btn-block btn btn-primary']");
	private By salvarModal = By.xpath("//button[@class='btn-sm transition-3d-hover mr-1 ml-5 btn btn-primary']");

	public By getBtnCookies() {
		return btnCookies;
	}

	public By getBuscaEmpresa() {
		return buscaEmpresa;
	}

	public By getBtnBuscar() {
		return btnBuscar;
	}

	public By getTextVaga() {
		return textVaga;
	}

	public By getDescVaga() {
		return descVaga;
	}

	public By getBtnCandidatar() {
		return btnCandidatar;
	}

	public By getTituloModal() {
		return tituloModal;
	}

	public By getNomeModal() {
		return nomeModal;
	}

	public By getEmailModal() {
		return emailModal;
	}

	public By getSenhaModal() {
		return senhaModal;
	}

	public By getAceiteModal() {
		return aceiteModal;
	}

	public By getEntrarModal() {
		return entrarModal;
	}

	public By getSalvarModal() {
		return salvarModal;
	}

}
