/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Pregunta;
import Modelo.Prueba;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author juan
 */

public class ArchivoControlador{

    
    private static ArchivoControlador instance;

    private ArchivoControlador() {
    }

    public static ArchivoControlador getInstance() {
        if (instance == null) {
            instance = new ArchivoControlador();
        }
        return instance;
    }
    
    
    

   
   
   public Prueba cargarPrueba() {
       List<Pregunta> preg2=new ArrayList<>();
       Prueba prueba=new Prueba(preg2);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Carpeta personal/Escritorio/progra/entrega_2_def"))) {
            
                Object readObject = ois.readObject();
                if (readObject != null && readObject instanceof Prueba) {
                    prueba=((Prueba)readObject);
                   
                
                }
      } catch (Exception ex) {
            
           System.err.println("Error al leer archivo: " + ex);
           ex.printStackTrace();
        }
        System.out.println(""+prueba.getDescripcion());
        return prueba;
    }
   
   public void subirFinal(List<String> resp){
   
   try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("respuestas.cad"))) {
            for (String respuesta : resp) {
                ois.writeObject(respuesta);
            }
        } catch (Exception ex) {
            System.err.println("Error al escribir archivo: " + ex);
        }
       
   }
   
   
}