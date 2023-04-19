package model;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class DocenteOcasional extends Docente {

    private double salarioBasico;

    public DocenteOcasional() {
    }

    public DocenteOcasional(double salarioBasico, String nombre, int codigo, String titulo, String departamento) {
        super(nombre, codigo, titulo, departamento);
        this.salarioBasico = salarioBasico;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

}
