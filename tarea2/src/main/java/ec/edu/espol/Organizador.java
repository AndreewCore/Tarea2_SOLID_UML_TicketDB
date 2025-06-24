package src.main.java.ec.edu.espol;

public class Organizador {
        private int id;
    private String nombre;
    private String empresa;
    private String contactoCorreo;

    public Organizador(int id, String nombre, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
    }
    
    public void login() {
        System.out.println("Organizador " + nombre + " ha iniciado sesión");
    }
    
    public void accesarGestor() {
        System.out.println("Accediendo al gestor de eventos...");
    }
    
    // Getters y setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmpresa() { return empresa; }
    public String getContactoCorreo() { return contactoCorreo; }
    public void setContactoCorreo(String contactoCorreo) { this.contactoCorreo = contactoCorreo; }

}
