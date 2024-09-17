package co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory;

import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Cuenta;
import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Implementacion.CuentaAhorros;
import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Implementacion.CuentaCorriente;

public class CuentaFactory {
    public Cuenta getCuenta(String tipoCuenta) {
        if (tipoCuenta == null) {
            return null;
        }
        if (tipoCuenta.equalsIgnoreCase("AHORROS")) {
            return new CuentaAhorros();
        } else if (tipoCuenta.equalsIgnoreCase("CORRIENTE")) {
            return new CuentaCorriente();
        }
        return null;
    }
}