

import java.util.ArrayList;
import java.util.List;

public class Unidade extends Concessionaria {

    private List<Concessionaria> concessionarias;

    public Unidade(String loja) {
        super(loja);
        this.concessionarias = new ArrayList<Concessionaria>();
    }

    public void addConcessionaria(Concessionaria loja) {
        this.concessionarias.add(loja);
    }

    public String getLoja() {
        String saida = "";
        saida = "Loja: " + this.getConcessionaria() + "\n";
        for (Concessionaria loja : concessionarias) {
            saida += loja.getConcessionaria();
        }
        return saida;
    }

    @Override
    public String getConcessionaria() {
        return null;
    }
}
