/*
 * 
 */
package ec.edu.ups.clases;




/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Hija 2 de Empleados----------
 */
public final class EmpleadoAsalariado extends Empleados{
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables
    private int horasTrabajo;
    private int codigo;
    private String telefono;
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public EmpleadoAsalariado(String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
    }
////////////////////////////////////////////////////////////////////////////////
    //Get and Set       

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return "EmpleadoAsalariado{" + "horasTrabajo=" + horasTrabajo + ", codigo=" + codigo + ", telefono=" + telefono + '}';
    }
    
}
