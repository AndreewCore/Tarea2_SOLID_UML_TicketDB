package ec.edu.espol;

public class GestorEventos {
    private java.util.List<Evento> eventos;
    private int id;
    
    public GestorEventos() {
        this.eventos = new java.util.ArrayList<>();
    }
    
    public java.util.List<Evento> getEventos() {
        return eventos;
    }
    
    public void seleccionarEventos(int idEvento) {
        System.out.println("Seleccionando evento con ID: " + idEvento);
    }
    
    public void definirRestricciones() {
        System.out.println("Definiendo restricciones para eventos");
    }
    
    public void configurarPoliticas() {
        System.out.println("Configurando políticas de eventos");
    }
    
    public void obtenerConfiguracion(int idEvento) {
        System.out.println("Obteniendo configuración del evento: " + idEvento);
    }
}
