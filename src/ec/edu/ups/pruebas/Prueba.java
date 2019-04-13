/*
 *
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.Empleados;
import ec.edu.ups.clases.ProfesorContratado;
import ec.edu.ups.clases.ProfesorSustituto;
import ec.edu.ups.clases.Taxista;




/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Interfaz----------
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
////////////////////////////////////////////////////////////////////////////////
    //Clase EmpleadoAsalariado
        EmpleadoAsalariado empleadoasalariado = new EmpleadoAsalariado("Juan","0302654875",36,"Hombre");
    
////////////////////////////////////////////////////////////////////////////////
    //Clase Taxista
        Taxista taxista = new Taxista("Pedro","0102065894",20,"Hombre");
////////////////////////////////////////////////////////////////////////////////
    //Clase Empleados es la clase padre 1 
////////////////////////////////////////////////////////////////////////////////
    //Clase Persona es la clase abuelo
////////////////////////////////////////////////////////////////////////////////
    //Clase Profesor es la clase padre 2 
////////////////////////////////////////////////////////////////////////////////
    //Clase ProfesorContratado
        ProfesorContratado profesorcontra = new ProfesorContratado("Marcelo","0103265984",22,"Hombre");
////////////////////////////////////////////////////////////////////////////////
    //Clase ProfesorSustituto
        ProfesorSustituto profesorsus = new ProfesorSustituto("Ana","0105629845",24,"Mujer");
////////////////////////////////////////////////////////////////////////////////
    //Relacion entre Taxista y Empleados
       
        
        
}
}
