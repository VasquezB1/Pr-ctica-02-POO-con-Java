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
 * ----------Class Hija 4 de Profesor----------
 */
public final class ProfesorSustituto extends Profesor implements Interface {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
    private int horasSustituto;
    private String profesorSustituto;
    private int cursoSustituto;
    private double sueldo;

/////////////////////////////////////////////////////////////////////////////////
    //Interface
    @Override
    public String comer() {
       return "La persona " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "La persona " + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "La persona " + this.getNombre() + " está durmiendo";
    }
     public String trabajar() {
        return "La persona " + this.getNombre() + " está trabajando";
    }
      public String moverse(){
        return "La persona " + this.getNombre() + " está moviéndose";
    }
      public String divertirse(){
        return "La persona no profesional " + super.getNombre() + " está escribiendo algo.";
    }
    
    
     
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public ProfesorSustituto(String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
    }
////////////////////////////////////////////////////////////////////////////////
    //Get and Set   

    public int getHorasSustituto() {
        return horasSustituto;
    }

    public void setHorasSustituto(int horasSustituto) {
        this.horasSustituto = horasSustituto;
    }

    public String getProfesorSustituto() {
        return profesorSustituto;
    }

    public void setProfesorSustituto(String profesorSustituto) {
        this.profesorSustituto = profesorSustituto;
    }

    public int getCursoSustituto() {
        return cursoSustituto;
    }

    public void setCursoSustituto(int cursoSustituto) {
        this.cursoSustituto = cursoSustituto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return super.toString()+ "ProfesorSustituto{" + "horasSustituto=" + horasSustituto + ", profesorSustituto=" + profesorSustituto + ", cursoSustituto=" + cursoSustituto + ", sueldo=" + sueldo + '}';
    }
}


