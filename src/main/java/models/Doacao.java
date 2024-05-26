package models;

public class Doacao {
    private Doador doador;
    private InstituicaoCaridade instituicao;
    private String tipoDoacao;
    private double valor;
    private String data;

    public Doacao(Doador doador, InstituicaoCaridade instituicao, String tipoDoacao, double valor, String data) {
        this.doador = doador;
        this.instituicao = instituicao;
        this.tipoDoacao = tipoDoacao;
        this.valor = valor;
        this.data = data;
    }

    // Getters e Setters
    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public InstituicaoCaridade getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(InstituicaoCaridade instituicao) {
        this.instituicao = instituicao;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
