package unit8;

/**
 * Clase que contendrá todos los atributos, constructores y los métodos propios 
 * de los objetos tipo "Alumno" el cual es descendiente de "Persona".
 * @author Jesús Llorente Gutiérrez
 */
public class Alumno extends Persona{
    
    //-----CONSTRUCTORES-----//
    
    /**
     * Constructor parametrizado de la clase Alumno que llama al constructor
     * padre para inicializarse.
     * @param nombre --> Nombre del alumno.
     * @param dni --> DNI del alumno.
     */
    public Alumno(String nombre, String dni){
        super(nombre, dni);
    }
    
    //-----METODOS-----//
    
    /**
     * Método abstracto que comprueba si la persona es profesor o no. 
     * @return --> "true" si es profesor o "false" si no lo es.
     */
    @Override
    public boolean esProfesor(){
        return false;
    }
}
