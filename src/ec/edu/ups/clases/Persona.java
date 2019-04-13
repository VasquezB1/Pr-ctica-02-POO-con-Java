/*
 * 
 */
package ec.edu.ups.clases;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Abuelo----------
 */
public class Persona {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    





    private String nombre;
    private String cedula;
    private int edad;
    private String genero;

    public Persona() {

    }
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public Persona(String nombre, String cedula, int edad, String genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
    }

    


////////////////////////////////////////////////////////////////////////////////
    //Get and Set    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String comer() {
        return "La persona " + this.getNombre() + " está comiendo";
    }

    public String descansar() {
        return "La persona " + this.getNombre() + " está descansando";
    }

    public String dormir() {
        return "La persona " + this.getNombre() + " está durmiendo";
    }

/////////////////////////////////////////////////////////////////////////////////
    //To String
    @Override
    public String toString() {
        
        return "Persona:\n{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", genero=" + genero + '}';
    }
}
