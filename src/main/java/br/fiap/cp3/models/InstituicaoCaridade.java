package br.fiap.cp3.models;

public class InstituicaoCaridade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;
    private String areaAtuacao;

    private static InstituicaoCaridade[] instituicoes = new InstituicaoCaridade[1000];
    private static int quantidadeInstituicoes = 0;

    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
    }

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

    public static void cadastrarInstituicao(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        if (quantidadeInstituicoes < instituicoes.length) {
            InstituicaoCaridade novaInstituicao = new InstituicaoCaridade(nome, cnpj, endereco, contato, areaAtuacao);
            instituicoes[quantidadeInstituicoes] = novaInstituicao;
            quantidadeInstituicoes++;
            System.out.println("Instituição de Caridade cadastrada com sucesso.");
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

    public static InstituicaoCaridade encontrarInstituicaoPorNome(String nome) {
        for (int i = 0; i < quantidadeInstituicoes; i++) {
            if (instituicoes[i].getNome().equals(nome)) {
                return instituicoes[i];
            }
        }
        return null;
    }
}
