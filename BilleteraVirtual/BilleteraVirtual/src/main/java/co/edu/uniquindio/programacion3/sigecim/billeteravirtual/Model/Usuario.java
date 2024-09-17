package co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombreCompleto;
    private String idUsuario;
    private String correoElectronico;
    private String numeroTelefonico;
    private String direccion;
    private int saldoDisponible;
    private BilleteraVirtual ownBilleteraVirtual;
    private AsociacionCuentas asociacionCuentas;

    public Usuario(String nombreCompleto, String idUsuario, String correoElectronico,
                   String numeroTelefonico, String direccion, int saldoDisponible,
                   BilleteraVirtual ownBilleteraVirtual, AsociacionCuentas asociacionCuentas) {
        this.nombreCompleto = nombreCompleto;
        this.idUsuario = idUsuario;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
        this.direccion = direccion;
        this.saldoDisponible = saldoDisponible;
        this.ownBilleteraVirtual = ownBilleteraVirtual;
        this.asociacionCuentas = asociacionCuentas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public BilleteraVirtual getOwnBilleteraVirtual() {
        return ownBilleteraVirtual;
    }

    public void setOwnBilleteraVirtual() {
        this.ownBilleteraVirtual = ownBilleteraVirtual;
    }

    public AsociacionCuentas getAsociacionCuentas() {
        return asociacionCuentas;
    }

    public void setAsociacionCuentas(AsociacionCuentas asociacionCuentas) {
        this.asociacionCuentas = asociacionCuentas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", direccion='" + direccion + '\'' +
                ", saldoDisponible=" + saldoDisponible +
                ", ownBilleteraVirtual=" + ownBilleteraVirtual +
                ", asociacionCuentas=" + asociacionCuentas +
                '}';
    }
}