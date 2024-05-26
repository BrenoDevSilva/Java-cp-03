import models.Doacao;
import models.Doador;
import models.InstituicaoCaridade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoacaoTest {
    private Doacao doacao;
    private Doador doador;
    private InstituicaoCaridade instituicao;

    @BeforeEach
    public void setUp() {
        doador = new Doador("Maria Silva", "123.456.789-00", "Rua A, 123", "99999-9999");
        instituicao = new InstituicaoCaridade("Caridade RS", "12.345.678/0001-90", "Rua E, 345", "55555-5555", "Assistência social");
        doacao = new Doacao(doador, instituicao, "Alimentos", 150.0, "2023-05-26");
    }

    @Test
    public void testGetDoador() {
        assertEquals(doador, doacao.getDoador());
    }

    @Test
    public void testGetInstituicao() {
        assertEquals(instituicao, doacao.getInstituicao());
    }

    @Test
    public void testGetTipo() {
        assertEquals("Alimentos", doacao.getTipo());
    }

    @Test
    public void testGetValor() {
        assertEquals(150.0, doacao.getValor());
    }

    @Test
    public void testGetData() {
        assertEquals("2023-05-26", doacao.getData());
    }

    @Test
    public void testSetDoador() {
        Doador novoDoador = new Doador("João Souza", "987.654.321-00", "Rua B, 456", "88888-8888");
        doacao.setDoador(novoDoador);
        assertEquals(novoDoador, doacao.getDoador());
    }

    @Test
    public void testSetInstituicao() {
        InstituicaoCaridade novaInstituicao = new InstituicaoCaridade("Nova Caridade", "98.765.432/0001-09", "Rua F, 678", "44444-4444", "Educação");
        doacao.setInstituicao(novaInstituicao);
        assertEquals(novaInstituicao, doacao.getInstituicao());
    }

    @Test
    public void testSetTipo() {
        doacao.setTipo("Roupas");
        assertEquals("Roupas", doacao.getTipo());
    }

    @Test
    public void testSetValor() {
        doacao.setValor(200.0);
        assertEquals(200.0, doacao.getValor());
    }

    @Test
    public void testSetData() {
        doacao.setData("2023-06-01");
        assertEquals("2023-06-01", doacao.getData());
    }
}
