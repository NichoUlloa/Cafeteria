package gui;
import controller.CafeController;
import model.TamanioCafe;

import javax.swing.*;
import java.awt.event.ActionEvent;
public class VentanaAgregarCafe extends Ventana{

    public static void main(String[] args) {
        VentanaAgregarCafe ventana = new VentanaAgregarCafe();
    }

    private JButton botonAgregarCafe, botonRegresar;
    // // atributos
    //    private String nombreCafe;
    //    private int cantidadGramosCafe;
    //    private int getCantidadMililitrosAgua;
    //    private TamanioCafe tamanioCafe;
    //    private List<Ingrdientes> ingredientes;
    private JLabel textoEncabezado, textoNombreCafe, textoCantidadGramosCafe, textoCantidadMililitrosAgua, textoTamanioCafe;
    private JTextField campoNombreCafe, campoCantidadGramosCafe, campoCantidadMililitrosAgua;
    private JComboBox campoTamanioCafe;

    public VentanaAgregarCafe() {
        super("Agregar Cafe", 500, 520);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarCampoNombreCafe();
        generarCampoCantidadGramosCafe();
        generarCampoCantidadMililitrosAgua();
        generarCampoTamanioCafe();
        generarBotonAgregarCafe();
        generarBotonRegresar();
    }

    private void generarCampoNombreCafe() {
        String textoNombreCafe = "Nombre Cafe:";
        super.generarJLabel(this.textoNombreCafe, textoNombreCafe, 20, 50, 150, 20);
        this.campoNombreCafe = super.generarJTextField(200, 50, 250, 20);
        this.add(this.campoNombreCafe);
    }

    private void generarCampoCantidadGramosCafe() {
        String textoCantidadGramosCafe = "Cantidad Gramos Cafe:";
        super.generarJLabel(this.textoCantidadGramosCafe, textoCantidadGramosCafe, 20, 100, 150, 20);
        this.campoCantidadGramosCafe = super.generarJTextField(200, 100, 250, 20);
        this.add(this.campoCantidadGramosCafe);
    }

    private void generarCampoCantidadMililitrosAgua() {
        String textoCantidadMililitrosAgua = "Cantidad Mililitros Agua:";
        super.generarJLabel(this.textoCantidadMililitrosAgua, textoCantidadMililitrosAgua, 20, 150, 150, 20);
        this.campoCantidadMililitrosAgua = super.generarJTextField(200, 150, 250, 20);
        this.add(this.campoCantidadMililitrosAgua);
    }

    private void generarCampoTamanioCafe() {
        super.generarJLabel(this.textoTamanioCafe, "Tamanio Cafe:", 20, 200, 150, 20);
        this.campoTamanioCafe = super.generarListaDesplegable(model.TamanioCafe.values(), 200, 200, 250, 20);
        this.add(this.campoTamanioCafe);
    }

    private void generarBotonAgregarCafe() {
        String textoBoton = "Agregar Cafe";
        this.botonAgregarCafe = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonAgregarCafe);
        this.botonAgregarCafe.addActionListener(this);
    }

    private void generarBotonRegresar() {
        String textoBotonRegresar = "Regresar";
        this.botonRegresar = super.generarBoton(textoBotonRegresar, 275, 400, 150, 20);
        this.add(this.botonRegresar);
        this.botonRegresar.addActionListener(this);
    }

    // private boolean registrarCarrera() throws ClassNotFoundException {
    //        if(this.campoCodigoCarrera.getText().length()==0 || this.campoNombre.getText().length()==0 || this.campoSemestres.getText().length()==0){
    //            return false;
    //        }
    //        else{
    //            return CarreraController.añadirCarrera(this.campoNombre.getText(),
    //            this.campoCodigoCarrera.getText(),Integer.parseInt(this.campoSemestres.getText()));
    //
    //        }
    //    }


    private boolean agregarCafe() throws ClassNotFoundException {
        if(this.campoNombreCafe.getText().length()==0 || this.campoCantidadGramosCafe.getText().length()==0 || this.campoCantidadMililitrosAgua.getText().length()==0){
            return false;
        }
        else{
            return CafeController.agregarCafe(this.campoNombreCafe.getText(),Integer.parseInt(this.campoCantidadGramosCafe.getText()),Integer.parseInt(this.campoCantidadMililitrosAgua.getText()), TamanioCafe.valueOf(this.campoTamanioCafe.getSelectedItem().toString()));
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregarCafe) {
            try {
                if(agregarCafe()){
                    JOptionPane.showMessageDialog(this, "Cafe agregado");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error al agregar cafe");
                }
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
        }
        if (e.getSource() == botonRegresar) {
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
            this.dispose();
        }
    }




}
