

public abstract class Concessionaria {

    private String loja;

    public Concessionaria(String loja) {
        this.loja = loja;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public abstract String getConcessionaria();
}