package co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Model;

import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Cuenta;

public class AsociacionCuentas {
    Usuario usuario;
    Cuenta cuenta;

    public AsociacionCuentas(Usuario usuario, Cuenta cuenta) {
        this.usuario = usuario;
        this.cuenta = cuenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}