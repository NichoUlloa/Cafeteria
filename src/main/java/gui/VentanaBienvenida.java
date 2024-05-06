package gui;


import controller.CafeController;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.InternationalFormatter;

public class VentanaBienvenida extends Ventana{
    public static void main(String[] args) {
        VentanaBienvenida ventana = new VentanaBienvenida();
    }

    JLabel textoEncabezado;
    JButton botonAgregarCafe, botonDescontinuarCafe, botonVerCafes, botonSalir;

    public VentanaBienvenida() {
        super("Bienvenida", 500, 520);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonAgregarCafe();
        generarBotonDescontinuarCafe();
        generarBotonVerCafes();
        generarBotonSalir();

    }

    private void generarEncabezado() {
        super.generarJLabelEncabezado(this.textoEncabezado, "Bienvenido a la cafeteria", 130, 10, 300, 50);
    }

    private void generarBotonAgregarCafe() {
        this.botonAgregarCafe = super.generarBoton("Agregar Cafe", 150, 100, 200, 50);
        this.botonAgregarCafe.addActionListener(this);
        this.add(this.botonAgregarCafe);
    }

    private void generarBotonDescontinuarCafe() {
        this.botonDescontinuarCafe = super.generarBoton("Descontinuar Cafe", 150, 160, 200, 50);
        this.botonDescontinuarCafe.addActionListener(this);
        this.add(this.botonDescontinuarCafe);
    }

    private void generarBotonVerCafes() {
        this.botonVerCafes = super.generarBoton("Ver Cafes", 150, 220, 200, 50);
        this.botonVerCafes.addActionListener(this);
        this.add(this.botonVerCafes);
    }

    private void generarBotonSalir() {
        this.botonSalir = super.generarBoton("Salir", 150, 380, 200, 50);
        this.botonSalir.addActionListener(this);
        this.add(this.botonSalir);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregarCafe) {
            VentanaAgregarCafe ventanaAgregarCafe = new VentanaAgregarCafe();
            this.dispose();
        }
        if (e.getSource() == this.botonDescontinuarCafe) {
            DescontinuarCafe ventanaDescontinuarCafe = new DescontinuarCafe();
            this.dispose();
        }
        if (e.getSource() == this.botonVerCafes) {
            CafeController cafeController = new CafeController();
            String[][] cafes = new String[0][];
            try {
                cafes = cafeController.obtenerListaCafes();
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String[] columnas = {"Nombre", "Cantidad Gramos", "Cantidad Mililitros", "Tamanio"};
            VentanaTabla ventanaTabla = new VentanaTabla(cafes, columnas);
        }
        if (e.getSource() == this.botonSalir) {
            System.exit(0);
        }
    }


}

// ejemplo ventanaBienvenida
// public class VentanaBienvenida extends Ventana{
//
//    public static void main(String[] args) {
//        VentanaBienvenida ventana = new VentanaBienvenida();
//    }
//
//    private JLabel textoMenu;
//    private JButton botonRegistrarCarrera;
//    private JButton botonRegistrarEstudiante;
//    private JButton botonBuscarEstudiante;
//    private JButton botonSalida;
//
//    public VentanaBienvenida() {
//        super("INTRANET 2.0", 500, 520);
//        generarElementosVentana();
//    }
//
//    private void generarElementosVentana(){
//        generarMensajeMenu();
//        generarBotonRegistrarCarrera();
//        generarBotonRegistrarEstudiante();
//        generarBotonBuscarEstudiante();
//        generarBotonSalida();
//
//    }
//
//    private void generarMensajeMenu(){
//        String textoBienvenida = "BIENVENIDO A INTRANET 2.0";
//        super.generarJLabelEncabezado(textoMenu, textoBienvenida, 130, 10, 300, 50);
//    }
//
//    private void generarBotonRegistrarCarrera(){
//        botonRegistrarCarrera = super.generarBoton("Registrar Carrera", 150, 100, 200, 50);
//        botonRegistrarCarrera.addActionListener(this);
//        super.add(botonRegistrarCarrera);
//    }
//
//    private void generarBotonRegistrarEstudiante(){
//        botonRegistrarEstudiante = super.generarBoton("Registrar Estudiante", 150, 160, 200, 50);
//        botonRegistrarEstudiante.addActionListener(this);
//        super.add(botonRegistrarEstudiante);
//    }
//
//    private void generarBotonBuscarEstudiante(){
//        botonBuscarEstudiante = super.generarBoton("Buscar Estudiante", 150, 220, 200, 50);
//        botonBuscarEstudiante.addActionListener(this);
//        super.add(botonBuscarEstudiante);
//    }
//
//    private void generarBotonSalida(){
//        botonSalida = super.generarBoton("Salir", 150, 380, 200, 50);
//        botonSalida.addActionListener(this);
//        super.add(botonSalida);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == botonRegistrarCarrera){
//            VentanaRegistroCarrera ventanaRegistroCarrera = new VentanaRegistroCarrera();
//            this.dispose();
//        }
//        if(e.getSource() == this.botonRegistrarEstudiante){
//            try {
//                VentanaRegistroEstudiante ventanaRegistroEstudiante = new VentanaRegistroEstudiante();
//            } catch (ClassNotFoundException ex) {
//                ex.printStackTrace();
//            }
//            this.dispose();
//        }
//
//        if(e.getSource() == this.botonBuscarEstudiante){
//            try {
//                VentanaBusquedaEstudiante ventanaBusquedaEstudiante = new VentanaBusquedaEstudiante();
//            } catch (ClassNotFoundException ex) {
//                ex.printStackTrace();
//            }
//            this.dispose();
//        }
//        if(e.getSource() == botonSalida){
//            System.exit(0);
//        }
//    }
//
//
//
//
//
//
//
//}