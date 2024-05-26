import models.*;

public class Main {
    public static void main(String[] args) {
        Doador doador = new Doador("Maria Silva", "123.456.789-00", "Rua A, 123", "99999-9999");
        InstituicaoCaridade instituicao = new InstituicaoCaridade("Caridade RS", "12.345.678/0001-90", "Rua E, 345", "55555-5555", "Assistência social");
        Voluntario voluntario = new Voluntario("Ana Costa", "111.222.333-44", "Rua B, 678", "88888-8888", "Manhã", "Enfermagem");

        Doacao doacao = new Doacao(doador, instituicao, "Alimentos", 150.0, "2023-05-26");

        doador.adicionarDoacao(doacao);
        instituicao.adicionarDoacaoRecebida(doacao);
        instituicao.adicionarVoluntario(voluntario);

        System.out.println("Sistema de Voluntariado");
        System.out.println("Doador: " + doador.getNome());
        System.out.println("Instituição: " + instituicao.getNome());
        System.out.println("Voluntário: " + voluntario.getNome());
        System.out.println("Doação: " + doacao.getTipoDoacao() + " de valor " + doacao.getValor());
    }
}
