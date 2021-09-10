package com.sofkau.tallerElectrodomestico.context;

import com.sofkau.tallerElectrodomestico.domain.Electrodomestico;
import com.sofkau.tallerElectrodomestico.domain.StrategyI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AppElectrodomestico {

    private final StrategyI strategyI;

    public AppElectrodomestico(StrategyI strategyI) {
        this.strategyI = strategyI;
    }

    public void guabar(List<Electrodomestico> lista){
        lista.add(strategyI.grabarElectrodomestico());
    }

    public void imprimirReport(List<Electrodomestico> lista){
        System.out.println("\n======= REPORTE =======\n");
        for (Electrodomestico electrodomestico : lista)
            System.out.println("\n"+ electrodomestico.showReport() +"\n");
        System.out.println("\nPrecio total de todos los productos: "+ getPrecioTodo(lista) +"\n");
    }

    private double getPrecioTodo(List<Electrodomestico> lista){
        return lista.stream()
                .mapToDouble(Electrodomestico::precioBase)
                .sum();
    }

}
