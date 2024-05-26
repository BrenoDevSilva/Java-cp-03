import models.*;
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
                        String nome = scanner.nextInt();
                        System.out.println("cpf do doador:");
                        String cpf = scanner.nextInt();
                        System.out.println("endereco do doador:");
                        String endereco = scanner.nextInt();
                        System.out.println("contato do doador:");
                        String contato = scanner.nextInt();

                    case 2:
                        System.out.println("digite o nome do voluntario:");
                        String nome = scanner.nextInt();
                        System.out.println("cpf do voluntario:");
                        String cpf = scanner.nextInt();
                        System.out.println("endereco do voluntario:");
                        String endereco = scanner.nextInt();
                        System.out.println("contato do voluntrio:");
                        String contato = scanner.nextInt();
                        System.out.println("disponibilidade de horario:");
                        String disp = scanner.nextInt();
                        System.out.println("habilidades do voluntario:");
                        String habilidades = scanner.nextInt();

                    case 3:
                        System.out.println("digite o nome da instituição:");
                        String nome = scanner.nextInt();
                        System.out.println("cnpj da instituição:");
                        String cnpj = scanner.nextInt();
                        System.out.println("endereco da instituição:");
                        String endereco = scanner.nextInt();
                        System.out.println("contato da instituição:");
                        String contato = scanner.nextInt();
                        System.out.println("área de atuação:");
                        String areaAtuacao = scanner.nextInt();

                    default:
                        System.out.println("Opção inválida!");
                }
                break;
            case 2:
                System.out.println("digite o nome do doador:");
                String nome = scanner.nextInt();
                System.out.println("digite a qual instituição você deseja mandar:");
                String intituicao = scanner.nextInt();
                System.out.println("deseja doar um valor ou um material?");
                String tipo = scanner.nextInt();
                if tipo == "valor" {
                    System.out.println("digite o valor:");
                    int valor = scanner.nextInt();
                }
                else {}
                System.out.println("digite a data da doação");
                String data = scanner.nextInt();

            }

        }

        scanner.close();
    }

    // Método para verificar se o texto contém caracteres inválidos (números e caracteres acentuados)
    private static boolean verificarCaracteresInvalidos(String texto) {
        return texto.matches(".*[áàãâéèêíìîóòõôúùûç\\d].*");
    }
}
