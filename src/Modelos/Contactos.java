
package Modelos;


public class Contactos {
    String Apellidos;
    String Nombre;
    String Telefono;

    public Contactos(String Apellidos, String Nombre, String Telefono) {
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
}
