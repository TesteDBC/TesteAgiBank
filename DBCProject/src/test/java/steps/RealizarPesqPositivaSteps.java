package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import logics.RealizarPesqPositivaLogics;

public class RealizarPesqPositivaSteps {
	
	WebDriver driver;
	RealizarPesqPositivaLogics realizarlogics;
	
	public RealizarPesqPositivaSteps () {
		realizarlogics = new RealizarPesqPositivaLogics(driver);
	}
	
	
	@Given("usuario esta na pagina inicial")
	public void usuario_esta_na_pagina_inicial() {
		realizarlogics = new RealizarPesqPositivaLogics(driver);
		realizarlogics.usuario_acessa_pagina();
	}

	@When("usuario clica na busca")
	public void usuario_clica_na_lupa()   {
		realizarlogics.usuario_clica_lupa();
	}

	@When("usuario preenche o campo de pesquisas com elemento conhecido")
	public void usuario_preenche_o_campo_de_pesquisas_com_elemento_conhecido() {
	   realizarlogics.usuario_preenche_positivo();
	}

	@When("usuario clica em pesquisar")
	public void usuario_clica_em_pesquisar() {
	   realizarlogics.usuario_clica_pesquisar();
	}

	@Then("valido que o elemento foi encontrado")
	public void valido_que_o_elemento_foi_encontrado() {
	    realizarlogics.valido_busca_encontrada();
	}
	
	
	
	

}
