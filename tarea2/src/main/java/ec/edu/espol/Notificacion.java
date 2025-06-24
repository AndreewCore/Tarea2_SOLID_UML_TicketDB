package src.main.java.ec.edu.espol;

public class Notificacion {
    private int id;
    private String mensaje;
    private CanalNotificacion canal;
    private java.time.LocalDateTime fechaEnvio;
    private boolean leido;
    
    public Notificacion(int id, String mensaje, CanalNotificacion canal) {
        this.id = id;
        this.mensaje = mensaje;
        this.canal = canal;
        this.fechaEnvio = java.time.LocalDateTime.now();
        this.leido = false;
    }
    
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje + " por " + canal);
        this.leido = true;
    }
    
    // Getters y setters
    public int getId() { return id; }
    public String getMensaje() { return mensaje; }
    public CanalNotificacion getCanal() { return canal; }
    public boolean isLeido() { return leido; }
    public void setLeido(boolean leido) { this.leido = leido; }
}
