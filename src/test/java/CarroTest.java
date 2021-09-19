

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarLojaCarro() {
        Unidade unidade1 = new Unidade("Veículos em Alta");

        Unidade unidade2 = new Unidade("Artista Veículos");

        Unidade loja = new Unidade("Veículos em Alta");
        loja.addConcessionaria(unidade1);
        loja.addConcessionaria(unidade2);

        assertEquals("Loja: Veículos em Alta!\n" +
                "Loja: Artista Veículos", loja.getConcessionaria());

    }
}


