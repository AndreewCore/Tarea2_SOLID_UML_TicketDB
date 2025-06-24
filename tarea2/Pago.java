import java.time.LocalDateTime;

public class Pago implements MetodoPago {
    private int id;
    private LocalDateTime fechaCompra;
    private String metodoPago;

    public Pago(int id, String metodoPago) {
        this.id = id;
        this.metodoPago = metodoPago;
        this.fechaCompra = LocalDateTime.now();
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando pago con método: " + metodoPago);
        return true;
    }

    @Override
    public void seleccionarMetodoPago() {
        System.out.println("Método de pago seleccionado: " + metodoPago);
    }

    @Override
    public void devolucion() {
        System.out.println("Procesando devolución");
    }

    @Override
    public String getMetodoPago() {
        return metodoPago;
    }

    public void getMetodoPago(String metodo) {
        this.metodoPago = metodo;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }
}
