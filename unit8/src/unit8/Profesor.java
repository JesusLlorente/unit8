package unit8;

/**
 * Clase que contendrá todos los atributos, constructores y los métodos propios 
 * de los objetos tipo "Profesor" el cual es descendiente de "Persona".
 * @author Jesús Llorente Gutiérrez
 */
public class Profesor extends Persona{
    
    //-----CONSTRUCTORES-----//
    
    /**
     * Constructor parametrizado de la clase Profesor que llama al constructor
     * padre para inicializarse.
     * @param nombre --> Nombre del profesor.
     * @param dni --> DNI del profesor.
     */
    public Profesor(String nombre, String dni){
        super(nombre, dni);
    }
    
    //-----METODOS-----//
    
    /**
     * Método abstracto que comprueba si la persona es profesor o no. 
     * @return --> "true" si es profesor o "false" si no lo es.
     */
    @Override
    public boolean esProfesor(){
        return true;
    }
}
