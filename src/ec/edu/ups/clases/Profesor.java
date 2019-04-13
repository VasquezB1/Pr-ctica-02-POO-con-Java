/*
 *
 */
package ec.edu.ups.clases;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Padre 2----------
 */
public abstract class Profesor extends Persona{
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

    public Profesor(String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
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
    //To String

    @Override
    public String toString() {
        return "Profesor{" + "materia=" + materia + ", colegio=" + colegio + ", codigo=" + codigo + ", turno=" + turno + '}';
    }

    
}
