package src.main.java.ec.edu.espol;

public class Boleto {
    private int id;
    private TipoBoleto tipo;
    private double precio;
    private boolean disponibilidad;
    private EstadoBoleto estado;
    
    public Boleto(int id, TipoBoleto tipo, double precio) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.disponibilidad = true;
        this.estado = EstadoBoleto.DISPONIBLE;
    }
    
    public boolean reservar() {
        if (disponibilidad && estado == EstadoBoleto.DISPONIBLE) {
            estado = EstadoBoleto.RESERVADO;
            disponibilidad = false;
            System.out.println("Boleto " + id + " reservado exitosamente");
            return true;
        }
        return false;
    }
    
    public void actualizarBoleto() {
        System.out.println("Actualizando información del boleto " + id);
    }
    
    public java.util.List<Boleto> getBoletos() {
        // Simulación de retorno de lista de boletos
        return new java.util.ArrayList<>();
    }
    
    // Getters y setters
    public int getId() { return id; }
    public TipoBoleto getTipo() { return tipo; }
    public double getPrecio() { return precio; }
    public boolean isDisponibilidad() { return disponibilidad; }
    public EstadoBoleto getEstado() { return estado; }
    public void setEstado(EstadoBoleto estado) { this.estado = estado; }
}


