package ec.edu.espol;

public class Incidente {
    private int id;
    private String descripcion;
    private TipoIncidente estado;
    private java.time.LocalDateTime fechaCreacion;
    private String prioridad;
    private java.util.List<Incidente> accederincidentes;
    private String seleccionarIncidente;
    
    public Incidente(int id, String descripcion, TipoIncidente estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = java.time.LocalDateTime.now();
        this.accederincidentes = new java.util.ArrayList<>();
    }
    
    public void determinarCausa() {
        System.out.println("Determinando causa del incidente: " + descripcion);
    }
    
    public void implementarSolucion(Notificacion notificacion) {
        System.out.println("Implementando solución para incidente " + id);
    }
    
    public void registrarSolucion() {
        System.out.println("Registrando solución del incidente");
    }
    
    public void actualizarEstado(Incidente incidente) {
        System.out.println("Actualizando estado del incidente");
        this.estado = incidente.getEstado();
    }
    
    public void finalizarIncidente(Incidente incidente) {
        System.out.println("Finalizando incidente " + incidente.getId());
    }
    
    public void reabrirIncidente() {
        System.out.println("Reabriendo incidente " + id);
    }
    
    public void clasificarIncidente() {
        System.out.println("Clasificando incidente según prioridad");
    }
    
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public TipoIncidente getEstado() { return estado; }
    public void setEstado(TipoIncidente estado) { this.estado = estado; }
}
