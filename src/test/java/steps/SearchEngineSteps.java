package steps;

import Page.GoogleHomePage;
import Page.GoogleResultPage;
import Utils.Diretor;
import Utils.ListFilmes;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchEngineSteps extends ParentSteps {

    private static final Logger logger = LoggerFactory.getLogger(SearchEngineSteps.class);
    private ListFilmes filmes = new ListFilmes();
    private GoogleHomePage googleHomePage;
    private GoogleResultPage googleResultPage;
    private List<String> listBusca = new ArrayList<String>();

    @Dado("^que acesso a home$")
    public void acessarHome() {
        webdriver.get("https://www.google.com.br");
        googleHomePage = new GoogleHomePage(webdriver);

    }

    @Quando("^feito o Cadastro diretores e filmes$")
    public void cadastro_diretores_e_filmes(DataTable dataTable) throws Throwable {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> filme : list) {
            filmes.ListDiretores(filme.get(0), filme.get(1));
            filmes.ListFilmes(filme.get(0), filme.get(1));
        }
    }

    @E("^feito a busca dos diretores e filmes$")
    public void realizo_a_busca_dos_filmes_e_diretores() throws Throwable {
        String pesquisa;
        String resultado;
        int i = 0;
        for (Diretor diretor : filmes.getListDiretores()) {
            pesquisa = diretor.getNomeDiretor() + " " + filmes.getListFilmes().get(i).getNomeFilme();
            googleHomePage.search(pesquisa);
            resultado = googleResultPage.totResults();
            listBusca.add(pesquisa + ": " + resultado);
            i++;
        }
    }

    @Entao("^exibir resultado da quantidade$")
    public void exibo_o_resultado_da_quantidade_de_resultados() throws Throwable {
        for (String resultado : listBusca) {
            System.out.println(resultado);
        }
    }


}
