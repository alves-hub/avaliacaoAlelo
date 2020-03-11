package Utils;

import java.util.ArrayList;
import java.util.List;

public class ListFilmes {

    private List<Diretor> diretores;
    private List<Filmes> filmes;

    public ListFilmes() {
        diretores = new ArrayList<Diretor>();
        filmes = new ArrayList<Filmes>();
    }

    public void ListDiretores(String nome, String dtNascimento) {
        diretores.add(new Diretor(nome, dtNascimento));

    }

    public void ListFilmes(String nome, String anoLancamento) {
        
        filmes.add(new Filmes(nome, anoLancamento));
    }

    public List<Diretor> ListDiretores() {
        
        return this.ListDiretores();
    }

    public List<Diretor> getListDiretores() {
        return this.diretores;
    }

    public List<Filmes> getListFilmes() {
        return this.filmes;
    }
//    public void getListDiretores(String nome, String dtNascimento) {
//    }
//
//    public void getListFilmes(String nomeFilme, String anoLancamento) {
//    }
}
