package br.fiap.cp3.models;

public class Doacao {
    private Doador doador;
    private InstituicaoCaridade instituicao;
    private String tipo;
    private double valor;
    private String data;

    private static Doacao[] doacoes = new Doacao[1000];
    private static int quantidadeDoacoes = 0;

    public Doacao(Doador doador, InstituicaoCaridade instituicao, String tipo, double valor, String data) {
        this.doador = doador;
        this.instituicao = instituicao;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public Doador getDoador() {
        return doador;
    }

    public InstituicaoCaridade getInstituicao() {
        return instituicao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public static void cadastrarDoacao(Doador doador, InstituicaoCaridade instituicao, String tipo, double valor, String data) {
        if (quantidadeDoacoes < doacoes.length) {
            Doacao novaDoacao = new Doacao(doador, instituicao, tipo, valor, data);
            doacoes[quantidadeDoacoes] = novaDoacao;
            quantidadeDoacoes++;
            doador.adicionarDoacao(novaDoacao);
            System.out.println("Doação cadastrada com sucesso.");
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }
}
