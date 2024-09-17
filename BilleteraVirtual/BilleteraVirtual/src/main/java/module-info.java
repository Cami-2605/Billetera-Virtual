module co.edu.uniquindio.programacion3.sigecim.billeteravirtual {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.programacion3.sigecim.billeteravirtual to javafx.fxml;
    exports co.edu.uniquindio.programacion3.sigecim.billeteravirtual;
}