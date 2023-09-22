package acceptance.features.StepsManageArticleSearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class a2_Search_With_Only_Special_Characters extends ConfigStepsManageArticleSearch{

    @Given("que o usuário está na tela inicial do blog 2")
    public void given(){
        setUp();
        assertTrue(homePage.isPageHome());
    }

    @When("ele clica no ícone de pesquisa 2")
    public void when(){
        homePage.openSearchComponent();
    }

    @And("ele insere um texto apenas com caracteres especiais no campo de pesquisa")
    public void and_1(){
        assertTrue(homePage.verifyFieldSearch());
        homePage.fillIinSearchField("#####");
    }

    @And("ele clica no botão Pesquisar 2")
    public void and_2(){
        assertTrue(homePage.verifyButtonSearch());
        this.resultsPage = homePage.clickButtonSearch();
    }

    @Then("o sistema deve mostrar uma nova página com uma mensagem indicando que nenhuma mensagem foi encontrada")
    public void then(){
        assertEquals("Nenhum resultado", resultsPage.searchNoResults());
        assertEquals("Não encontramos nada para estes termos de busca. Tente novamente com palavras-chave diferentes.", resultsPage.messageSearchNoResults());
        //resultsPage.closeBrowser();
    }
}
