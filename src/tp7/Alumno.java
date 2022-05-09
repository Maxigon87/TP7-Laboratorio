
package tp7;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author NEXO-Max
 */
public class Alumno {
    private int legajo;

    private String apellido;

    private String nombre;

    private HashSet<Materia> materiasAl = new HashSet <>();

    public Alumno(int p_legajo, String p_apellido, String p_nombre) {
        legajo=p_legajo;
        apellido=p_apellido;
        nombre=p_nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo=legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void agregarMateria(Materia m) {
        if(materiasAl.add(m) == true){
            JOptionPane.showMessageDialog(null, "Alumno Inscripto");
        }else {
            JOptionPane.showMessageDialog(null, "El alumno ya esta inscripto");
        }
    }
    
    public int cantindadMaterias() {
        return materiasAl.size();
    }
    
    
}

