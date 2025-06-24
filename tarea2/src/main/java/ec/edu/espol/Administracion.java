package ec.edu.espol;

public class Administracion {
    private int id;
    private String nombre;
    
    public Administracion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void escalarIncidente() {
        System.out.println("Escalando incidente a nivel superior");
    }
    
    public void reevaluarSolucion() {
        System.out.println("Reevaluando solución implementada");
    }
    
    public int getId() { return id; }
    public String getNombre() { return nombre; }
}
