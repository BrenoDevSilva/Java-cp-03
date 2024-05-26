import models.InstituicaoCaridade;
import models.Voluntario;
import models.Doacao;
import models.Doador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InstituicaoCaridadeTest {
    private InstituicaoCaridade instituicao;
    private Voluntario voluntario;
    private Doador doador;

    @BeforeEach
    public void setUp() {
        instituicao = new InstituicaoCaridade("Caridade RS", "12.345.678/0001-90", "Rua E, 345", "55555-5555", "Assistência social");
        voluntario = new Voluntario("Ana Costa", "111.222.333-44", "Rua B, 678", "88888-8888", "Manhã", "Enfermagem");
        doador = new Doador("Maria Silva", "123.456.789-00", "Rua A, 123", "99999-9999");
    }

    @Test
    public void testAdicionarVoluntario() {
        instituicao.adicionarVoluntario(voluntario);
        assertEquals(1, instituicao.getVoluntarios().size());
        assertEquals(voluntario, instituicao.getVoluntarios().get(0));
    }

    @Test
    public void testAdicionarDoacaoRecebida() {
        Doacao doacao = new Doacao(doador, instituicao, "Alimentos", 150.0, "2023-05-26");
        instituicao.adicionarDoacaoRecebida(doacao);
        assertEquals(1, instituicao.getHistoricoDoacoesRecebidas().size());
        assertEquals(doacao, instituicao.getHistoricoDoacoesRecebidas().get(0));
    }
}
