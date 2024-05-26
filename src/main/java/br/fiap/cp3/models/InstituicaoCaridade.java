package models;

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

    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.voluntarios = new Voluntario[];
        this.historicoDoacoesRecebidas = new Doacao[];
        this.quantidadeVoluntarios = 0;
        this.quantidadeDoacoes = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Voluntario[] getVoluntarios() {
        return voluntarios;
    }

    public int getQuantidadeVoluntarios() {
        return quantidadeVoluntarios;
    }

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

    public Doacao[] getHistoricoDoacoesRecebidas() {
        return historicoDoacoesRecebidas;
    }

    public int getQuantidadeDoacoes() {
        return quantidadeDoacoes;
    }

    public void adicionarDoacaoRecebida(Doacao doacao) {
        if (quantidadeDoacoes < historicoDoacoesRecebidas.length) {
            this.historicoDoacoesRecebidas[quantidadeDoacoes] = doacao;
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }
}
