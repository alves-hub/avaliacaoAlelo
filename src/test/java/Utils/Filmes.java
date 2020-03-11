package Utils;

public class Filmes {

    private String nomeFilme;
    private String anoLancamento;

    public Filmes(String NomeFilme, String AnoLacamento) {
        this.nomeFilme = NomeFilme;
        this.anoLancamento = AnoLacamento;
    }

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public String getAnoLancamento() {
        return this.anoLancamento;
    }

}
