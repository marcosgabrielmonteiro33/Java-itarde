package Projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GerenciadorDeDemandas gerenciador = new GerenciadorDeDemandas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1- Criar demanda");
            System.out.println("2- Listar demandas");
            System.out.println("3- Ordenar demandas por prioridade");
            System.out.println("4- Deletar demanda");
            System.out.println("5- Sair");

            System.out.println("Digite sua opção: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    demanda novaDemanda = EntradaDeDados.capturarDemanda();
                    gerenciador.adicionarDemanda(novaDemanda);
                    break;
                case 2:
                    gerenciador.listarDemandas();
                    break;
                case 3:
                    gerenciador.ordenarDemandasPorPrioridade();
                    break;
                case 4:
                    gerenciador.listarDemandas();
                    System.out.println("Digite o índice da demanda que deseja deletar:");
                    int index = scanner.nextInt();
                    gerenciador.deletarDemanda(index);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
