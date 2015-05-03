package unit8;

/**
 * Clase que contendrá todos los atributos, constructores y los métodos propios 
 * de los objetos tipo "Asignatura".
 * @author Jesús Llorente Gutiérrez
 */
public class Asignatura {
    
    //-----ATRIBUTOS-----//
    
    private String nombre;
    private double nota;
    
    //-----CONSTRUCTORES-----//
    
    /**
     * Constructor parametrizado de la clase Asignatura.
     * @param nombre --> Nombre de la asignatura.
     */
    public Asignatura(String nombre){
    
        this.nombre = nombre;
    }
    
    //-----GETTERS-----//

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    
    //-----SETTERS-----//

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
