package com.sofkau.tallerElectrodomestico;

import com.sofkau.tallerElectrodomestico.context.AppElectrodomestico;
import com.sofkau.tallerElectrodomestico.domain.Electrodomestico;
import com.sofkau.tallerElectrodomestico.domain.Nevera;
import com.sofkau.tallerElectrodomestico.domain.Televisor;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static List<Electrodomestico> lista = new ArrayList<>();
    public static void main(String[] args) {

        AppElectrodomestico appElectrodomestico;

        appElectrodomestico = new AppElectrodomestico(
                new Televisor("A", "nacional", 20, false)
        );
        // save Televisor
        appElectrodomestico.guabar(lista);

        appElectrodomestico = new AppElectrodomestico(
                new Electrodomestico("a", "nacional")
        );
        // save Electrodomestico General
        appElectrodomestico.guabar(lista);


        appElectrodomestico = new AppElectrodomestico(
                new Nevera("a", "nacional", 70)
        );
        // save Nevera
        appElectrodomestico.guabar(lista);

        appElectrodomestico.imprimirReport(lista);

    }
}
