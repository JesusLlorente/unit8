package unit8;

import static java.lang.System.*;
import java.util.ArrayList;

/**
 * Clase que contendrá todos los atributos, constructores y los métodos propios 
 * de los objetos tipo "Persona".
 * @author Jesús Llorente Gutiérrez
 * @version 1.0
 */
public abstract class Persona {

    //-----ATRIBUTOS-----//
    
    protected String nombre;
    protected String dni;
    protected ArrayList<Asignatura> asignaturas;
    
    //-----CONSTRUCTORES-----//
    
    /**
     * Constructor parametrizado de la clase Persona.
     * @param nombre --> Nombre de la persona.
     * @param dni --> DNI de la persona.
     */
    public Persona(String nombre, String dni){
    
        this.nombre = nombre;
        this.dni = dni;
        asignaturas = new ArrayList();
    }
    
    //-----GETTERS-----//

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    
    //-----SETTERS-----//

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    //-----METODOS-----//
    
    /**
     * Método que añade una asignatura al ArrayList de asignaturas.
     * @param a --> Nueva Asignatura a añadir al ArrayList.
     */
    public void anyadirAsignatura(Asignatura a){
    
        asignaturas.add(a);
    }
    
    /**
     * Método abstracto que comprueba si la persona es profesor o no. 
     * @return --> "true" si es profesor o "false" si no lo es.
     */
    public abstract boolean esProfesor();
    
    /**
     * Método que muestra el nombrte de la persona, las asignaturas que
     * cursa y su nota.
     */
    public void mostrarListadoAsignaturasNota(){
    
        out.println("Nombre: " + nombre);
        out.println("----------------------------------------");
        for(byte i = 0; i < asignaturas.size(); i++){
        
            out.println(asignaturas.get(i).getNombre() + " " + asignaturas.get(i).getNota());
        }
    }
    
    /**
     * Método que ordena el ArrayList por el atributo "nombre" de Asignatura.
     * He tenido que usar la insercción directa porque la solución con "Collections"
     * y "Comparator" no me funcionaba.
     */
    public void ordenarPorAsignatura(){
    
        for(byte i = 1; i < asignaturas.size(); i++){
            
            Asignatura aux;
            for(byte j = i; j > 0; j--){
                
                if(asignaturas.get(j).getNombre().compareTo(asignaturas.get(j - 1).getNombre()) < 1){
                    
                    aux = asignaturas.get(j);
                    asignaturas.set(j, asignaturas.get(j - 1));
                    asignaturas.set(j - 1, aux);
                }
            }
        }		
    }
    
    /**
     * Método que ordena el ArrayList por el atributo "nota" de Asignatura.
     * He tenido que usar la insercción directa porque la solución con "Collections"
     * y "Comparator" no me funcionaba.
     */
    public void ordenarPorNota(){
    
        for(byte i = 1; i < asignaturas.size(); i++){
            
            Asignatura aux;
            for(byte j = i; j > 0; j--){
                
                if(asignaturas.get(j).getNota() > asignaturas.get(j - 1).getNota()){
                    
                    aux = asignaturas.get(j);
                    asignaturas.set(j, asignaturas.get(j - 1));
                    asignaturas.set(j - 1, aux);
                }
            }
        }		
    }
}
