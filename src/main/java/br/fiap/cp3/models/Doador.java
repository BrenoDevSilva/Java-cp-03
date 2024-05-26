package models;

public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private Doacao[] historicoDoacoes;
    private int quantidadeDoacoes;

    private static Doador[] doadores = new Doador[1000]; // Vetor para armazenar até 1000 doadores
    private static int quantidadeDoadores = 0; // Contador de doadores cadastrados

    // Construtor
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new Doacao[100]; // Definindo tamanho do array
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

    // Métodos
    public void adicionarDoacao(Doacao doacao) {
        if (quantidadeDoacoes < historicoDoacoes.length) {
            this.historicoDoacoes[quantidadeDoacoes] = doacao;
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }

    // Método estático para cadastrar um novo doador
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

    // Método estático para listar todos os doadores cadastrados
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
}
package models;

/**
 * A classe Doador representa um doador que pode fazer doações.
 */
public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private Doacao[] historicoDoacoes;
    private int quantidadeDoacoes;

    private static Doador[] doadores = new Doador[1000]; // Vetor para armazenar até 1000 doadores
    private static int quantidadeDoadores = 0; // Contador de doadores cadastrados

    /**
     * Construtor para criar um novo doador.
     *
     * @param nome      Nome do doador.
     * @param cpf       CPF do doador.
     * @param endereco  Endereço do doador.
     * @param contato   Contato do doador.
     */
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new Doacao[100]; // Definindo tamanho do array
        this.quantidadeDoacoes = 0;
    }

    // Getters e Setters

    /**
     * Obtém o nome do doador.
     *
     * @return Nome do doador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do doador.
     *
     * @param nome Nome do doador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF do doador.
     *
     * @return CPF do doador.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do doador.
     *
     * @param cpf CPF do doador.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o endereço do doador.
     *
     * @return Endereço do doador.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do doador.
     *
     * @param endereco Endereço do doador.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o contato do doador.
     *
     * @return Contato do doador.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato do doador.
     *
     * @param contato Contato do doador.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Obtém o histórico de doações do doador.
     *
     * @return Histórico de doações.
     */
    public Doacao[] getHistoricoDoacoes() {
        return historicoDoacoes;
    }

    /**
     * Obtém a quantidade de doações feitas pelo doador.
     *
     * @return Quantidade de doações.
     */
    public int getQuantidadeDoacoes() {
        return quantidadeDoacoes;
    }

    /**
     * Adiciona uma nova doação ao histórico do doador.
     *
     * @param doacao Doação a ser adicionada.
     */
    public void adicionarDoacao(Doacao doacao) {
        if (quantidadeDoacoes < historicoDoacoes.length) {
            this.historicoDoacoes[quantidadeDoacoes] = doacao;
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }

    // Métodos estáticos

    /**
     * Cadastra um novo doador.
     *
     * @param nome      Nome do doador.
     * @param cpf       CPF do doador.
     * @param endereco  Endereço do doador.
     * @param contato   Contato do doador.
     */
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

    /**
     * Lista todos os doadores cadastrados.
     */
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
}
