import java.time.LocalDate;

public class MetodoTarjeta implements MetodoPago {
    private int id;
    private String tipoTarjeta;
    private String cvv;
    private String numeroTarjeta;
    private LocalDate fechaCaducidad;

    public MetodoTarjeta(int id, String tipoTarjeta, String numeroTarjeta) {
        this.id = id;
        this.tipoTarjeta = tipoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando pago con tarjeta " + tipoTarjeta);
        return validarTarjeta();
    }

    @Override
    public void seleccionarMetodoPago() {
        System.out.println("Tarjeta seleccionada: " + tipoTarjeta);
    }

    @Override
    public void devolucion() {
        System.out.println("Procesando devolución a tarjeta " + tipoTarjeta);
    }

    @Override
    public String getMetodoPago() {
        return "Tarjeta " + tipoTarjeta;
    }

    private boolean validarTarjeta() {
        return numeroTarjeta != null && numeroTarjeta.length() >= 16;
    }
}
