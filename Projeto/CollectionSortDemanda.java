package Projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CollectionSortDemanda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Demanda> demandas = new ArrayList<>();

        System.out.println("Digite quantas demandas deseja inserir: ");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Digite os atributos da demanda " + (i + 1) + ":");
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

            demandas.add(new Demanda(tip, dised, diseq, custr, custim, prepr, regula, prejfisc, tempesp));
        }

        // Ordenar demandas por prioridade (decrescente)
        Collections.sort(demandas, new Comparator<Demanda>() {
            public int compare(Demanda d1, Demanda d2) {
                return Integer.compare(d2.calcularPrioridade(), d1.calcularPrioridade());
            }
        });

        System.out.println("Demandas ordenadas por prioridade:");
        for (Demanda demanda : demandas) {
            System.out.println(demanda);
        }

        scanner.close();
    }
}
