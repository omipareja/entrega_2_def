package controlador;

import Modelo.Prueba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author juan
 */
public class Archivos {
    
     private static Archivos instance;

    private Archivos() {
    }
    
    
      public static Archivos getInstance() {
        if (instance == null) {
            instance = new Archivos();
        }
        return instance;
    }

    public Prueba cargarPrueba() {
        Prueba prueba = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Examen.cad"))) {
            Object readObject = ois.readObject();
            if (readObject != null && readObject instanceof Prueba) {
                prueba = ((Prueba) readObject);
            }
        } catch (Exception ex) {
              System.out.println("Error al leer archivo: " + ex);
        }

        return prueba;
    }

    public void guardarPrueba(Prueba prueba) throws IOException {
        try {
            /*try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Examen.cad"))) {
            ois.writeObject(prueba);
            } catch (Exception ex) {
            System.out.println("Error al escribir archivo: " + ex);
            }*/
            
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Examen.cad"));
            ois.writeObject(prueba);
            ois.close();
        } catch (FileNotFoundException ex) {
        Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
