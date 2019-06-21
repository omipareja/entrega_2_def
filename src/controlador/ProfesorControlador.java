/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author juan
 */
public class ProfesorControlador {
    
    
    private static ProfesorControlador instance;

    private ProfesorControlador() {
    }
    
    public static ProfesorControlador getInstane() {
        if (instance == null) {
            instance = new ProfesorControlador();
        }
        return instance;
    }
    
    public void guardarPrueba(String cadena){
        Archivos prueba = new Archivos();
        prueba.escribir(cadena);
    }
    
}
