package tp7;

public class Colegio {

    public static void main(String[] args) {
        
        Materia inglesUno = new Materia(1, "Ingles I", 1);
        Materia matematicasUno = new Materia(2, "Matematicas I", 1);
        Materia laboratorioUno = new Materia(3, "Laboratorio 1", 1);

        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");

        
        lopez.agregarMateria(inglesUno);
        lopez.agregarMateria(matematicasUno);
        lopez.agregarMateria(laboratorioUno);
        
        
        martinez.agregarMateria(inglesUno);
        martinez.agregarMateria(matematicasUno);
        martinez.agregarMateria(laboratorioUno);
        martinez.agregarMateria(laboratorioUno);
        //martinez.agregarMateria(inglesUno);
        System.out.println(martinez.agregarMateria(inglesUno));
        System.out.println("Lopez: " + lopez.cantindadMaterias());
        System.out.println("Martinez: " + martinez.cantindadMaterias());

    }
    
}
