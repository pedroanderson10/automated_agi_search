package acceptance.features.StepsManageArticleSearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class a1_Search_With_Only_Letters extends ConfigStepsManageArticleSearch{
    @Given("que o usuário está na tela inicial do blog")
    public void given(){
        setUp();
        assertTrue(homePage.isPageHome());
    }

    @When("ele clica no ícone de pesquisa")
    public void when(){
        homePage.openSearchComponent();
    }

    @And("ele insere um texto apenas com letras no campo de pesquisa")
    public void and_1(){
        assertTrue(homePage.verifyFieldSearch());
        homePage.fillIinSearchField("Bancos Digitais");
    }

    @And("ele clica no botão Pesquisar")
    public void and_2(){
        assertTrue(homePage.verifyButtonSearch());
        this.resultsPage = homePage.clickButtonSearch();
    }

    @Then("o sistema deve mostrar uma nova página com o resultado da busca pelo texto")
    public void then(){
        assertEquals("Resultados da busca por: Bancos Digitais", resultsPage.searchResult());
        //resultsPage.closeBrowser();
    }
}
