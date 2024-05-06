package model;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    // atributos
    private String nombreCafe;
    private int cantidadGramosCafe;
    private int getCantidadMililitrosAgua;
    private TamanioCafe tamanioCafe;
    private List<Ingrdientes> ingredientes;

    // constructor
    public Cafe(String nombreCafe, int cantidadGramosCafe, int getCantidadMililitrosAgua, TamanioCafe tamanioCafe) {
        this.nombreCafe = nombreCafe;
        this.cantidadGramosCafe = cantidadGramosCafe;
        this.getCantidadMililitrosAgua = getCantidadMililitrosAgua;
        this.tamanioCafe = tamanioCafe;
        this.ingredientes = new ArrayList<Ingrdientes>();
    }

    // getters
    public String getNombreCafe() {
        return nombreCafe;
    }
    public int getCantidadGramosCafe() {
        return cantidadGramosCafe;
    }
    public int getCantidadMililitrosAgua() {
        return getCantidadMililitrosAgua;
    }
    public TamanioCafe getTamanioCafe() {
        return tamanioCafe;
    }
    public List<Ingrdientes> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Cafe [nombreCafe=" + nombreCafe + ", cantidadGramosCafe=" + cantidadGramosCafe + ", cantidadMililitrosAgua="
                + getCantidadMililitrosAgua + ", tamanioCafe=" + tamanioCafe + ", ingredientes=" + ingredientes + "]";
    }
}
