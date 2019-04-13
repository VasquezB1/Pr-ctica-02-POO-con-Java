/*
 * 
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Hija 1 de Empleados----------
 */
public final class Taxista extends Empleados implements Interface{
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
    private int numeroAuto;
    private int codigo;
    private String turno;
    private String telefono;
////////////////////////////////////////////////////////////////////////////////
   ////////////////////Metodos Abstractos
    
    @Override
    public void comer() {
        System.out.println("Clase Taxista: ");
        System.out.println("\t El taxista " + this.getNombre() + "esta comiendo");
    }

    @Override
    public void descansar() {
       System.out.println("\t El taxista " + this.getNombre() + "esta descansando");
    }

    @Override
    public void dormir() {
       System.out.println("\t El taxista " + this.getNombre() + "esta durmiendo");
    }
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public Taxista(String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
    }
////////////////////////////////////////////////////////////////////////////////
    //Get and Set   

    public int getNumeroAuto() {
        return numeroAuto;
    }

    public void setNumeroAuto(int numeroAuto) {
        this.numeroAuto = numeroAuto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
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
        return "Taxista{" + "numeroAuto=" + numeroAuto + ", codigo=" + codigo + ", turno=" + turno + ", telefono=" + telefono + '}';
    }

    
}
