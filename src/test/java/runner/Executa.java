package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@teste", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE)

public class Executa extends DriversFactory {

	public void abrirNavegador(String url, String navegador) {

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		}else {
			System.out.println("Opção Invalida escolha Chrome ou Firefox");
		}
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();

	}

}
