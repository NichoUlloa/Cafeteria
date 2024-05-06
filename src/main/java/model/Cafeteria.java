package model;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    // atributos
    private String nombreCafeteria;
    private String direccionCafeteria;
    private List<RedSocial> redesSociales;
    private List<Cafe> cafesAVenta;

    // constructor
    public Cafeteria() {
        this.nombreCafeteria = nombreCafeteria;
        this.direccionCafeteria = direccionCafeteria;
        this.redesSociales = new ArrayList<RedSocial>();
        this.cafesAVenta = new ArrayList<Cafe>();
    }

    // getters
    public String getNombreCafeteria() {
        return nombreCafeteria;
    }

    public String getDireccionCafeteria() {
        return direccionCafeteria;
    }

    public List<RedSocial> getRedesSociales() {
        return redesSociales;
    }

    public List<Cafe> getCafes() {
        return cafesAVenta;
    }

    @Override
    public String toString() {
        return "Cafeteria [nombreCafeteria=" + nombreCafeteria + ", direccionCafeteria=" + direccionCafeteria
                + ", redesSociales=" + redesSociales + ", cafes=" + cafesAVenta + "]";
    }
}
