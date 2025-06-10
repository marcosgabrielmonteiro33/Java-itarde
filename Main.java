package Projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeDemandas gerenciador = new GerenciadorDeDemandas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1- Criar demanda");
            System.out.println("2- Listar demandas");
            System.out.println("3- Sair");

            System.out.print("Digite sua opção: ");
            int op = capturarValor(scanner);


            if (op == 1) {
                criarDemanda(scanner, gerenciador);
            } else if (op == 2) {
                gerenciador.listarDemandas();
            } else if (op == 3) {
                System.out.println("Saindo...");
                scanner.close();
                return;
            } else {
                System.out.println("Opção inválida! Escolha entre 1, 2 ou 3.");
            }
        }
    }

    private static int capturarValor(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Digite um número.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void criarDemanda(Scanner scanner, GerenciadorDeDemandas gerenciador) {
        System.out.println("Digite os atributos da nova demanda:");

        int tipo = capturarValor(scanner, "Tipo (1-Urgente, 2-Crítico, 3-Normal): ");
        int distanciaDaSede = capturarValor(scanner, "Distância da sede: ");
        int distanciaDaEquipe = capturarValor(scanner, "Distância da equipe: ");
        int custoReparo = capturarValor(scanner, "Custo do reparo: ");
        int custoImpacto = capturarValor(scanner, "Custo do impacto: ");
        int prePrioridade = capturarValor(scanner, "Pré-prioridade: ");
      
        int prejuizoFiscal = capturarValor(scanner, "Prejuízo fiscal: ");
        int tempoEspera = capturarValor(scanner, "Tempo de espera: ");

        Demanda novaDemanda = new Demanda(tipo, distanciaDaSede, distanciaDaEquipe, custoReparo,
                custoImpacto, prePrioridade, prejuizoFiscal, tempoEspera);

        boolean emAndamento = capturarBoolean(scanner, "Adicionar à fila de andamento? (true/false): ");
        gerenciador.adicionarDemanda(novaDemanda, emAndamento);
    }

    private static int capturarValor(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Digite um número.");
            scanner.next();
            System.out.print(mensagem);
        }
        return scanner.nextInt();
    }

    private static boolean capturarBoolean(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        while (true) {
            String entrada = scanner.next().trim().toLowerCase();
            if (entrada.equals("true")) return true;
            if (entrada.equals("false")) return false;
            System.out.println("❌ Entrada inválida! Digite apenas 'true' ou 'false'.");
        }
    }
}