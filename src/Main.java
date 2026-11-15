
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE BIBLIOTECA ===");

        // Dados do membro
        System.out.print("Nome do membro: ");
        String nome = entrada.nextLine();

        System.out.print("Cadastro valido? (true/false): ");
        boolean cadastroValido = entrada.nextBoolean();

        System.out.print("Quantidade de emprestimos ativos: ");
        int emprestimosAtivos = entrada.nextInt();

        System.out.print("Possui multa pendente? (true/false): ");
        boolean possuiMultaPendente = entrada.nextBoolean();

        System.out.print("Possui emprestimo atrasado? (true/false): ");
        boolean possuiEmprestimoAtrasado = entrada.nextBoolean();

        // Dados do exemplar
        System.out.print("Exemplar disponivel? (true/false): ");
        boolean disponivel = entrada.nextBoolean();

        System.out.print("Exemplar em boas condicoes? (true/false): ");
        boolean boasCondicoes = entrada.nextBoolean();

        // Verificacao das regras
        System.out.println("\n=== RESULTADO DA SOLICITACAO ===");

        if (cadastroValido && emprestimosAtivos < 3
                && disponivel && boasCondicoes
                && !possuiMultaPendente && !possuiEmprestimoAtrasado) {

            System.out.println("Emprestimo autorizado!");
            System.out.println("Membro: " + nome);
            System.out.println("Prazo de devolucao: 14 dias.");

        } else {

            System.out.println("Emprestimo nao autorizado.");

            if (!cadastroValido) {
                System.out.println("Motivo: cadastro invalido.");
            }

            if (emprestimosAtivos >= 3) {
                System.out.println("Motivo: limite de emprestimos atingido.");
            }

            if (!disponivel) {
                System.out.println("Motivo: exemplar indisponivel.");
            }

            if (!boasCondicoes) {
                System.out.println("Motivo: exemplar danificado.");
            }

            if (possuiMultaPendente) {
                System.out.println("Motivo: possui multa pendente.");
            }

            if (possuiEmprestimoAtrasado) {
                System.out.println("Motivo: possui emprestimo atrasado.");
            }
        }

        entrada.close();
    }
}
