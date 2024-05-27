import models;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicialização do objeto Scanner para entrada de dados

        // Solicitação da opção desejada ao usuário
        System.out.println("1.cadastrar");
        System.out.println("2.fazer uma doação");
        System.out.println("3.visualizar");
        int opcao = scanner.nextInt(); // Leitura da opção escolhida pelo usuário
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
            case 1:
                System.out.println("o que deseja cadstrar?");
                System.out.println("1.doadores");
                System.out.println("2.voluntarios");
                System.out.println("3.intituições de caridade");
                int cOption = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (cOption) {
                    case 1:
                        System.out.println("digite o nome do doador:");
                        String nome = scanner.nextString();
                        System.out.println("cpf do doador:");
                        String cpf = scanner.nextLine();
                        System.out.println("endereco do doador:");
                        String endereco = scanner.nextLine();
                        System.out.println("contato do doador:");
                        String contato = scanner.nextLine();
                        Doador.cadastrarDoador(nome,cpf,endereco,contato);
                    case 2:
                        System.out.println("digite o nome do voluntario:");
                        String nome = scanner.nextString();
                        System.out.println("cpf do voluntario:");
                        String cpf = scanner.nextString();
                        System.out.println("endereco do voluntario:");
                        String endereco = scanner.next();
                        System.out.println("contato do voluntrio:");
                        String contato = scanner.nextLine();
                        System.out.println("disponibilidade de horario:");
                        String disp = scanner.nextLine();
                        System.out.println("habilidades do voluntario:");
                        String habilidades = scanner.nextLine();
                        Voluntario.cadastrarVoluntario(nome,cpf,endereco,contato,disp,habilidades);
                    case 3:
                        System.out.println("digite o nome da instituição:");
                        String nome = scanner.nextLine();
                        System.out.println("cnpj da instituição:");
                        String cnpj = scanner.nextLine();
                        System.out.println("endereco da instituição:");
                        String endereco = scanner.nextLine();
                        System.out.println("contato da instituição:");
                        String contato = scanner.nextLine();
                        System.out.println("área de atuação:");
                        String areaAtuacao = scanner.nextLine();
                        InstituicaoCaridade.cadastrarInstituicao(nome,cnpj,endereco,contato,areaAtuacao);
                    default:
                        System.out.println("Opção inválida!");
                }
                break;
            case 2:
                System.out.println("digite o nome do doador:");
                String nome = scanner.nextLine();
                System.out.println("digite a qual instituição você deseja mandar:");
                String instituicao = scanner.nextLine();
                System.out.println("deseja doar um valor ou um material?");
                String tipo = scanner.nextLine();
                if tipo == "valor" {
                    System.out.println("digite o valor:");
                    int valor = scanner.nextLine();
                    System.out.println("digite a data da doação");
                    String data = scanner.nextLine();
                    Doacao.cadastrarDoacao(nome, instituicao, tipo, valor, data)
                }else{
                    System.out.println("Agende com a institução sua doação");
                }


            }

        }

        scanner.close();
    }