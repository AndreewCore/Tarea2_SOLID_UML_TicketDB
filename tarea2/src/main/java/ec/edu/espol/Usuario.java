package ec.edu.espol;

public class Usuario {
    private int idUsu;
    private String nombre;
    private String email;
    private String telefono;
    
    public Usuario(int idUsu, String nombre, String email) {
        this.idUsu = idUsu;
        this.nombre = nombre;
        this.email = email;
    }
    
    public void login() {
        System.out.println("Usuario " + nombre + " ha iniciado sesión");
    }
    
    public void buscarEventos() {
        System.out.println("Buscando eventos disponibles...");
    }
    
    public void reservarBoletos() {
        System.out.println("Reservando boletos...");
    }
    
    public void realizarPago() {
        System.out.println("Procesando pago...");
    }
    
    // Getters y setters
    public int getIdUsu() { return idUsu; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
