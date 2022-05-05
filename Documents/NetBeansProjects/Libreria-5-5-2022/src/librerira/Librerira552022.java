/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerira;

import java.util.ResourceBundle.Control.AutorData;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import library5522.Modelo.Autor;
import librerira.Modelo.Conexion;

/**
 *
 * @author Admin
 */
public class Librerira552022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Conexion conexion=new Conexion();
            AutorData ad= new AutorData(conexion);
            
            Autor autor=new Autor("Saez","Juan", LocalDate.of(1972, 02,22));
            ad.guardarAutor(autor);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Librerira552022.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
