package models;

import java.util.ArrayList;
import java.util.List;

public class InstituicaoCaridade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private List<Voluntario> voluntarios;
    private List<Doacao> historicoDoacoesRecebidas;

    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.voluntarios = new ArrayList<>();
        this.historicoDoacoesRecebidas = new ArrayList<>();
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

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    public void removerVoluntario(Voluntario voluntario) {
        this.voluntarios.remove(voluntario);
    }

    public List<Doacao> getHistoricoDoacoesRecebidas() {
        return historicoDoacoesRecebidas;
    }

    public void adicionarDoacaoRecebida(Doacao doacao) {
        this.historicoDoacoesRecebidas.add(doacao);
    }
}
