package co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter;

import java.time.LocalDate;

public class Transaccion {
    private int idTransaccion;
    private LocalDate fecha;
    private int monto;
    private String descripcionBreve;

    public Transaccion(int idTransaccion, LocalDate fecha, int monto,
                       String descripcionBreve) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.monto = monto;
        this.descripcionBreve = descripcionBreve;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }
}