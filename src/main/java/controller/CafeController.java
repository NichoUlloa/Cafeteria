package controller;

import model.Cafe;
import model.TamanioCafe;
import model.data.dao.CafeDAO;
import model.data.DBConnector;
import model.data.DBGenerator;
import org.jooq.DSLContext;

public class CafeController {

    private static String nombreDataBase = "cafeteria";

    // agregarCafe
    public static boolean agregarCafe(String nombreCafe, int cantidadGramosCafe, int cantidadMililitrosAgua, TamanioCafe tamanioCafe) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
        if(!CafeDAO.validarExistenciaCafe(query,"nombre_cafe",nombreCafe)){
            Cafe cafe = new Cafe(nombreCafe,cantidadGramosCafe,cantidadMililitrosAgua, tamanioCafe);
            CafeDAO.agregarCafe(query,cafe);
            DBConnector.closeConnection();
            return true;
        }
        else{
            DBConnector.closeConnection();
            return false;
        }
    }

    // mostrarCafesPorTamanio
    public static String[][] mostrarCafesPorTamanio(String tamanio) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
        String[][] datosCafes = CafeDAO.obtenerCafesTamanio(query,tamanio);
        DBConnector.closeConnection();
        return datosCafes;
    }

    // mostrarCafesPorNombre
    public static String[][] mostrarCafesPorNombre(String nombre) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
        String[][] datosCafes = CafeDAO.obtenerCafeNombre(query,nombre);
        DBConnector.closeConnection();
        return datosCafes;
    }

    // mostrarlistaCafes
    public static String[][] obtenerListaCafes() throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
        String[][] datosCafes = CafeDAO.obtenerListaCafes(query);
        DBConnector.closeConnection();
        return datosCafes;
    }



}
// ejemplo metodos
//  public static boolean registrarEstudiante(String nombre, String rut, String matricula, String codigoCarrera) throws ClassNotFoundException {
//        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
//        if(!EstudianteDAO.validarExistenciaEstudiante(query,"rut",rut)){
//            Carrera carrera =CarreraDAO.buscarCarrera(query,codigoCarrera);
//            Estudiante estudiante= new Estudiante(rut,nombre,matricula,carrera);
//            EstudianteDAO.agregarEstudiante(query,estudiante);
//            DBConnector.closeConnection();
//            return true;
//        }
//        else{
//            DBConnector.closeConnection();
//            return false;
//        }
//    }
//    public static String[][] mostrarEstudiantesPorCarrera(String codigo) throws ClassNotFoundException {
//        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
//        String[][] datosEstudiantes= EstudianteDAO.obtenerEstudiantesCursoCodigo(query,codigo);
//        DBConnector.closeConnection();
//        return datosEstudiantes;
//    }
//    public static String[][] mostrarEstudiantesPorNombre(String codigo, String nombre) throws ClassNotFoundException {
//        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
//        String[][] datosEstudiantes = EstudianteDAO.obtenerEstudiantesCursoNombre(query,nombre,codigo);
//        DBConnector.closeConnection();
//        return datosEstudiantes;
//    }
//
//    // mostrarEstudiantesPorRut
//    public static String[][] mostrarEstudiantesPorRut(String rut) throws ClassNotFoundException {
//        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
//        String[][] datosEstudiantes = EstudianteDAO.obtenerEstudiantesCursoRut(query,rut);
//        DBConnector.closeConnection();
//        return datosEstudiantes;
//    }
// public static boolean añadirCarrera(String nombreCarrera, String codigoCarrera, int cantSemestres) throws ClassNotFoundException {
//        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
//        if(!CarreraDAO.validarExistenciaCarrera(query,"codigo",codigoCarrera)){
//            Carrera carrera = new Carrera(nombreCarrera,codigoCarrera,cantSemestres);
//            CarreraDAO.agregarCarrera(query,carrera);
//            DBConnector.closeConnection();
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static Object[] getCodigoCarreras() throws ClassNotFoundException {
//        DSLContext query = DBGenerator.conectarBD(nombreDataBase);
//        Object[] carreras = CarreraDAO.getCodigoCarreras(query);
//        DBConnector.closeConnection();
//        return carreras;
//    }