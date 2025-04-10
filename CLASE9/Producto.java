public class Producto {
        //Clase padre para todo tipo de producto
    
//Atributos
    private int numero;
    private int precio;
    private String descripcion;

// Constructor
    public Producto(int numero, int precio, String descripcion) {
        this.numero = numero;
        this.precio = precio;
        this.descripcion = descripcion;
    }
// Getters
    public int getNumero() {
        return numero;
    }
    public int getPrecio() {
        return precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
// Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
    //metodos


