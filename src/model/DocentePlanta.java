package model;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class DocentePlanta extends Docente {

    private double salarioBasicoPlanta;
    private int puntosSalariales;
    private double valorPunto;
    private String categoria;
    private String numResolucionNombramiento;
    private String fechaNombramiento;

    public DocentePlanta() {
    }

    public DocentePlanta(double salarioBasicoPlanta, int puntosSalariales, double valorPunto, String categoria, String numResolucionNombramiento, String fechaNombramiento, String nombre, int codigo, String titulo, String departamento) {
        super(nombre, codigo, titulo, departamento);
        this.salarioBasicoPlanta = salarioBasicoPlanta;
        this.puntosSalariales = puntosSalariales;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.numResolucionNombramiento = numResolucionNombramiento;
        this.fechaNombramiento = fechaNombramiento;
    }

    public double getSalarioBasicoPlanta() {
        return salarioBasicoPlanta;
    }

    public void setSalarioBasicoPlanta(double salarioBasicoPlanta) {
        this.salarioBasicoPlanta = salarioBasicoPlanta;
    }

    public int getPuntosSalariales() {
        return puntosSalariales;
    }

    public void setPuntosSalariales(int puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public double getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(double valorPunto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumResolucionNombramiento() {
        return numResolucionNombramiento;
    }

    public void setNumResolucionNombramiento(String numResolucionNombramiento) {
        this.numResolucionNombramiento = numResolucionNombramiento;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public double calcularSalarioPlanta() {
        return salarioBasicoPlanta + (puntosSalariales * valorPunto);
    }
}
