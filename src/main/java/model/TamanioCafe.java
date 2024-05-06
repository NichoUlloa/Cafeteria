package model;

public enum TamanioCafe {
    PEQUENO("Pequeño"), MEDIANO("Mediano"), GRANDE("Grande");

    private String tamanioCafe;

    private TamanioCafe(String tamanioCafe) {
        this.tamanioCafe = tamanioCafe;
    }

    public String getTamanioCafe() {
        return tamanioCafe;
    }
}
