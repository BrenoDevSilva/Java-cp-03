package br.fiap.cp3.models;

public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private Doacao[] historicoDoacoes;
    private int quantidadeDoacoes;

    private static Doador[] doadores = new Doador[1000];
    private static int quantidadeDoadores = 0;

    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new Doacao[100];
        this.quantidadeDoacoes = 0;
    }

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

    public void adicionarDoacao(Doacao doacao) {
        if (quantidadeDoacoes < historicoDoacoes.length) {
            this.historicoDoacoes[quantidadeDoacoes] = doacao;
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }

    public static void cadastrarDoador(String nome, String cpf, String endereco, String contato) {
        if (quantidadeDoadores < doadores.length) {
            Doador novoDoador = new Doador(nome, cpf, endereco, contato);
            doadores[quantidadeDoadores] = novoDoador;
            quantidadeDoadores++;
            System.out.println("Doador cadastrado com sucesso.");
        } else {
            System.out.println("Capacidade máxima de doadores atingida.");
        }
    }

    public static void listarDoadores() {
        if (quantidadeDoadores == 0) {
            System.out.println("Nenhum doador cadastrado.");
        } else {
            for (int i = 0; i < quantidadeDoadores; i++) {
                Doador doador = doadores[i];
                System.out.println("Nome: " + doador.getNome() + ", CPF: " + doador.getCpf() + ", Endereço: " + doador.getEndereco() + ", Contato: " + doador.getContato());
            }
        }
    }

    public static Doador encontrarDoadorPorNome(String nome) {
        for (int i = 0; i < quantidadeDoadores; i++) {
            if (doadores[i].getNome().equals(nome)) {
                return doadores[i];
            }
        }
        return null;
    }
}
