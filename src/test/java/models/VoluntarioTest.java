import models.Voluntario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoluntarioTest {
    private Voluntario voluntario;

    @BeforeEach
    public void setUp() {
        voluntario = new Voluntario("Ana Costa", "111.222.333-44", "Rua B, 678", "88888-8888", "Manhã", "Enfermagem");
    }

    @Test
    public void testGetNome() {
        assertEquals("Ana Costa", voluntario.getNome());
    }

    @Test
    public void testGetCpf() {
        assertEquals("111.222.333-44", voluntario.getCpf());
    }

    @Test
    public void testGetEndereco() {
        assertEquals("Rua B, 678", voluntario.getEndereco());
    }

    @Test
    public void testGetTelefone() {
        assertEquals("88888-8888", voluntario.getTelefone());
    }

    @Test
    public void testGetTurno() {
        assertEquals("Manhã", voluntario.getTurno());
    }

    @Test
    public void testGetAreaAtuacao() {
        assertEquals("Enfermagem", voluntario.getAreaAtuacao());
    }

    @Test
    public void testSetNome() {
        voluntario.setNome("Carlos Silva");
        assertEquals("Carlos Silva", voluntario.getNome());
    }

    @Test
    public void testSetCpf() {
        voluntario.setCpf("999.888.777-66");
        assertEquals("999.888.777-66", voluntario.getCpf());
    }

    @Test
    public void testSetEndereco() {
        voluntario.setEndereco("Rua C, 789");
        assertEquals("Rua C, 789", voluntario.getEndereco());
    }

    @Test
    public void testSetTelefone() {
        voluntario.setTelefone("77777-7777");
        assertEquals("77777-7777", voluntario.getTelefone());
    }

    @Test
    public void testSetTurno() {
        voluntario.setTurno("Tarde");
        assertEquals("Tarde", voluntario.getTurno());
    }

    @Test
    public void testSetAreaAtuacao() {
        voluntario.setAreaAtuacao("Educação");
        assertEquals("Educação", voluntario.getAreaAtuacao());
    }
}
