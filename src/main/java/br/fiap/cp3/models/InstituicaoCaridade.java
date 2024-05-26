package models;

/**
 * Representa uma instituição de caridade que aceita voluntários e doações.
 */
public class InstituicaoCaridade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private Voluntario[] voluntarios;
    private Doacao[] historicoDoacoesRecebidas;
    private int quantidadeVoluntarios;
    private int quantidadeDoacoes;

    private static InstituicaoCaridade[] instituicoes = new InstituicaoCaridade[1000]; // Vetor para armazenar até 1000 instituições
    private static int quantidadeInstituicoes = 0; // Contador de instituições cadastradas

    /**
     * Construtor para criar uma nova instituição de caridade.
     * @param nome O nome da instituição.
     * @param cnpj O CNPJ da instituição.
     * @param endereco O endereço da instituição.
     * @param contato O contato da instituição.
     * @param areaAtuacao A área de atuação da instituição.
     */
    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.voluntarios = new Voluntario[100]; // Vetor com capacidade para 100 voluntários
        this.historicoDoacoesRecebidas = new Doacao[100]; // Vetor com capacidade para 100 doações
        this.quantidadeVoluntarios = 0;
        this.quantidadeDoacoes = 0;
    }

    /**
     * Obtém o nome da instituição.
     * @return O nome da instituição.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da instituição.
     * @param nome O novo nome da instituição.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CNPJ da instituição.
     * @return O CNPJ da instituição.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da instituição.
     * @param cnpj O novo CNPJ da instituição.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Obtém o endereço da instituição.
     * @return O endereço da instituição.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da instituição.
     * @param endereco O novo endereço da instituição.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o contato da instituição.
     * @return O contato da instituição.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato da instituição.
     * @param contato O novo contato da instituição.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Obtém a área de atuação da instituição.
     * @return A área de atuação da instituição.
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Define a área de atuação da instituição.
     * @param areaAtuacao A nova área de atuação da instituição.
     */
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    /**
     * Obtém os voluntários associados à instituição.
     * @return Os voluntários associados à instituição.
     */
    public Voluntario[] getVoluntarios() {
        return voluntarios;
    }

    /**
     * Obtém a quantidade de voluntários associados à instituição.
     * @return A quantidade de voluntários associados à instituição.
     */
    public int getQuantidadeVoluntarios() {
        return quantidadeVoluntarios;
    }

    /**
     * Obtém as doações recebidas pela instituição.
     * @return As doações recebidas pela instituição.
     */
    public Doacao[] getHistoricoDoacoesRecebidas() {
        return historicoDoacoesRecebidas;
    }

    /**
     * Obtém a quantidade de doações recebidas pela instituição.
     * @return A quantidade de doações recebidas pela instituição.
     */
    public int getQuantidadeDoacoes() {
        return quantidadeDoacoes;
    }

    /**
     * Adiciona um voluntário à instituição.
     * @param voluntario O voluntário a ser adicionado.
     */
    // Métodos
    public void adicionarVoluntario(Voluntario voluntario) {
        if (quantidadeVoluntarios < voluntarios.length) {
            this.voluntarios[quantidadeVoluntarios] = voluntario;
            quantidadeVoluntarios++;
        } else {
            System.out.println("Capacidade máxima de voluntários atingida.");
        }
    }

    public void removerVoluntario(Voluntario voluntario) {
        for (int i = 0; i < quantidadeVoluntarios; i++) {
            if (voluntarios[i].equals(voluntario)) {
                voluntarios[i] = voluntarios[quantidadeVoluntarios - 1];
                voluntarios[quantidadeVoluntarios - 1] = null;
                quantidadeVoluntarios--;
                break;
            }
        }
    }

    public void adicionarDoacaoRecebida(Doacao doacao) {
        if (quantidadeDoacoes < historicoDoacoesRecebidas.length) {
            this.historicoDoacoesRecebidas[quantidadeDoacoes] = doacao;
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }


    public static void cadastrarInstituicao(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        if (quantidadeInstituicoes < instituicoes.length) {
            InstituicaoCaridade novaInstituicao = new InstituicaoCaridade(nome, cnpj, endereco, contato, areaAtuacao);
            instituicoes[quantidadeInstituicoes] = novaInstituicao;
            quantidadeInstituicoes++;
            System.out.println("Instituição cadastrada com sucesso.");
        } else {
            System.out.println("Capacidade máxima de instituições atingida.");
        }
    }

    public static void listarInstituicoes() {
        if (quantidadeInstituicoes == 0) {
            System.out.println("Nenhuma instituição cadastrada.");
        } else {
            for (int i = 0; i < quantidadeInstituicoes; i++) {
                InstituicaoCaridade instituicao = instituicoes[i];
                System.out.println("Nome: " + instituicao.getNome() + ", CNPJ: " + instituicao.getCnpj() + ", Endereço: " + instituicao.getEndereco() + ", Contato: " + instituicao.getContato() + ", Área de Atuação: " + instituicao.getAreaAtuacao());
            }
        }
    }
}
