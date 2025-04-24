//extends para crear herencia desde producto
public class Camara extends Producto {
    // "Es un" producto por lo
    // tanto tiene una relacion
    // de herencia fuerte con producto

// Atributos
    private String marca;
    private String modelo;
    private String color;
// Constructor
    public Camara(int numero, int precio, String descripcion, String marca, String modelo, String color) {
        super(numero, precio, descripcion);
        this.marca = marca;
        this.modelo = modelo;  
        this.color = color;     
    }
//Getters
    public String getMarca() {
        return marca;    
    }
        public String getModelo() {
        return modelo;    
    }
    public String getColor() {
        return color;    
    }
//Setters
    public void setMarca(String marca) {
        this.marca = marca;    
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;  
    }
    public void setColor(String color) {
        this.color = color;  
    }
// metodos
    public void print() {
        System.out.println("- Camara de marca: " + marca + "de modelo: " + modelo + " y color " + color);
    }
}
