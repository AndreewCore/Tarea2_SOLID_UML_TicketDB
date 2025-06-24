public interface MetodoPago {
    boolean procesarPago();
    void seleccionarMetodoPago();
    void devolucion();
    String getMetodoPago();
}
