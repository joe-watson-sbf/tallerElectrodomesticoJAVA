package com.sofkau.tallerElectrodomestico.domain;

public class Electrodomestico implements StrategyI {
    private String consumo;
    private String procedencia;

    public Electrodomestico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    private double precioConsumo() {
        switch (this.consumo.toLowerCase().trim()) {
            case "a":
                return 450000;
            case "b":
                return 350000;
            case "c":
                return 250000;
            default:
                return 0;
        }
    }

    private double precioProcedencia() {
        switch (this.procedencia.toLowerCase().trim()) {
            case "nacional":
                return 250000;
            case "importado":
                return 350000;
            default:
                return 0;
        }
    }

    public String getType(){return "Tipo: Electrodomestico General";}

    public double precioBase(){
        return precioProcedencia() + precioConsumo();
    }

    @Override
    public Electrodomestico grabarElectrodomestico() {
        return this;
    }

    @Override
    public String showReport() {
        return  getType() +
                "\nConsumo: " + consumo +
                "\nProcedencia: " + procedencia +
                "\nPrecio: " + precioBase();
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "consumo='" + consumo + '\'' +
                ", procedencia='" + procedencia;
    }
}
