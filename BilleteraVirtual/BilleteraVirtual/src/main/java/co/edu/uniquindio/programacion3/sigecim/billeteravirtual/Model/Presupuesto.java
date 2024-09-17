package co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Model;

public class Presupuesto {
    private String idPresupuesto;
    private int montoTotal;
    private int montoGastado;
    private Categoria categoria;

    public Presupuesto(String idPresupuesto, int montoTotal, int montoGastado,
                       Categoria categoria) {
        this.idPresupuesto = idPresupuesto;
        this.montoTotal = montoTotal;
        this.montoGastado = montoGastado;
        this.categoria = categoria;
    }

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getMontoGastado() {
        return montoGastado;
    }

    public void setMontoGastado(int montoGastado) {
        this.montoGastado = montoGastado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Presupuesto{" +
                "idPresupuesto='" + idPresupuesto + '\'' +
                ", montoTotal=" + montoTotal +
                ", montoGastado=" + montoGastado +
                ", categoria=" + categoria +
                '}';
    }
}