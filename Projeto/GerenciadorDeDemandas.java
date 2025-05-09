package Projeto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciadorDeDemandas {
    private List<Demanda> demandas;

    public GerenciadorDeDemandas() {
        this.demandas = new ArrayList<>();
    }

    public void adicionarDemanda(Demanda demanda) {
        demandas.add(demanda);
        System.out.println("Demanda adicionada com sucesso!");
        listarDemandas(); // Atualiza a lista viva
    }

    public void listarDemandas() {
        if (demandas.isEmpty()) {
            System.out.println("Nenhuma demanda cadastrada.");
            return;
        }

        System.out.println("Demandas cadastradas:");
        for (int i = 0; i < demandas.size(); i++) {
            System.out.println(i + " - " + demandas.get(i));
        }
    }

    public void ordenarDemandasPorPrioridade() {
        demandas = demandas.stream()
                .sorted(Comparator.comparingInt(Demanda::calcularPrioridade).reversed())
                .toList();

        System.out.println("Demandas ordenadas por prioridade com sucesso!");
        listarDemandas(); // Atualiza a lista viva
    }

    public void deletarDemanda(int index) {
        if (index >= 0 && index < demandas.size()) {
            demandas.remove(index);
            System.out.println("Demanda deletada com sucesso!");
            listarDemandas(); // Atualiza a lista viva
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }
}