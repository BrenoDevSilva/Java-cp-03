package models;

public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private Doacao[] historicoDoacoes;
    private int quantidadeDoacoes;

    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new Doacao[];
        this.quantidadeDoacoes = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Doacao[] getHistoricoDoacoes() {
        return historicoDoacoes;
    }

    public int getQuantidadeDoacoes() {
        return quantidadeDoacoes;
    }

    // Métodos adicionais
    public void adicionarDoacao(Doacao doacao) {
        if (quantidadeDoacoes < historicoDoacoes.length) {
            this.historicoDoacoes[quantidadeDoacoes] = doacao;
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }
}
