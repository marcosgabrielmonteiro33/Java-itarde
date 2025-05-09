package Projeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDados {
    private static Scanner scanner = new Scanner(System.in);

    public static demanda capturarDemanda() {
        try {
            System.out.println("Digite os atributos da nova demanda:");
            System.out.println("Tipo:");
            int tip = scanner.nextInt();
            System.out.println("Distância da sede:");
            int dised = scanner.nextInt();
            System.out.println("Distância da equipe:");
            int diseq = scanner.nextInt();
            System.out.println("Custo do reparo:");
            int custr = scanner.nextInt();
            System.out.println("Custo do impacto:");
            int custim = scanner.nextInt();
            System.out.println("Pré-prioridade:");
            int prepr = scanner.nextInt();
            System.out.println("Regulamento:");
            int regula = scanner.nextInt();
            System.out.println("Prejuízo fiscal:");
            int prejfisc = scanner.nextInt();
            System.out.println("Tempo de espera:");
            int tempesp = scanner.nextInt();

            return new demanda(tip, dised, diseq, custr, custim, prepr, regula, prejfisc, tempesp);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira valores numéricos.");
            scanner.nextLine(); // Limpa o buffer
            return capturarDemanda(); // Tenta novamente
        }
    }
}