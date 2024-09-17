package co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory;

import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Implementacion.Deposito;
import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Implementacion.Retiro;
import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Implementacion.Transferencia;
import co.edu.uniquindio.programacion3.sigecim.billeteravirtual.Factory.Inter.Transaccion;

public class TransaccionFactory {
    public Transaccion getTransaccion(String tipoTransaccion) {
        if (tipoTransaccion == null) {
            return null;
        }
        if (tipoTransaccion.equalsIgnoreCase("DEPOSITO")) {
            return new Deposito();
        } else if (tipoTransaccion.equalsIgnoreCase("RETIRO")) {
            return new Retiro();
        } else if (tipoTransaccion.equalsIgnoreCase("TRANSFERENCIA")) {
            return new Transferencia();
        }
        return null;
    }
}