package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import logics.RealizarPesqNegativaLogics;

public class RealizarPesqNegativaSteps {
	
	RealizarPesqNegativaLogics realizarnegativa;
	
	WebDriver driver;
	
	public RealizarPesqNegativaSteps() {
		realizarnegativa = new RealizarPesqNegativaLogics(driver);
	}
	
	@Given("usuario esta na pagina de inicio")
	public void usuario_esta_na_pagina_de_inicio() {
		realizarnegativa = new RealizarPesqNegativaLogics(driver);
		realizarnegativa.usuario_entra_home();
	}

	@When("usuario clica na lupa")
	public void usuario_clica_na_lupa_de_busca()  {
	    realizarnegativa.usuario_acessa_busca();
	}

	@And("usuario preenche o campo de pesquisas com elemento invalido")
	public void usuario_preenche_o_campo_de_pesquisas_com_invalido() {
	   realizarnegativa.usuario_preenche_invalido();
	}

	@And("usuario clica para pesquisar")
	public void usuario_clica_para_pesquisar() {
	    realizarnegativa.usuario_pesquisa();
	}

	@Then("valido mensagem que nada foi encontrado")
	public void valido_mensagem_de_erro_na_pagina() {
	   realizarnegativa.valido_erro();
	}

}
