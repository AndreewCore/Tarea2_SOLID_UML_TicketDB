package src.main.java.ec;

import src.main.java.ec.edu.espol.CanalNotificacion;
import src.main.java.ec.edu.espol.Notificacion;

public class Evento {
    private int idEvento;
    private String nombre;
    private String artista;
    private String tipoMusica;
    private String descripcion;
    private int compras;
    private java.time.LocalDateTime fechaHora;
    private String lugar;
    
    public Evento(int idEvento, String nombre, String artista) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.artista = artista;
        this.compras = 0;
    }
    
    public String buscarDorCriterios(String criterio) {
        System.out.println("Buscando eventos por criterio: " + criterio);
        return "Resultados de búsqueda";
    }
    
    public void seleccionarEvento(int idEvento) {
        System.out.println("Evento seleccionado: " + idEvento);
    }
    
    public void actualizarEvento() {
        System.out.println("Actualizando evento: " + nombre);
    }
    
    public void cancelarEvento() {
        System.out.println("Cancelando evento: " + nombre);
    }
    
    public void deleteEvento() {
        System.out.println("Eliminando evento: " + nombre);
    }
    
    public Notificacion obtenerConfiguracion() {
        return new Notificacion(1, "Configuración del evento", CanalNotificacion.EMAIL);
    }
    
    public void establecerLimite() {
        System.out.println("Estableciendo límites para el evento");
    }
    
    public boolean esCompras() {
        return compras > 0;
    }
    
    public void configurarPoliticas(int plazo, double penalizacion, int idEvento) {
        System.out.println("Configurando políticas para evento " + idEvento);
    }
    
    // Getters y setters
    public int getIdEvento() { return idEvento; }
    public String getNombre() { return nombre; }
    public String getArtista() { return artista; }
    public int getCompras() { return compras; }
    public void setCompras(int compras) { this.compras = compras; }

    
}
