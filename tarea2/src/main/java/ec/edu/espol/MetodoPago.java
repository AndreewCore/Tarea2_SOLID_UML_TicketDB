package src.main.java.ec.edu.espol;

public interface MetodoPago {
    boolean procesarPago();
    void seleccionarMetodoPago();
    void devolucion();
    String getMetodoPago();
}
