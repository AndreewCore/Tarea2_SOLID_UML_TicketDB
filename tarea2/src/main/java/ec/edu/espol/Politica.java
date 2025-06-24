package src.main.java.ec.edu.espol;

public class Politica {
    private int id;
    private String descripcion;
    private int tiempoLimite;
    private double penalizacion;
    private boolean validacion;
    
    public Politica(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public boolean validar() {
        System.out.println("Validando política: " + descripcion);
        return validacion;
    }
    
    // Getters y setters
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getTiempoLimite() { return tiempoLimite; }
    public void setTiempoLimite(int tiempoLimite) { this.tiempoLimite = tiempoLimite; }
    public double getPenalizacion() { return penalizacion; }
    public void setPenalizacion(double penalizacion) { this.penalizacion = penalizacion; }
}
