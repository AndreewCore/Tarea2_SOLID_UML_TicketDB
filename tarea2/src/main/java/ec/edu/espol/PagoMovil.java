public class PagoMovil implements MetodoPago {
    private int id;
    private String aplicacion;
    private String numeroCelular;

    public PagoMovil(int id, String aplicacion, String numeroCelular) {
        this.id = id;
        this.aplicacion = aplicacion;
        this.numeroCelular = numeroCelular;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando pago móvil con " + aplicacion);
        return true;
    }

    @Override
    public void seleccionarMetodoPago() {
        System.out.println("Pago móvil seleccionado: " + aplicacion);
    }

    @Override
    public void devolucion() {
        System.out.println("Procesando devolución por pago móvil");
    }

    @Override
    public String getMetodoPago() {
        return "Pago Móvil - " + aplicacion;
    }
}
