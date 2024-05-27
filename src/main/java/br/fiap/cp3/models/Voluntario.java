package br.fiap.cp3.models;

public class Voluntario {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;

    private static Voluntario[] voluntarios = new Voluntario[1000];
    private static int quantidadeVoluntarios = 0;

    public Voluntario(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
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

    public static void cadastrarVoluntario(String nome, String cpf, String endereco, String contato) {
        if (quantidadeVoluntarios < voluntarios.length) {
            Voluntario novoVoluntario = new Voluntario(nome, cpf, endereco, contato);
            voluntarios[quantidadeVoluntarios] = novoVoluntario;
            quantidadeVoluntarios++;
            System.out.println("Voluntário cadastrado com sucesso.");
        } else {
            System.out.println("Capacidade máxima de voluntários atingida.");
        }
    }

    public static void listarVoluntarios() {
        if (quantidadeVoluntarios == 0) {
            System.out.println("Nenhum voluntário cadastrado.");
        } else {
            for (int i = 0; i < quantidadeVoluntarios; i++) {
                Voluntario voluntario = voluntarios[i];
                System.out.println("Nome: " + voluntario.getNome() + ", CPF: " + voluntario.getCpf() + ", Endereço: " + voluntario.getEndereco() + ", Contato: " + voluntario.getContato());
            }
        }
    }
}
