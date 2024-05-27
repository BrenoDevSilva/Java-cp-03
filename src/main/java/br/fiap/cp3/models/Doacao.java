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

public class DoacaoManager {
    private Doacao[] doacoes;
    private int quantidadeDoacoes;

    public DoacaoManager(int tamanhoMaximo) {
        this.doacoes = new Doacao[tamanhoMaximo];
        this.quantidadeDoacoes = 0;
    }

    public void cadastrarDoacao(Doador doador, InstituicaoCaridade instituicao, String tipoDoacao, double valor, String data) {
        if (quantidadeDoacoes < doacoes.length) {
            Doacao novaDoacao = new Doacao(doador, instituicao, tipoDoacao, valor, data);
            doacoes[quantidadeDoacoes] = novaDoacao;
            doador.adicionarDoacao(novaDoacao);
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }

    public void cruzarDadosDoacaoComDoador(String cpf) {
        for (Doacao doacao : doacoes) {
            if (doacao != null && doacao.getDoador().getCpf().equals(cpf)) {
                System.out.println("Doação feita por: " + doacao.getDoador().getNome());
                System.out.println("Tipo de doação: " + doacao.getTipoDoacao());
                System.out.println("Valor da doação: " + doacao.getValor());
                System.out.println("Data da doação: " + doacao.getData());
                return;
            }
        }
        System.out.println("Nenhuma doação encontrada para o CPF fornecido.");
    }
}
