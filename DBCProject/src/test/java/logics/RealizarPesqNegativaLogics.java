package logics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RealizarPesqNegativaLogics {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public RealizarPesqNegativaLogics (WebDriver driver) {
		this.driver = driver;
	}
	
	public void usuario_entra_home()
	{
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.navigate().to("https://blogdoagi.com.br/");
    driver.manage().window().maximize();
		
	}
	
	public void usuario_acessa_busca() {
		new WebDriverWait (driver, Duration.ofSeconds(5)).
		until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='search-open search-btn'])[1]")));
		driver.findElement(By.xpath("(//*[@class='search-open search-btn'])[1]")).click();
		
	}
	
	public void usuario_preenche_invalido() {
		new WebDriverWait (driver, Duration.ofSeconds(5)).
		until(ExpectedConditions.elementToBeClickable(By.name("s")));
		driver.findElement(By.name("s")).click();
		driver.findElement(By.name("s")).sendKeys("erroerroerro");
	}
	
	public void usuario_pesquisa() {
		driver.findElement(By.xpath("(//*[@value='Pesquisar'])[1]")).click();
	}
	
	public void valido_erro() {
		String erro = driver.findElement(By.xpath("//*[@class='entry-title']")).getText();
		if (erro.contentEquals("Nenhum resultado")){
			System.out.println("Teste finalizado com sucesso");
			driver.quit();
		}
		else {
			System.out.println("Falhou.");
			driver.quit();
			throw new AssertionError();
			
		}
		
	}
	
}
