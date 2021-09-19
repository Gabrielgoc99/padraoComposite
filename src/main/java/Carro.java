

public class Carro {

    private Concessionaria loja;

    public void setLoja(Concessionaria loja) {
        this.loja = loja;
    }

    public String getLoja() {
        if (this.loja == null) {
            throw new NullPointerException("Loja Inexistente!!!");
        }
        return this.loja.getConcessionaria();
    }
}