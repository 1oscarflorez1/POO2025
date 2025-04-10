public class Cliente {

//Atributos
    private String cedula;
    private String nombre;
    private String direccion;
    private int celular;
    private String correo; 
//Constructor
    public Cliente(String cedula, String nombre, String direccion, int celular, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
    }
//Getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }
//Setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}