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
 * ----------Class Padre 2----------
 */
public abstract class Profesor extends Persona implements Interface{

////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
    private String materia;
    private String colegio;
    private int codigo;
    private String turno;
    
    public Profesor(){
        
    }
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public Profesor(String materia, String colegio, int codigo, String turno, String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
        this.materia = materia;
        this.colegio = colegio;
        this.codigo = codigo;
        this.turno = turno;
    }

   
////////////////////////////////////////////////////////////////////////////////
    //Get and Set   

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
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
     public String escribir(){
        return "El profesional " + super.getNombre() + " está escribiendo algo.";
    }
    
    public String exponer(){
        return "El profesional " + super.getNombre() + " está exponiendo.";
    }
    
    public String leer(){
        return "El profesional " + super.getNombre() + " está leyendo";
    }
////////////////////////////////////////////////////////////////////////////////   
    /**
     * respondermensajes metodo abstracto
     * @return texto
     */
    public abstract String responderMensajes();
    
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return super.toString() + "\nProfesor:\n{" + "materia=" + materia + ", colegio=" + colegio + ", codigo=" + codigo + ", turno=" + turno + '}';
    }
}
