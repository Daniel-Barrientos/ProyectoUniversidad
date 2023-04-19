
package model;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Docente {
    
    private String nombre;
    private int codigo;
    private String titulo;
    private String departamento;

    public Docente() {
    }

    public Docente(String nombre, int codigo, String titulo, String departamento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    

}
