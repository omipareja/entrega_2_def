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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gianlucasorem
 */
public class Prueba implements Serializable{
    private static final long serialVersionUID = 155542556245L;
    
    private String descripcion;
    
    private List <Pregunta> preguntas;
   

    public Prueba(List<Pregunta> preguntas) {
        
        this.preguntas=preguntas;
        
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }
    
    
    
    
}

