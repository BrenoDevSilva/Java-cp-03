import models.Doador;
import models.Doacao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoadorTest {
    private Doador doador;

    @BeforeEach
    public void setUp() {
        doador = new Doador("Maria Silva", "123.456.789-00", "Rua A, 123", "99999-9999");
    }

    @Test
    public void testAdicionarDoacao() {
        Doacao doacao = new Doacao(doador, null, "Alimentos", 150.0, "2023-05-26");
        doador.adicionarDoacao(doacao);
        assertEquals(1, doador.getHistoricoDoacoes().size());
        assertEquals(doacao, doador.getHistoricoDoacoes().get(0));
    }
}
