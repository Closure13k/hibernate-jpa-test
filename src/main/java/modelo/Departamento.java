package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * Pasos:
 *
 * 1. Convertimos la clase en un bean. Ya sabemos qué es esto, aunque no nos
 * dieran su nombre. https://www.arquitecturajava.com/que-es-un-java-bean/
 *
 * 2. Asignamos anotaciones.
 *
 * 3. Registramos las clases en persistence.xml
 */
@Entity
@Table(name = "departamentos")
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "dept_no")
    private Byte dept_no;
    @Column(name = "dnombre")
    private String dnombre;
    @Column(name = "loc")
    private String loc;

    //<editor-fold defaultstate="collapsed" desc="Constructores: () & (Short dept_no, String dnombre, String loc)">
    //Hibernate necesita un constructor vacío.
    public Departamento() {
    }

    //Nuestro constructor.
    public Departamento(Byte dept_no, String dnombre, String loc) {
        this.dept_no = dept_no;
        this.dnombre = dnombre;
        this.loc = loc;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters...">
    /**
     * @return the dept_no
     */
    public Byte getDept_no() {
        return dept_no;
    }

    /**
     * @return the dnombre
     */
    public String getDnombre() {
        return dnombre;
    }

    /**
     * @return the loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * @param dept_no the dept_no to set
     */
    public void setDept_no(Byte dept_no) {
        this.dept_no = dept_no;
    }

    /**
     * @param dnombre the dnombre to set
     */
    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    /**
     * @param loc the loc to set
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Departamento{" + "dept_no=" + dept_no + ", dnombre=" + dnombre + ", loc=" + loc + '}';
    }
}
