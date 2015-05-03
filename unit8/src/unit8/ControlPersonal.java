package unit8;

import static java.lang.System.*;
import java.util.ArrayList;

/**
 * Clase que contendrá todos los atributos, constructores y los métodos propios 
 * de los objetos tipo "ControlPersonal".
 * @author Jesús Llorente Gutiérrez
 */
public class ControlPersonal {
    
    //-----ATRIBUTOS-----//
    
    private ArrayList<Persona> personas;
    
    //-----CONSTRUCTORES-----//
    
    /**
     * Constructor de ControlPersonal vacío.
     */
    private ControlPersonal(){
    
        personas = new ArrayList();
    }
    
    //-----METODOS-----//
    
    /**
     * Método que añade una persona al ArrayList de personas.
     * @param p --> Nueva Persona a añadir al ArrayList.
     */
    public void anyadirPersona(Persona p){
    
        personas.add(p);
    }
    
    /**
     * Método que muestra las personas y sus notas del ArrayList.
     */
    public void mostrarListado(){
    
        for(byte i = 0; i < personas.size(); i++){
        
            personas.get(i).mostrarListadoAsignaturasNota();
            out.println();
        }
    }
    
    /**
     * Método que ordena el ArrayList por el atributo "dni" de Persona.
     * He tenido que usar la insercción directa porque la solución con "Collections"
     * y "Comparator" no me funcionaba.
     */
    public void ordenarPorDni(){
    
        for(byte i = 1; i < personas.size(); i++){
            
            Persona aux;
            for(byte j = i; j > 0; j--){
                
                if(personas.get(j).getDni().compareTo(personas.get(j - 1).getDni()) < 1){
                    
                    aux = personas.get(j);
                    personas.set(j, personas.get(j - 1));
                    personas.set(j - 1, aux);
                }
            }
        }		
    }
    
    /**
     * Método que ordena el ArrayList por el atributo "nombre" de Persona.
     * He tenido que usar la insercción directa porque la solución con "Collections"
     * y "Comparator" no me funcionaba.
     */
    public void ordenarPorOrdenAlfabetico(){
    
        for(byte i = 1; i < personas.size(); i++){
            
            Persona aux;
            for(byte j = i; j > 0; j--){
                
                if(personas.get(j).getNombre().compareTo(personas.get(j - 1).getNombre()) < 1){
                    
                    aux = personas.get(j);
                    personas.set(j, personas.get(j - 1));
                    personas.set(j - 1, aux);
                }
            }
        }		
    }
}
