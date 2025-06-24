package src.main.java.ec.edu.espol;

public class AgentesSoporte {
    private int id;
    private String nombre;
    
    public AgentesSoporte(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void login() {
        System.out.println("Agente de soporte " + nombre + " ha iniciado sesión");
    }
    
    public void procesoEnCola() {
        System.out.println("Procesando incidentes en cola");
    }
    
    public void generarReporte(java.util.List<Incidente> incidentes) {
        System.out.println("Generando reporte de " + incidentes.size() + " incidentes");
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
}
