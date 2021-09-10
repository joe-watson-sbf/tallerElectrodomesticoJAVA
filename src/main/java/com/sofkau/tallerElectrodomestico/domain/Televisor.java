package com.sofkau.tallerElectrodomestico.domain;

public class Televisor extends Electrodomestico {
    private double pulgadas;
    private boolean tdt;

    public Televisor(String consumo, String procedencia, double pulgadas, boolean tdt) {
        super(consumo, procedencia);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String getType() {
        return "Tipo: Televisor";
    }

    @Override
    public double precioBase() {
        double total = super.precioBase();
        if(pulgadas>40) total += (super.precioBase() * 30)/100;
        if(isTdt()) total += 250000;
        return total;
    }

    @Override
    public String showReport() {
        return super.showReport() +
                "\nPulgadas: " + pulgadas +
                "\nTDT: " + isTdt();
    }

    @Override
    public String toString() {
        return "Televisor{" +
                super.toString() +
                ", pulgadas=" + pulgadas +
                ", tdt=" + tdt +
                '}';
    }
}
