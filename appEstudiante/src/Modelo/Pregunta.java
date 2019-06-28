/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juan
 */
import java.io.Serializable;

/**
 *
 * @author gianlucasorem
 */
public class Pregunta implements Serializable{
    private static final long serialVersionUID = 255542556245L;
    
    private int numero;
    private int porcentaje;
    private String enunciado;

    public Pregunta(int porcentaje, String enunciado) {
        
        int x=0;
        this.porcentaje=porcentaje;
        this.enunciado=enunciado;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public String getEnunciado() {
        return enunciado;
    }
    
    
    
    
}
    