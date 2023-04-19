package model;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class DocenteCatedratico extends Docente {

    private String numContrato;
    private int numHorasSemanal;
    private double valorHora;
    private String categoria;

    public DocenteCatedratico() {
    }

    public DocenteCatedratico(String numContrato, int numHorasSemanal, String categoria, String nombre, int codigo, String titulo, String departamento) {
        super(nombre, codigo, titulo, departamento);
        this.numContrato = numContrato;
        this.numHorasSemanal = numHorasSemanal;
        this.categoria = categoria;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public int getNumHorasSemanal() {
        return numHorasSemanal;
    }

    public void setNumHorasSemanal(int numHorasSemanal) {
        this.numHorasSemanal = numHorasSemanal;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double salarioCatedratico() {

        switch (categoria) {
            case "Auxiliar":
                valorHora = 20000;
                break;
            case "Asistente":
                valorHora = 30000;
                break;
            case "Asocuado":
                valorHora = 30000;
                break;
            default:
                throw new AssertionError();
        }
        
    

        return numHorasSemanal * valorHora;
    }

}
