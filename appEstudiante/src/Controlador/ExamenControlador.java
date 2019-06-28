/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Pregunta;
import Modelo.Prueba;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class ExamenControlador {
    
   private static ExamenControlador instance;

    private ExamenControlador() {
       // prueba = ArchivoControlador.getInstance().cargarPrueba();
    }

    public static ExamenControlador getInstance() {
        if (instance == null) {
            instance = new ExamenControlador();
        }
        return instance;
    }
    
    
   private List<String> resp_abiertas;
    private List<Pregunta> preguntas;
   private Boolean[] respuestas_est=new Boolean[4];
    private Boolean[] respuestas_pro=new Boolean[4];
    private int nota;
    private String descripcion1;
    private int porcentaje1=0;
    Prueba prueba= new Prueba(preguntas);
    

    public List<Pregunta> getContactos() {
        return preguntas;
        
    }

    
   
    
    
    public Prueba guardarPruebaDesdeArchivo(){
        
    
    prueba=ArchivoControlador.getInstance().cargarPrueba();
    preguntas=prueba.getPreguntas();
    descripcion1=prueba.getDescripcion();
    return prueba;
    
    }
    
    
    
    public void obtenerRespuestasEstudiante(Boolean[] res){
        
        System.out.println(res[0]);
        respuestas_est=res;
        
    
    }
    
    
    
   
    
    // Este metodo si no es muy entendible se encarga de comparar las respuestas de una pregunta multiple y dar una nota parcial
    
    public void compararRespuestasNota(){
        
        if(respuestas_pro[0]==respuestas_est[0]&& respuestas_pro[1]==respuestas_est[1]&&  respuestas_pro[2]==respuestas_est[2]&& respuestas_pro[3]==respuestas_est[3]){
        this.nota=(nota+((5*porcentaje1)/100));
        
            System.out.println("La nota es"+nota);
        }
        else{
        
            System.out.println(":..........");}
    }
    
    
    public void obtenerRespuestasProfesor(Boolean[] res, int porcentaje){
    
    respuestas_pro=res;
    porcentaje1=porcentaje;
    }
    
    public void agregarRespList(String respuesta_list){
    
    this.resp_abiertas.add(respuesta_list);
    }
    
    public void subirRespuestasArch(){
    
    ArchivoControlador.getInstance().subirFinal(resp_abiertas);
    }
    
    
    
    
    }
    
