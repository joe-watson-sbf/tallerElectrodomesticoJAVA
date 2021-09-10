package com.sofkau.tallerElectrodomestico.domain;

public class Nevera extends Electrodomestico {
    private int capacidad;

    public Nevera(String consumo, String procedencia, int capacidad) {
        super(consumo, procedencia);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String getType() {
        return "Tipo: Nevera";
    }

    @Override
    public double precioBase() {
        double total = super.precioBase();
        int contador = 0;
        if(this.capacidad > 120) contador = (this.capacidad-120)/10;
        total += contador * ((super.precioBase() * 5)/100);
        return total;
    }

    @Override
    public String showReport() {
        return super.showReport() +
                "\nCapacidad: " + capacidad;
    }

    @Override
    public String toString() {
        return "Nevera{" +
                super.toString() +
                ", capacidad=" + capacidad +
                '}';
    }

}
