package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void evidencias(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcfile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcfile, destFile);
		} catch (IOException e) {
			System.out.println("Erro ao tirar evidencias");
			e.printStackTrace();
		}

	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");

	}

	public void validarUrl(String urlEsperado) {
		String urlCapturado = driver.getCurrentUrl();
		assertEquals(urlCapturado, urlEsperado);

	}

	public void navegarMenuSuperior(String menu) {
		driver.findElement(By.xpath("//a[@title='" + menu + "']")).click();

	}

	public void esperarElemento(By elemento) {

		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elemento));
		System.out.println(element.getText());
	}

	public void validarTexto(By elemento, String textoEsperado) {

		String textoCapturado = ((WebElement) driver.findElement(elemento)).getAttribute("innerText");
		System.out.println("O texto capturado é " + textoCapturado);

		assertTrue(textoCapturado.contains(textoEsperado));

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

}
