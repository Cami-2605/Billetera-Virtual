package co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Model;

public class Categoria {
    private String idCategoria;
    private String nombreCategoria;
    private String descripcionBreve;

    public Categoria(String idCategoria, String nombreCategoria,
                     String descripcionBreve) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionBreve = descripcionBreve;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }
}