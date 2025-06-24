public class MetodoTransferencia implements MetodoPago {
    private int id;
    private String numeroCuenta;
    private String cuentaDestino;
    private String tipoCuenta;

    public MetodoTransferencia(int id, String numeroCuenta, String cuentaDestino) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando transferencia de " + numeroCuenta + " a " + cuentaDestino);
        return true;
    }

    @Override
    public void seleccionarMetodoPago() {
        System.out.println("Transferencia bancaria seleccionada");
    }

    @Override
    public void devolucion() {
        System.out.println("Procesando devolución por transferencia");
    }

    @Override
    public String getMetodoPago() {
        return "Transferencia Bancaria";
    }
}
