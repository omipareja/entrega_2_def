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


import Modelo.Pregunta;
import Modelo.Pregunta_cerrada;
import Modelo.Prueba;
import java.util.ArrayList;
import java.util.List;

public class ProfesorControlador {
    
    
    private static ProfesorControlador instance;

    private ProfesorControlador() {
    }
    
    public static ProfesorControlador getInstance() {
        if (instance == null) {
            instance = new ProfesorControlador();
        }
        return instance;
    }
    
     private List<Pregunta> preguntas;
    private Prueba prueba = new Prueba();

    public void agregarPreguntaAbierta(String enunciado, int valor) {
        int numero;
        if (preguntas== null) {
            preguntas = new ArrayList<>();
            numero = 1;
        }
        else
            numero = preguntas.size() + 1;
        Pregunta pregunta = new Pregunta(numero, valor, enunciado);
        preguntas.add(pregunta);

    }

    public void agregarPreguntaCerrada(String enunciado, int valor, List<String> respuesta, boolean[] solucion) {
        int numero; 
        if (preguntas == null) {
            preguntas = new ArrayList<>();
            numero = 1;
        }
        else{
            numero = preguntas.size() + 1;
        }

        Pregunta_cerrada pregunta = new Pregunta_cerrada(numero, valor, enunciado, respuesta, solucion);
        preguntas.add(pregunta);
    }

    public void agregarDescripcion(String descripcion){
        prueba.setDescripcion(descripcion);
    }

    public void guardarPruebaArchivo(){
        prueba.setPreguntas(preguntas);
        Archivos.getInstance().guardarPrueba(prueba);
    }



}
    

