package models;

public class Voluntario {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;

    private static Voluntario[] voluntarios = new Voluntario[1000]; // Vetor para armazenar até 1000 voluntários
    private static int quantidadeVoluntarios = 0; // Contador de voluntários cadastrados
package models;

    /**
     * A classe Voluntario representa um voluntário que pode ajudar nas instituições de caridade.
     */
    public class Voluntario {
        private String nome;
        private String cpf;
        private String endereco;
        private String contato;

        private static Voluntario[] voluntarios = new Voluntario[1000]; // Vetor para armazenar até 1000 voluntários
        private static int quantidadeVoluntarios = 0; // Contador de voluntários cadastrados

        /**
         * Construtor para criar um novo voluntário.
         *
         * @param nome      Nome do voluntário.
         * @param cpf       CPF do voluntário.
         * @param endereco  Endereço do voluntário.
         * @param contato   Contato do voluntário.
         */
        public Voluntario(String nome, String cpf, String endereco, String contato) {
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.contato = contato;
        }

        // Getters e Setters

        /**
         * Obtém o nome do voluntário.
         *
         * @return Nome do voluntário.
         */
        public String getNome() {
            return nome;
        }

        /**
         * Define o nome do voluntário.
         *
         * @param nome Nome do voluntário.
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * Obtém o CPF do voluntário.
         *
         * @return CPF do voluntário.
         */
        public String getCpf() {
            return cpf;
        }

        /**
         * Define o CPF do voluntário.
         *
         * @param cpf CPF do voluntário.
         */
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        /**
         * Obtém o endereço do voluntário.
         *
         * @return Endereço do voluntário.
         */
        public String getEndereco() {
            return endereco;
        }

        /**
         * Define o endereço do voluntário.
         *
         * @param endereco Endereço do voluntário.
         */
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        /**
         * Obtém o contato do voluntário.
         *
         * @return Contato do voluntário.
         */
        public String getContato() {
            return contato;
        }

        /**
         * Define o contato do voluntário.
         *
         * @param contato Contato do voluntário.
         */
        public void setContato(String contato) {
            this.contato = contato;
        }

        // Métodos estáticos

        /**
         * Cadastra um novo voluntário.
         *
         * @param nome      Nome do voluntário.
         * @param cpf       CPF do voluntário.
         * @param endereco  Endereço do voluntário.
         * @param contato   Contato do voluntário.
         */
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

        /**
         * Lista todos os voluntários cadastrados.
         */
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

    // Construtor
    public Voluntario(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
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

    //Metodos
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
